package linksharing

import viewObject.linksharing.TopicVO


class Topic {

    String name
    User createdBy
    Date dateCreated
    Date lastUpdated
    Visibility visibility

    static mapping = {
        sort("name": "asc")
    }
    static belongsTo = [createdBy: User]
    static hasMany = [subscriptions: Subscription, resources: Resource]
    static constraints = {

        name(nullable: false, blank: false, unique: 'createdBy')
        visibility(nullable: false)
        createdBy(nullable: false)
    }
    static List<TopicVO> getTrendingTopics(){
        List topicList = Resource.createCriteria().list {
            projections {
                createAlias('topic', 't')
                groupProperty('t.id')
                property('t.name')
                property('t.visibility')
                count('t.id', 'topicCount')
                property('t.createdBy')
            }
            eq('t.visibility',Visibility.PUBLIC)
            order('topicCount', 'desc')
            order('t.name', 'asc')
            maxResults(5)
        }
        //  return topics


        List topicVOList = []
        topicList.each {

            topicVOList.add(new TopicVO(id: it[0], name: it[1], visibility: it[2], count: it[3], createdBy: it[4]))


        }
        return topicVOList



    }


}
