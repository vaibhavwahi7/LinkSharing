package domain

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class DocumentResourceSpec extends Specification implements DomainUnitTest<DocumentResource> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }

    void "test"()
    {
        setup:
        String email="Vaibhav@gmail.com"
        String password='password'
        String name = "topic"
        User user = new User(username:"va123", firstname: "vaibhav", lastname:"wahi", email: email, password: password)
        Topic topic=new Topic(name:name,visibility: Visibility.PUBLIC, createdBy: user)
        DocumentResource documentResource=new DocumentResource(decription: "vaibhav",filepath: null,createdBy: user,topic:topic)

        when:
        documentResource.validate()
        documentResource.save()
        user.addToResource(documentResource)
        topic.addToResource(documentResource)
        user.addToTopics(topic)
        user.save()
        user.validate()

        then:
        documentResource.errors.hasErrors()==true

    }
}
