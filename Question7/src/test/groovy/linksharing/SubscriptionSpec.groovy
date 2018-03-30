package linksharing

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class SubscriptionSpec extends Specification implements DomainUnitTest<Subscription> {

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

    void "User not null"() {


        setup:
        String email="Vaibhav@gmail.com"
        String password='password'
        String name = "topic"
        User user = new User(userName:"va123", firstName: "vaibhav", lastName:"wahi", email: email, password: password)
        Topic topic=new Topic(name:name,visibility: Visibility.PUBLIC, createdBy: user)
        when:
        Subscription subscription = new Subscription(seriousness: Seriousness.SERIOUS,user:null,topic:topic)
        subscription.save()
        user.addToSubscriptions(subscription)
        user.addToTopics(topic)
        user.validate()
        user.save(flush:true)



        then:
        subscription.errors.hasErrors()==true


    }

    void "Topic not null"() {


        setup:
        String email="Vaibhav@gmail.com"
        String password='password'
        String name = "topic"
        User user = new User(userName:"va123", firstName: "vaibhav", lastName:"wahi", email: email, password: password)
        Topic topic=new Topic(name:name,visibility: Visibility.PUBLIC, createdBy: user)
        when:
        Subscription subscription = new Subscription(seriousness: Seriousness.SERIOUS,user:user,topic:null)
        subscription.save()
        user.addToSubscriptions(subscription)
        user.addToTopics(topic)
        user.validate()
        user.save(flush:true)



        then:
        subscription.errors.hasErrors()==true


    }

    void "Seriousness not null"() {


        setup:
        String email="Vaibhav@gmail.com"
        String password='password'
        String name = "topic"
        User user = new User(userName:"va123", firstName: "vaibhav", lastName:"wahi", email: email, password: password)
        Topic topic=new Topic(name:name,visibility: Visibility.PUBLIC, createdBy: user)
        when:
        Subscription subscription = new Subscription(seriousness: null,user:user,topic:topic)
        subscription.save()
        user.addToSubscriptions(subscription)
        user.addToTopics(topic)
        user.validate()
        user.save(flush:true)



        then:
        subscription.errors.hasErrors()==true


    }

    void "Topic Unique"() {


        setup:
        String email="Vaibhav@gmail.com"
        String password='password'
        String name = "topic"
        User user = new User(userName:"va123", firstName: "vaibhav", lastName:"wahi", email: email, password: password)
        User user1 = new User(userName:"va", firstName: "vaibhav1", lastName:"wahi1", email: email, password: password)
        Topic topic=new Topic(name:name,visibility: Visibility.PUBLIC, createdBy: user)
         when:
        Subscription subscription = new Subscription(seriousness: Seriousness.SERIOUS,user:user,topic:topic)
        subscription.save()
         user.addToSubscriptions(subscription)
         user.addToTopics(topic)
        user.save(flush:true)

         Subscription subscription1 = new Subscription(seriousness: Seriousness.VERYSERIOUS,user:user,topic:topic)
         subscription1.save()
         user.addToTopics(topic)
         user.addToSubscriptions(subscription1)
         user.save(flush:true)

        then:
        subscription1.errors.hasErrors()==true



    }
}
