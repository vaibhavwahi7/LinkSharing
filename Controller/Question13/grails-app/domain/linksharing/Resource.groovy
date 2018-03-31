package linksharing

abstract class Resource {

    String description
    User user
    Topic topic
    Date dateCreated
    Date lastUpdated

    static hasMany = [ratings: ResourceRating,readingItem: ReadingItem]
    static belongsTo = [user:User,topic:Topic]
    static mapping = {
        description sqlType: "text"
    }
    static constraints = {
    }
}
