package domain

class DocumentResource extends Resource {

    String filepath
    Date dateCreated
    Date lastUpdated


    static constraints = {
        filepath(blank: false,nullable: false)
    }
}
