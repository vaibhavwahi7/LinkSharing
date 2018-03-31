package linksharing

import com.sun.org.apache.xpath.internal.operations.Bool

import java.beans.Transient

class User {

    String email
    String userName
    String password
    String confirmPassword
    String firstName
    String lastName
    Byte photo
    Boolean admin
    Boolean active
    Date dateCreated
    Date lastUpdated



<<<<<<< HEAD
    static hasMany = [topics:Topic, subscriptions: Subscription, readingItem: ReadingItem, resources: Resource, resourceRating: ResourceRating]
=======
    static hasMany = [topics:Topic, subscriptions: Subscription, readingItem: ReadingItem, resources: Resource]
>>>>>>> 68d395611bd1124a83bb0662d91e33d1ea78843d
    static transients =['name']
    static constraints = {

        email(nullable: false,unique: true,email: true,blank: false)
        password(nullable:false, blank: false, size: 5..15)
        firstName(nullable: false,blank: false)
        lastName(nullable: false,blank: false)
        confirmPassword(nullable: true,blank: false)
        photo(nullable:true, sqlType: 'longblob')
        admin(nullable:true)
        userName(nullable: true,unique: true)

    }
}
