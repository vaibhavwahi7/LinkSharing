package linksharing

import grails.testing.gorm.DomainUnitTest
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class LoginControllerSpec extends Specification implements ControllerUnitTest<LoginController>,DomainUnitTest<User> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
        false== false
    }

    def "check when user sessions exists in index method"() {
        given: "a session user exists"
        session["user"] = new User()

        when:
        controller.index()

        then:
        response.forwardedUrl == '/user/index'
    }
    def "check if user session exists in index method"() {
        given: "a session user exists"
        session["user"] = null

        when:
        controller.index()

        then:
        response.contentAsString=="User not found"
    }
    def "if user is logged out"() {
        when:
        controller.logout()
        then:
        !session.user
        response.redirectUrl == '/login/index'
    }
  
    def "check if user doesn't exist"() {
        given:
        String userName = "vaibhav"
        String password = "wahi"

        when:
        controller.loginHandler(userName, password)

        then:
        flash.error == "User not found"
        response.redirectUrl== '/login/index'
    }
    def "check if user exists and is active"() {
        given:
        User user = new User(email: "vaibhavawahi@gmail.com", userName: "vaibhavgh", password: "pass1",
                firstName: "vaibhav", lastName: "wahi", admin: false, active: true)
        user.save()

        when:
        controller.loginHandler(user.userName, user.password)

        then:
        response.forwardedUrl == '/user/index'
    }

}
