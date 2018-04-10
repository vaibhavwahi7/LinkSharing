package linksharing

import grails.testing.gorm.DomainUnitTest
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class UserControllerSpec extends Specification implements ControllerUnitTest<UserController>, DomainUnitTest<User> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect: "fix me"
        false == false
    }

    void "test case"() {
        setup:
        User user = new User(email: "vaibhav@gmail.com", userName: "vaibhavwahi", password: "pass",
                firstName: "vaibhav", lastName: "Wahi", admin: false, active: true)

        user.save()
        session["user"] = user
        when:
        controller.index()
        then:
        response.contentAsString == "vaibhavwahi"


    }
}
