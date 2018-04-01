package linksharing

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class LinkResourceSpec extends Specification implements DomainUnitTest<LinkResource> {

    def setup() {
        mockDomain(User)
        mockDomain(Topic)
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            false == false
    }

    void "testLink"()
    {
        setup:
        String email = "Vaibhav@gmail.com"
        String password = 'password'
        String name = "topic"
        User user = new User(userName: "va123", firstName: "vaibhav", lastName: "wahi", email: email, password: password)
        Topic topic=new Topic(name:name,visibility: Visibility.PUBLIC, createdBy: user)
        LinkResource linkResource=new LinkResource(decription: "new",url:"www.google.com",createdBy: user,topic:topic)



        when:
        user.addToResources(linkResource)
        topic.addToResources(linkResource)
        linkResource.save()
        linkResource.validate()
        user.save()


        then:
        linkResource.errors.hasErrors()==true
    }
}
