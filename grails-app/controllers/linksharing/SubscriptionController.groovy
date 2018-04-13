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
            subscription.discard()
            subscription.delete(flush:true)
            render("Success")
            render(view: '/login/index')
        } else {
            render("Error")
        }

    }

    def update(Integer id, String serious) {
        Subscription subscription = Subscription.findBySeriousness(Seriousness.SERIOUS)
        if (subscription != null) {
            subscription.save()
            render "success"
            render(view: '/login/index')

        } else {
            render "errors"
        }
    }

    def changeSeriousness() {
        Subscription subscription = Subscription.findById(params.id)
        println(params.id)
        subscription.seriousness = params.seriousness
        subscription.user=session.user
        println ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + subscription
        if (subscription.save(flush: true)) {
            println ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>> save validated"
            log.info("Seriousness Changed : $subscription")
            redirect (controller:'login',view: 'home')
        } else {
            println ">>>>>>>>>>>>>>>>>>>>>. save invalidated"
            log.error("Unable to Change Seriousness : $subscription")
            subscription.errors.allErrors.each { println it }
            redirect (controller:'login',view: 'home')
        }
    }
}