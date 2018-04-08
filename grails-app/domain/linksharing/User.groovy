package linksharing

import co.linksharing.SearchCO
import com.sun.org.apache.xpath.internal.operations.Bool
import viewObject.linksharing.TopicVO

import javax.naming.ldap.SortKey
import javax.persistence.criteria.JoinType
import java.beans.Transient

class User {

    String email
    String userName
    String password
    String confirmPassword
    String firstName
    String lastName
    byte[] photo
    Boolean admin
    Boolean active
    Date dateCreated
    Date lastUpdated


    static mapping = { sort id: 'desc' }

    static hasMany = [topics: Topic, subscriptions: Subscription, readingItem: ReadingItem, resources: Resource, resourceRating: ResourceRating]
    static transients = ['name', 'subscribedTopic']

    static constraints = {

        email(nullable: false, unique: true, email: true, blank: false)
        password(nullable: false, blank: false, size: 5..15)
        firstName(nullable: false, blank: false)
        lastName(nullable: false, blank: false)
        confirmPassword(nullable: true, blank: false)
        photo(nullable: true, sqlType: 'longblob')
        admin(nullable: true)
        userName(nullable: true, unique: true)

    }


    List getUnreadResource(SearchCO searchCO) {

        if (searchCO.q) {
            List<ReadingItem> unReadItems = ReadingItem.createCriteria().list(max: 10, offset: 0) {
                ilike('resource.description', this.resources.description)
                eq('isRead', false)
            }
            return unReadItems
        }

    }
//Question13. Create transient method in user domain getSubscribedTopic to get only subscribed topics of user,
//            this method will be used in user dashboard and dropdown of linkresource create
//            and email invite of topic.


    List getSubscribedTopic() {
        List<Topic> topicList = []
        this.subscriptions.each {
            topicList.add(it.topic)
        }
        return topicList
    }

}
