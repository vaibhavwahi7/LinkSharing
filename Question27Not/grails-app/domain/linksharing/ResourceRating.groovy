package linksharing


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
        createdBy(nullable: false)

    }
}
