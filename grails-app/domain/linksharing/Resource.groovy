package linksharing


import co.linksharing.ResourceSearchCo
import viewObject.linksharing.RatingInfoVo

import javax.annotation.Resources


abstract class Resource {

    String description
    User user
    Topic topic
    Date dateCreated
    Date lastUpdated
    RatingInfoVo ratingInfoVO

    static transients = ['ratingInfoVO']
    static hasMany = [resourceRatings: ResourceRating, readingItem: ReadingItem]
    static belongsTo = [user: User, topic: Topic]
    static mapping = {
        description sqlType: "text"
    }
    static constraints = {
    }

    static namedQueries = {
        search {
            ResourceSearchCo resourceSearchCO ->
                if (resourceSearchCO.topicId)
                    eq('topic.id', resourceSearchCO.topicId)
                if (resourceSearchCO.visibility)
                    eq('topic.visibility', resourceSearchCO.visibility)

        }
    }


    Integer totalVotes(Resource resource) {
        Integer votes = ResourceRating.createCriteria().count() {

            eq("resource", resource)
        }

        return votes
    }

    def avgScore(Resource resource) {
        def average = ResourceRating.createCriteria().get {
            projections {
                avg('score')
            }
            eq("resource", resource)
        }

        return average

    }

    def totalScore(Resource resource) {
        def sum1 = ResourceRating.createCriteria().get() {

            projections {
                sum('score')
            }
            eq("resource", resource)
        }

        return sum1
    }

    RatingInfoVo setRatingInfo(Resource resource) {
        RatingInfoVo ratingInfoVO1 = new RatingInfoVo()
        ratingInfoVO1.averagescore = avgScore(resource)
        ratingInfoVO1.totalScore = totalScore(resource)
        ratingInfoVO1.totalVotes = totalVotes(resource)
        return ratingInfoVO1
    }

    static List<Resource> topPost() {

        List resourceIds = ResourceRating.createCriteria().list {
            projections {
                property('resource.id')
            }
            groupProperty('resource.id')
            count('resource.id', 'resourceCount')
            order('resourceCount', 'desc')
            maxResults(4)
        }

        List<Resource> resources = Resource.getAll(resourceIds)
        return resources
    }

    static List<Resource> getPosts(User user) {
        List<Resource> resourceList = Resource.createCriteria().list {
            eq("user", user)
        }
        println resourceList
        println("==========================")
        return resourceList
    }

 static String resourceCheck(Long id) {

     Resource resources = Resource.get(id)

     if (resources.class.toString().equals("class linksharing.DocumentResource")) {
         println resources.class.toString()
         return "class is DocumentResource"

     } else {
         println resources.class.toString()
         return "class is LinkResource"
     }

 }

    static List<Resource> getRecentShares(){

        List<Resource> recentShares = Resource.createCriteria().list {
// eq('',Visibility.PUBLIC)
            order("dateCreated", "desc")
            maxResults(2)


        }
        println("about to return")
        println(recentShares)
        return recentShares
    }
}
