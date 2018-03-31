package linksharing


class Topic {

    String name
    User createdBy
    Date dateCreated
    Date lastUpdated
    Visibility visibility


<<<<<<< HEAD
    static belongsTo = [ createdBy : User]
=======

>>>>>>> 68d395611bd1124a83bb0662d91e33d1ea78843d
    static hasMany = [subscriptions:Subscription, resources: Resource]
    static constraints = {

        name(nullable: false ,blank:false, unique: 'createdBy')
        visibility(nullable:false)
        createdBy(nullable: false)
    }
}
