package linksharing

import javax.jws.soap.SOAPBinding

class ReadingItem {

    Resource resource
    User user
    Boolean isRead

    static belongsTo = [user: User, resource: Resource]
    static constraints = {

        user(nullable: false)
        isRead(nullable: false)
        resource(nullable: false, unique: 'resource')

    }
}
