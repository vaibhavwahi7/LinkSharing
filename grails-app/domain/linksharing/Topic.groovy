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

    //Question11. Create static method in topic to get trending topic which will be used
    //            on user dashboard as well as resource show action

    //Question12:Add createdBy in topicVO so that createdBy can be shown in trending topic
    //           list on UI
    static List<TopicVO> getTrendingTopics() {
        List topicList = Resource.createCriteria().list {
            projections {
                createAlias('topic', 't')
                groupProperty('t.id')
                property('t.name')
                property('t.visibility')
                count('t.id', 'topicCount')

            }
            eq('t.visibility', Visibility.PUBLIC)
            order('topicCount', 'desc')
            order('t.name', 'asc')
            maxResults(5)
        }
        List topicList1 = []
        topicList.each {
            topicList1.add(new TopicVO(id: it[0], name: it[1], visibility: it[2], count: it[3]))
        }
        println(topicList1)
        return topicList1
    }
//Question18. Create transient method getSubscribedUsers in topic domain to get all the
//            subscribed users


    static isPublic(Long id)
    {
        Topic topic=Topic.get(id)
        if(topic.visibility.toString().equals("Public"))
        {
            return (topic.visibility.toString())
        }
        else
        {
            return (topic.visibility.toString())
        }
    }

    List<User> getSubscribedUsers() {
        Subscription.createCriteria().list {
            projections {
                property('user')
            }
            eq('topic.id', this.id)
        }
    }


}
