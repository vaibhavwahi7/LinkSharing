package linksharing

import javax.jws.soap.SOAPBinding

class ResourceRating {

    Resource resource
    User user
    Integer score
    User createdBy

    static constraints = {

        score(nullable:false,range: 1..5)
        user(nullable: false)
        resource(nullable: false,unique: 'user')
        createdBy(nullable: false   )

    }
}
