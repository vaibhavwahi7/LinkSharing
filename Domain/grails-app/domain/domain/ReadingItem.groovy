package domain

class ReadingItem {

    User user
    Resource resource
    Boolean isRead
    Date dateCreated
    Date lastUpdated



    static constraints = {
        user(nullable: false)
        isRead(nullable: false)
        resource(nullable: false,unique: 'resource')

    }
}
