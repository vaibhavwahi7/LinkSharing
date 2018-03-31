package linksharing

<<<<<<< HEAD
=======
import javax.jws.soap.SOAPBinding
>>>>>>> 68d395611bd1124a83bb0662d91e33d1ea78843d

class ResourceRating {

    Resource resource
    User user
    Integer score
    User createdBy
    static belongsTo = [resource:Resource,user:User]
    static constraints = {

        score(nullable:false,range: 1..5)
        user(nullable: false)
        resource(nullable: false,unique: 'user')
<<<<<<< HEAD
        createdBy(nullable: false)
=======
        createdBy(nullable: false   )
>>>>>>> 68d395611bd1124a83bb0662d91e33d1ea78843d

    }
}
