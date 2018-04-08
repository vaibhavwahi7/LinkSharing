package linksharing

class ReadingItemController {

    def index() {}


    def changeIsRead() {
        Resource resource = Resource.get(params.id)
        ReadingItem readingItem = ReadingItem.findByResourceAndUser(resource, session.user)
        if (readingItem) {
            readingItem.isRead = false
            readingItem.save()
        } else {
            new ReadingItem(user: session.user, resource: resource, isRead: true).save()

        }
        render(view: "/resource/search")
    }
}