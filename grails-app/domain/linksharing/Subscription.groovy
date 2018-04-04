package linksharing


class Subscription {

    Topic topic
    User user
    Seriousness seriousness
    Date dateCreated

    static mapping = {
        seriousness defaultValue: Seriousness.SERIOUS
        topic fetch: 'join'
        user fetch: 'join'
    }
    static belongsTo = [topic: Topic, user: User]

    static constraints = {

        user(nullable: false)
        topic(nullable: false, unique: 'user')
        seriousness(nullable: false)
    }

    def showUser()
    {
        List<User> userList=[]
        this.user.each {
            userList.add(it.userName)
        }
    }

}
