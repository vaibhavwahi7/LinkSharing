package linksharing

abstract class Resource {

    String description
<<<<<<< HEAD
    User user
=======
    User createdBy
>>>>>>> 68d395611bd1124a83bb0662d91e33d1ea78843d
    Topic topic
    Date dateCreated
    Date lastUpdated

    static hasMany = [ratings: ResourceRating,readingItem: ReadingItem]
<<<<<<< HEAD
    static belongsTo = [user:User,topic:Topic]
=======
>>>>>>> 68d395611bd1124a83bb0662d91e33d1ea78843d
    static mapping = {
        description sqlType: "text"
    }
    static constraints = {
    }
}
