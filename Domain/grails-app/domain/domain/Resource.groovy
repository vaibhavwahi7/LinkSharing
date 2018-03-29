package domain




abstract class Resource {

    String decription
    User createdBy
    Topic topic
    Date dateCreated
    Date lastUpdated


    List<ReadingItem> readingItem
    static hasMany = [readingItem: ReadingItem,rating: ResourceRating]
    static belongsTo = [topic: Topic,createdBy: User]
    static mapping = {
        decription sqlType: "text"
    }
    static constraints = {
    }
}
