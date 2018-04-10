package linksharing

class SubscriptionController {

    def index() {}

    def save(Integer id) {

        Topic topic = Topic.get(id)
        Subscription subscription = new Subscription(user: session.user, topic: topic)
        if (subscription.save())
            render("success")
        else
            render("error")

    }

    def delete(Integer id) {
        Subscription subscription = Subscription.get(id)
        if (subscription) {
            Subscription.deleteAll(subscription)
            render("Success")
            render (view:'/login/index')
        } else {
            render("Error")
        }

    }

    def update(Integer id, String serious) {
        Subscription subscription = Subscription.findBySeriousness(Seriousness.SERIOUS)
        if (subscription != null) {
            subscription.save()
            render "success"
            render (view:'/login/index')

        } else {
            render "errors"
        }
    }


}
