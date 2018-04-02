package linksharing

import grails.testing.gorm.DomainUnitTest
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class TopicControllerSpec extends Specification implements ControllerUnitTest<TopicController>, DomainUnitTest<Topic> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect: "fix me"
        true == false
    }

    def "topic save"() {
        given:
        User user = new User(email: "vaibhavawahi@gmail.com", userName: "vaibhavgh", password: "pass1",
                firstName: "vaibhav", lastName: "wahi", admin: false, active: true)
        session.user = user
        Topic topic = new Topic(name: "vaibhav", visibility: Visibility.PUBLIC, createdBy: session.user)


        when:
        controller.save(topic, "Casual")

        then:
        response.contentAsString == "saved Successfully"


    }

    def "topic delete"() {
        given:
        User user = new User(email: "vaibhavawahi@gmail.com", userName: "vaibhavgh", password: "pass1",
                firstName: "vaibhav", lastName: "wahi", admin: false, active: true)
        session.user = user
        Topic topic = new Topic(name: "vaibhav", visibility: Visibility.PUBLIC, createdBy: session.user)
        topic.save()
        user.addToTopics(topic)
        user.save()


        when:
        controller.delete(topic.id)

        then:
        println(topic.id)
        response.contentAsString == "success"


    }
}
