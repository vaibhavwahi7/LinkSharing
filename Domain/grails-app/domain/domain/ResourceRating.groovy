package domain

class ResourceRating {

    User user
    int score
    Date dateCreated
    Date lastUpdated


    Resource resource


    static belongsTo=[user:User,resource:Resource]
    static constraints = {
        score(nullable:false,range: 1..5)
        user(nullable: false)
        resource(nullable: false,unique: 'user')

    }
}
