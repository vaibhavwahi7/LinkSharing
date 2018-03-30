package linksharing

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ReadingItemSpec extends Specification implements DomainUnitTest<ReadingItem> {

    def setup() {
        mockDomain(User)
        mockDomain(Topic)
        mockDomain(Resource)
        mockDomain(LinkResource)
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            false == false
    }

    void "test unique"()
    {
        setup:
        String email = "Vaibhav@gmail.com"
        String email1= "Vishvadeepin@gmail.com"
        String password = 'password'
        String password1 = 'password'
        String name="vaibhav"
        User user = new User(userName: "va123", firstName: "vaibhav", lastName: "wahi", email: email, password: password)
        User user1 = new User(userName: "vd", firstName: "vishvadeep", lastName: "indeevar", email: email1, password: password1)
        Topic topic=new Topic(name:name,visibility: Visibility.PUBLIC, createdBy: user)
        Resource resource=new LinkResource(decription: "new",url:"www.google.com",createdBy: user1,topic:topic)



        when:
        ReadingItem readingItem=new ReadingItem(user:user,resource:resource,isRead: true)
        readingItem.validate()
        readingItem.save()

       then:
        ReadingItem.count==1


        when:
        ReadingItem readingItem1=new ReadingItem(user:user,resource:resource,isRead: true)
        resource.addToReadingItem(readingItem1)
        resource.save()
        user.addToReadingItem(readingItem1)
        user.save()
        readingItem1.validate()
        readingItem1.save()


        then:
        readingItem1.errors.hasErrors()==true
    }

    void "test isRead null"()
    {
        setup:
        String email = "Vaibhav@gmail.com"
        String email1= "Vishvadeepin@gmail.com"
        String password = 'password'
        String password1 = 'password'
        String name="vaibhav"
        User user = new User(userName: "va123", firstName: "vaibhav", lastName: "wahi", email: email, password: password)
        User user1 = new User(userName: "vd", firstName: "vishvadeep", lastName: "indeevar", email: email1, password: password1)
        Topic topic=new Topic(name:name,visibility: Visibility.PUBLIC, createdBy: user)
        Resource resource=new LinkResource(decription: "new",url:"www.google.com",createdBy: user1,topic:topic)

        when:
        ReadingItem readingItem=new ReadingItem(user:user,resource:resource,isRead: null)
        readingItem.validate()
        readingItem.save()

        then:
        readingItem.errors.hasErrors()==true


    }

    void "test user null"()
    {
        setup:
        String email = "Vaibhav@gmail.com"
        String email1= "Vishvadeepin@gmail.com"
        String password = 'password'
        String password1 = 'password'
        String name="vaibhav"
        User user = new User(userName: "va123", firstName: "vaibhav", lastName: "wahi", email: email, password: password)
        User user1 = new User(userName: "vd", firstName: "vishvadeep", lastName: "indeevar", email: email1, password: password1)
        Topic topic=new Topic(name:name,visibility: Visibility.PUBLIC, createdBy: user)
        Resource resource=new LinkResource(decription: "new",url:"www.google.com",createdBy: user1,topic:topic)

        when:
        ReadingItem readingItem=new ReadingItem(user:null,resource:resource,isRead:true)
        readingItem.validate()
        readingItem.save()

        then:
        readingItem.errors.hasErrors()==true


    }

    void "test resources null"()
    {
        setup:
        String email = "Vaibhav@gmail.com"
        String email1= "Vishvadeepin@gmail.com"
        String password = 'password'
        String password1 = 'password'
        String name="vaibhav"
        User user = new User(userName: "va123", firstName: "vaibhav", lastName: "wahi", email: email, password: password)
        User user1 = new User(userName: "vd", firstName: "vishvadeep", lastName: "indeevar", email: email1, password: password1)
        Topic topic=new Topic(name:name,visibility: Visibility.PUBLIC, createdBy: user)
        Resource resource=new LinkResource(decription: "new",url:"www.google.com",createdBy: user1,topic:topic)

        when:
        ReadingItem readingItem=new ReadingItem(user:user,resource:null,isRead:true)
        readingItem.validate()
        readingItem.save()

        then:
        readingItem.errors.hasErrors()==true


    }


}
