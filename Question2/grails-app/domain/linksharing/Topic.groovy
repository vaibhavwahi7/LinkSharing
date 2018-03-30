package linksharing


class Topic {

    String name
    User createdBy
    Date dateCreated
    Date lastUpdated
    Visibility visibility



    static hasMany = [subscriptions:Subscription, resources: Resource]
    static constraints = {

        name(nullable: false ,blank:false, unique: 'createdBy')
        visibility(nullable:false)
        createdBy(nullable: false)
    }
}
