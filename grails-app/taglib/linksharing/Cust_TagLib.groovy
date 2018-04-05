package linksharing

class Cust_TagLib {
//    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
    static tags = [taglib: 'mark']

    static namespace = 'ls'
    def mark = { attrs, body ->

        def isRead = attrs?.id
        if (session.user != null) {
            render "tag" $ { isRead }
            Integer id = session.user.id
            User user = new User.get(id)
            Resource resource = Resource.get(isRead)
            ReadingItem readingItem = ReadingItem.findAllByResource(resource)
            readingItem.each = {
                if (it.user == user) {
                    out << "<a href='#' >Read</a>"
                } else {
                    out << "<a href='#'>Unread</a>"
                }

            }


        } else {
            render "Session does not exist"
        }

    }
}

