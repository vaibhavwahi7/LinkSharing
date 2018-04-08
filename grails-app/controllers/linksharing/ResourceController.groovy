package linksharing

import co.linksharing.ResourceSearchCo
import co.linksharing.SearchCO

import viewObject.linksharing.RatingInfoVo

class ResourceController {

    def index() {

    }

    def delete(Integer id) {
        Resource resource = Resource.load(id)

    }

//    def objectNotFound(Exception e) {
//        render "object not found handled"
//    }

    def search() {
        ResourceSearchCo resourceSearchCO = new ResourceSearchCo()
        if (resourceSearchCO.q)
            resourceSearchCO.visibility = Visibility.PUBLIC
    }
//    def show(Integer id){                                Q4
//        Resource resource=Resource.get(id)
//        SearchCO searchCO=new SearchCO(q:"vaibahv")
//        RatingInfoVo ratingInfoVO= resource.getRatingInfoVO(resource)
//        println ("${resource.topPost()}")
//        println ("${session.user.getUnreadResource(searchCO)}")
//        render(ratingInfoVO.averagescore)
//    }
//    def show(Integer id){                                     Q5
//        Resource resource=Resource.get(id)
//        RatingInfoVo ratingInfoVO= resource.getRatingInfoVo(resource)
//        println ("------------ ${resource.topPost()}")
//
//        render(ratingInfoVO.averagescore)
//        // println Topic.getTrendingTopics()
//    }
    def show(Integer id) {
        Resource resource = Resource.get(id)
        SearchCO searchCO = new SearchCO(q: "value")
        RatingInfoVo ratingInfoVO = resource.getRatingInfoVo(resource)
        println("${resource.topPost()}")
        println("${session.user.getUnreadResource(searchCO)}")
        render(ratingInfoVO.averagescore)
    }

//    def showTopPost(){
//        List<Resource> resources = Resource.topPost()
////        render("Vaibhav --- ${resources}")
//        render ( view: '/login/index', model: [resources1:resources])
//    }


    static List<Resource> showPost() {

        List resourceIds = ResourceRating.createCriteria().list {
            projections {
                property('resource.id')
            }
            maxResults(4)
        }
        List<Resource> resources = Resource.getAll(resourceIds)
        return resources
    }

    def changeIsRead() {
        Resource resource = Resource.get(params.id)
        println params.id
        println "======================a"
        ReadingItem readingItem = ReadingItem.findByResource(resource)
        if (readingItem) {
            readingItem.isRead = false
            readingItem.save()
            println "======================b"
        } else {
            new ReadingItem(resource: resource, isRead: true).save()

        }
        render(view: "/resource/index")
    }

}
