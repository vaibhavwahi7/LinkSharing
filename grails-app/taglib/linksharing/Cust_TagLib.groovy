package linksharing

import grails.gsp.PageRenderer
import grails.util.Holders
import viewObject.linksharing.TopicVO

class Cust_TagLib {
// static defaultEncodeAs = [taglib:'html']
//static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
    static tags = [taglib: 'mark', taglib: 'topic_read', taglib: 'trending', taglib: 'top',taglib:'userImage']

    static namespace = 'ls'


    def readLink = { attr, body ->
        Resource resource = Resource.get(attr.read)
        ReadingItem readingItem = ReadingItem.findByResource(resource)

        String value = ""
        if  (readingItem && readingItem?.isRead) {
            value = "Mark As Unread"
        } else {
            value = "Mark As Read"

        }
        out << value
    }

    def showSubscribe = {
        attr, body ->

            boolean isSubscribed = User.isSubscribed(attr.topic)
            String value = ""
            if (isSubscribed) {
                value = "UnSubscribe"
            } else {
                value = "Subscribe"

            }
            out << value

    }


    def subscriptionCount = {
        attr, body ->

            Integer count = 0
            List listOfSubscriptions = []
            if (attr.topic) {

                listOfSubscriptions = Subscription.findByTopic(attr.topic)
                return listOfSubscriptions.size()

            } else {

                listOfSubscriptions = Subscription.findByUser(session.user)
                return listOfSubscriptions.size()
            }


    }


    def resourceCount = {
        attr, body ->

            return Resource.countByTopic(attr.topic)
    }


    def topicCount = {
        attr, body ->
            return Topic.countByCreatedBy(session.user)
    }


    PageRenderer getGroovyPageRenderer() {
        Holders.applicationContext.getBean(PageRenderer)

    }


    String createHtmlStringForTrendingTopic(List<TopicVO> topicVO) {
//        getGroovyPageRenderer().render(view: '/user/trend', model: [topic1: topicVO])
        g.render(view: '/user/trend', model: [topic1: topicVO])
    }

    def trending = { attr, body ->
        List<TopicVO> topicVO = Topic.getTrendingTopics()

        return createHtmlStringForTrendingTopic(topicVO)
    }

    def top = { attr, body ->

        List<Resource> resources = Resource.topPost()
        body << resources?.collect { it?.id }
        out << resources
    }

    def resourceCheck=
    {attr,body->
        List<Resource> resources=Resource.get(Resource.class)

    }

    def userImage = { attrs, body ->
        out << "<img src='${createLink(controller: 'login', action: 'fetchProductImage', params: [userId: attrs?.id])}' " +
                " height='${attrs.height}' width='${attrs?.width}'>"
    }
}