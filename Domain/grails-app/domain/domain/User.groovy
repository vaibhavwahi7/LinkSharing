package domain

import javax.persistence.Transient

class User {

    String firstname
    String lastname
    Date dateCreated
    Date lastUpdated

    String email
    String password
    String confirmpassword
    String username
    String photo
    String admin
    Boolean active
    String name

    List<Topic> topics
    List<Subscription> subscriptions
    List<Resource> resource
    List<LinkResource> linkResource
    List<ResourceRating> resourceRating
    List<ReadingItem> readingItem

    static transients = ['name']
    static hasMany = [topics: Topic,subscriptions:Subscription,resource: Resource,linkResource:LinkResource,resourceRating:ResourceRating,readingItem:ReadingItem]
    static constraints = {

        email(nullable: false,unique: true,email: true,blank: false)
        password(nullable:false, blank: false, size: 5..15)
        firstname(nullable: false,blank: false)
        lastname(nullable: false,blank: false)
        confirmpassword(nullable: true,blank: false)
        active(nullable:true)
        photo(nullable:true, sqlType: 'longblob')
        admin(nullable:true)
        username(nullable: true,unique: true)


    }






}
