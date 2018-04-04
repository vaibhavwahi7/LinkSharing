package linksharing

class SubscriptionController {

    def index() {}

    def save(Long id) {
        Topic topic = Topic.read(id)
        Subscription subscription = new Subscription(user: session.user, topic: topic)
        if (subscription.save()) {
            render "save successful"
        } else {
            render "failure"
        }
    }

    def delete(Integer id) {
        Subscription subscription = Subscription.load(id)
        if (subscription != null) {
            subscription.delete()
            render "deleted"
        } else {
            render "failure"
        }
    }

    def update(Integer id, String serious) {
        Subscription subscription = Subscription.findBySeriousness(Seriousness.SERIOUS)
        if (subscription != null) {
            subscription.save()
            render "success"
        } else {
            render "errors"
        }
    }



}
