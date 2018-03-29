package domain

class LinkResource extends Resource{

    List<ResourceRating> resourceRating
    Date dateCreated
    Date lastUpdated


    static hasMany = [resourceRating:ResourceRating]
    String url
    static constraints = {
        url(url: true)
    }
}
