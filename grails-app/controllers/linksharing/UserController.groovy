package linksharing

import co.linksharing.SearchCO
import viewObject.linksharing.TopicVO

class UserController {

    def index() {
        if (session.user) {


            List<TopicVO> topicVO = Topic.getTrendingTopics()
            render(view: '/user/index', model: [topic: topicVO])


        } else {
            if (!flash.error)
                render("User not found")
        }
    }

//    def index(SearchCO searchCO) {
//
//        render(session.user.userName)
//
//        render session.user.getUnreadResource(searchCO)
//    }
    def logout() {
        session.invalidate()
        redirect(action: 'index')
    }

    def loginHandler(String userName, String password) {
        println(userName)
        User user = User.findByUserNameAndPassword(userName, password)
        if (user != null) {

            if (user.active) {
                session.user = user
                forward(controller: 'user', action: 'index')

            } else {
                flash.error = "Your account is not active"

            }
        } else {
            flash.error = "User not found"
        }
        redirect(action: 'index')


    }

    def getSubscribedTopic() {
        User.getSubscribedTopic()
    }


    def forgotPass() {

    }
}


