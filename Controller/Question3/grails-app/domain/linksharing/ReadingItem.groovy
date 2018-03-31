package linksharing

import javax.jws.soap.SOAPBinding

class ReadingItem {

    Resource resource
    User user
    Boolean isRead

<<<<<<< HEAD
    static belongsTo = [user:User,resource:Resource]
=======
>>>>>>> 68d395611bd1124a83bb0662d91e33d1ea78843d
    static constraints = {

        user(nullable: false)
        isRead(nullable: false)
        resource(nullable: false,unique: 'resource')

    }
}
