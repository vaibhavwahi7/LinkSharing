package domain

class Subscription {


    Seriousness seriousness
    Date dateCreated
    Date lastUpdated


    static belongsTo = [topic: Topic,user: User]
    static constraints = {

        user(nullable: false)
        topic(nullable: false,unique: 'user')
        seriousness(nullable: false)
    }
}
