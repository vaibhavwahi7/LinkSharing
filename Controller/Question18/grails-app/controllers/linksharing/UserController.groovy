package linksharing

class UserController {



    def index() {

//        render "text dashboard"
        redirect(action: 'show')
    }

    def show(Integer id){

        Topic topic=Topic.get(id)
        if(topic.visibility==Visibility.PRIVATE) {
            render("success")
        }
        else{
            if(Subscription.findByTopicAndUser(topic,session.user))
                render("Subscription Exists")
            else
                render("Subscription does not exists")
        }

    }

    }


