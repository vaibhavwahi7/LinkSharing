package linksharing

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class DocumentResourceSpec extends Specification implements DomainUnitTest<DocumentResource> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect: "fix me"
        false == false
    }

    void "test"() {
        setup:
        String email = "Vaibhav@gmail.com"
        String password = 'password'
        String name = "topic"
        User user = new User(userName: "va123", firstName: "vaibhav", lastName: "wahi", email: email, password: password)
        Topic topic = new Topic(name: name, visibility: Visibility.PUBLIC, createdBy: user)
        DocumentResource documentResource = new DocumentResource(decription: "vaibhav", filepath: null, createdBy: user, topic: topic)

        when:
        documentResource.validate()
        documentResource.save()
        user.addToResources(documentResource)
        topic.addToResources(documentResource)
        user.addToTopic(topic)
        user.save()
        user.validate()

        then:
        documentResource.errors.hasErrors() == true

    }
}
