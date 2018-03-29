package domain

class Topic {


    String name

    Date dateCreated
    Date lastUpdated
    Visibility visibility
    List<Resource> resource
    List<LinkResource> linkResource

    static belongsTo = [ createdBy : User]
    static hasMany = [subscriptions: Subscription,resource:Resource,linkResource: LinkResource]
    static constraints = {

        name(nullable: false,unique: 'createdBy' ,blank:false)
        createdBy(nullable: false)
        visibility(nullable:false)

    }
}
