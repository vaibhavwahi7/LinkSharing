package linksharing

import javax.jws.soap.SOAPBinding

class Subscription {

    Topic topic
    User user
    Seriousness seriousness
    Date dateCreated

<<<<<<< HEAD
    static belongsTo = [topic:Topic,user:User]

=======
>>>>>>> 68d395611bd1124a83bb0662d91e33d1ea78843d
    static constraints = {

            user(nullable: false)
            topic(nullable: false,unique: 'user')
            seriousness(nullable: false)
        }

}
