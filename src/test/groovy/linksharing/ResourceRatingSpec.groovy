package linksharing

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ResourceRatingSpec extends Specification implements DomainUnitTest<ResourceRating> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect: "fix me"
        false == false
    }

    void "test User Not Null"() {
        setup:
        String email = "vaibhavwahi@tothenew.com"
        String password = 'pass'
        User user = new User(email: email, userName: "vaibhav", password: password, firstName: "vaibhav", lastName: "wahi", admin: false, active: true)
        Topic topic = new Topic(name: "sd", visibility: Visibility.PUBLIC, createdBy: user)
        Resource resource = new LinkResource(url: "www.google.com", description: "abhabhab", user: user, topic: topic)

        when:
        ResourceRating resourceRating = new ResourceRating(score: 2, user: null, resource: resource)
        resource.addToRatings(resourceRating)
        resourceRating.validate()
        resourceRating.save()

        then:
        resourceRating.errors.hasErrors() == true
    }

    void "test Score Not Null"() {
        setup:
        String email = "vaibhavwahi@tothenew.com"
        String password = 'p1231'
        User user = new User(email: email, userName: "vaibhav", password: password, firstName: "vaibhav", lastName: "wahi", admin: false, active: true)
        Topic topic = new Topic(name: "sd", visibility: Visibility.PUBLIC, createdBy: user)
        Resource resource = new LinkResource(url: "www.google.com", description: "abhabhab", user: user, topic: topic)

        when:
        ResourceRating resourceRating = new ResourceRating(score: null, user: user, resource: resource)
        resource.addToRatings(resourceRating)
        resourceRating.validate()
        resourceRating.save()

        then:
        resourceRating.errors.hasErrors() == true
    }


    void "test"() {
        setup:
        String email = "Vaibhav@gmail.com"
        String password = 'password'
        String name = "vaibhav"
        User user = new User(username: "va123", firstname: "vaibhav", lastname: "wahi", email: email, password: password)
        Topic topic = new Topic(name: name, visibility: Visibility.PUBLIC, createdBy: user)
        Resource resource = new LinkResource(decription: "new", url: "www.google.com", createdBy: user, topic: topic)
        ResourceRating resourceRating = new ResourceRating(score: 15, user: user, resource: resource)

        when:
        resource.addToRatings(resourceRating)
        user.addToResources(resourceRating)
        resourceRating.save()
        resourceRating.validate()
        user.save()

        then:
        resourceRating.errors.hasErrors() == true
    }
}