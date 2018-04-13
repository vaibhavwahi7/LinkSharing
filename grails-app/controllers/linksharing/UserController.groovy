package linksharing

import co.linksharing.ResourceSearchCo
import co.linksharing.SearchCO
import co.linksharing.util.TopicSearchCO
import dto.linksharing.EmailDTO
import util.Util
import viewObject.linksharing.TopicVO


class UserController {

    EmailService emailService
    def forgotPassword(String emailId) {
        User user = User.findByEmail(emailId)
        if (user && user.active) {

            String newPassword = new Util().getRandomPassword()
            EmailDTO emailDTO = new EmailDTO(to: emailId, subject: "For LinkSharing Password", from: "rg488592@gmail.com", content: "hey Therer your New Password : ${newPassword}")

            emailService.sendMail(emailDTO)

            flash.message = "password sent"
            render(" New Password Is Sent To Registered Email Id")
        } else {
            render("Invalid email id")
        }
    }


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

    def updatePassword()
    {
       render(view:'updatePassword')
    }

//    def getSubscribedTopic() {
//        User.getSubscribedTopic()
//    }


    def forgotPass() {

    }



    def topics(Long id) {
        TopicSearchCO co = new TopicSearchCO(id: id)
        User user = User.get(session.user?.id)
        if (session.user) {
            if (!(session.user.admin || user == User.get(id))) {
                co.visibility = Visibility.PUBLIC
            }
        } else {
            co.visibility = Visibility.PUBLIC
        }
        List<TopicVO> topicVOs = TopicService.search(co)
        render(template: "/topic/list", model: [topics: topicVOs])
    }

def profile()
{

}


}