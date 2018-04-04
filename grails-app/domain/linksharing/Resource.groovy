package linksharing


import co.linksharing.ResourceSearchCo
import viewObject.linksharing.RatingInfoVo


abstract class Resource {

    String description
    User user
    Topic topic
    Date dateCreated
    Date lastUpdated
    RatingInfoVo ratingInfoVO

    static transients = ['ratingInfoVO']
    static hasMany = [ratings: ResourceRating, readingItem: ReadingItem]
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
//                if (resourceSearchCO.visibility)
//                    eq('topic.visibility', resourceSearchCO.visibility)

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

    List<Resource> topPost(){

        List resourceIds = ResourceRating.createCriteria().list {
            projections {
                property('resource.id')
            }
            groupProperty('resource.id')
            count('resource.id', 'resourceCount')
            order('resourceCount', 'desc')
            maxResults(5)
        }

        List<Resource> resources = Resource.getAll(resourceIds)
        return resources



    }


}
