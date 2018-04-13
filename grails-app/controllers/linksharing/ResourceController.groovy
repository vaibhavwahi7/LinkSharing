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

    def addToReadingItems(Resource resource) {

        ReadingItem readingItem
        Topic topic = resource.topic
        List<User> subscribedUsers = topic.getSubscribedUsers()
        subscribedUsers.each { user ->
            if (user.id == resource.user.id) {
                readingItem = new ReadingItem(user: user, resource: resource, isRead: true)
            } else {
                readingItem = new ReadingItem(user: user, resource: resource, isRead: false)
            }
            if (readingItem.save(flush: true)) {
                log.info "ReadingItem added successfully"
            }

        }


    }




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

    def check() {
        Resource resources = Resource.get(session.user.id)
        String resource = Resource.resourceCheck(session.user.id)
        String url = resources.url
        if (resource == "class is LinkResource") {
            redirect(URL: url)
        } else {
            render(URL: url)
        }
    }

    def edit() {
        render(view: '_edit')
    }

    def getRecentShares() {
        List<Resource> resources = Resource.getRecentShares()
        return resources
    }
    def getPost() {
        List<Resource> resources = Resource.getPosts()
        render(view: '/resource/index', model: [resources1: resources])

    }


    def deleteResource()
    {
        log.info "Resource deleted Successfully"
    }
}
