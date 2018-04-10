package linksharing

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TopicSpec extends Specification implements DomainUnitTest<Topic> {

    def setup() {
        mockDomain(User)
    }

    def cleanup() {
    }

    void "test something"() {
        expect: "fix me"
        false == false
    }

    void "Test name not null"() {

        setup:
        User user = new User(firstName: "Vd", lastName: "Indeevar", email: "vaibhav@gmail.com", password: "")
        Topic topic = new Topic(name: null, visibility: Visibility.PUBLIC, createdBy: user)


        when:
        topic.save()

        then:
        topic.errors.hasErrors() == true
    }

    void "Test name not blank"() {

        setup:
        User user = new User(firstName: "Vd", lastName: "Indeevar", email: "vaibhav@gmail.com", password: "")
        Topic topic = new Topic(name: "", visibility: Visibility.PUBLIC, createdBy: user)


        when:

        topic.save()

        then:
        topic.errors.hasErrors() == true
    }


    void "Topic Unique"() {


        setup:
        String email = "Vaibhav@gmail.com"
        String password = 'password'
        User user = new User(userName: "va123", firstName: "vaibhav", lastName: "wahi", email: email, password: password)

        when:
        Topic topic = new Topic()
        topic.createdBy = user
        topic.name = "topic"
        topic.visibility = Visibility.PRIVATE
        user.addToTopics(topic)
        user.save(flush: true)

        Topic topic1 = new Topic()
        topic1.name = "topic"
        topic1.createdBy = user
        topic1.visibility = Visibility.PUBLIC
        user.addToTopics(topic1)
        user.validate()

        then:
        user.errors.hasErrors() == true


    }

    void "Test Visibility not null"() {

        setup:
        User user = new User(firstName: "Vd", lastName: "Indeevar", email: "vaibhav@gmail.com", password: "")
        Topic topic = new Topic(name: "Start", visibility: null, createdBy: user)


        when:
        topic.save()

        then:
        topic.errors.hasErrors() == true
    }

    void "Test CreatedBy not null"() {

        setup:
        User user = new User(firstName: "Vd", lastName: "Indeevar", email: "vaibhav@gmail.com", password: "")
        Topic topic = new Topic(name: "start", visibility: Visibility.PUBLIC, createdBy: null)


        when:
        topic.save()

        then:
        topic.errors.hasErrors() == true
    }


}
