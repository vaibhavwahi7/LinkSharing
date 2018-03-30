package linksharing

import javax.jws.soap.SOAPBinding

class Subscription {

    Topic topic
    User user
    Seriousness seriousness
    Date dateCreated

    static belongsTo = [topics:Topic,user:User]

    static constraints = {

            user(nullable: false)
            topic(nullable: false,unique: 'user')
            seriousness(nullable: false)
        }

}
