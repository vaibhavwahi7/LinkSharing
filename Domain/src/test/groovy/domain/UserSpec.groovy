package domain

import com.sun.jna.platform.win32.SetupApi
import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class UserSpec extends Specification implements DomainUnitTest<User> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect: "fix me"
        false == false
    }

    void "Test Email Unique"() {

        setup:
        String email = "vaibhav@tothenew.com"
        String password = 'vaibhav'
        User user = new User(firstname: "Vd", lastname: "Indeevar", email: email, password: password)


        when:
        user.save()

        then:
        User.count == 1

        when:
        User newUser = new User(firstname: "vaibhav", lastname:"wahi", email: email, password: password)
        newUser.save()

        then:
        User.count == 1
        newUser.errors.allErrors.size() == 1
        newUser.errors.getFieldErrorCount('email') == 1
    }

    void "Test Email Type"() {

        setup:
        String email = "vaibhav@tothenew"
        String password = 'vaibhav'
        User user = new User(firstname: "Vd", lastname: "Indeevar", email: email, password: password)


        when:
        user.save()

        then:
        user.errors.hasErrors()==true
    }

    void "Test Email Not Null"() {

        setup:
        String password = 'vaibhav'
        User user = new User(firstname: "Vd", lastname: "Indeevar", email: null, password: password)


        when:
        user.save()

        then:
        user.errors.hasErrors()==true
    }


    void "Test Email Not Blank"() {

        setup:
        String password = 'vaibhav'
        User user = new User(firstname: "Vd", lastname: "Indeevar", email: "vaibhav@gmail.com", password: password)


        when:
        user.save()

        then:
        user.errors.hasErrors()==true
    }

    void "Test Password Not Null"() {

        setup:

        User user = new User(firstname: "Vd", lastname: "Indeevar", email: "vaibhav@gmail.com", password: null)


        when:
        user.save()

        then:
        user.errors.hasErrors()==true
    }

    void "Test Password Not Blank"() {

        setup:

        User user = new User(firstname: "Vd", lastname: "Indeevar", email: "vaibhav@gmail.com", password: "")


        when:
        user.save()

        then:
        user.errors.hasErrors()==true
    }

    void "Test Password Minimum 5 Characters"() {

        setup:

        User user = new User(firstname: "Vd", lastname: "Indeevar", email: "vaibhav@gmail.com", password: 'sd')


        when:
        user.save()

        then:
        user.errors.hasErrors()==true
    }

    void "Test Firstname Not Null"() {

        setup:

        User user = new User(firstname: null, lastname: "Indeevar", email: "vaibhav@gmail.com", password: 'sddjsaj')


        when:
        user.save()

        then:
        user.errors.hasErrors()==false
    }

    void "Test Lastname Not Null"() {

        setup:

        User user = new User(firstname: "Vd", lastname: null, email: "vaibhav@gmail.com", password: 'sd')


        when:
        user.save()

        then:
        user.errors.hasErrors()==true
    }

    void "Test FirstName not blank"() {

        setup:

        User user = new User(firstname: "", lastname: "Indeevar", email: "vaibhav@gmail.com", password: 'sdsdd')


        when:
        user.save()

        then:
        user.errors.hasErrors()==true
    }

    void "Test Lastname not blank"() {

        setup:

        User user = new User(firstname: "Vd", lastname: "", email: "vaibhav@gmail.com", password: 'sdsdsd')


        when:
        user.save()

        then:
        user.errors.hasErrors()==true
    }

    void "Test Photo Null"() {

        setup:

        User user = new User(firstname: "Vd", lastname: "indeevar", email: "vaibhav@gmail.com", password: 'sdsdsd',photo: null)


        when:
        user.save()

        then:
        user.errors.hasErrors()==false
    }

    void "Test Admin Null"() {

        setup:

        User user = new User(firstname: "Vd", lastname: "indeevar", email: "vaibhav@gmail.com", password: 'sdsdsd',admin: null)


        when:
        user.save()

        then:
        user.errors.hasErrors()==false
    }

    void "Test Active Null"() {

        setup:

        User user = new User(firstname: "Vd", lastname: "indeevar", email: "vaibhav@gmail.com", password: 'sdsdsd',active: null)


        when:
        user.save()

        then:
        user.errors.hasErrors()==false
    }

    void "Username Unique"()
    {

        setup:
        String username = 'vaibhav'
        User user= new User(firstname: "Vd", lastname: "Indeevar",username: username, email: "vd@gmail.com", password: "password")


        when:
        user.save()

        then:
        User.count == 1

        when:
        User newUser = new User(firstname: "vaibhav", lastname:"wahi",username: username ,email: "vaibhav@gmail.com", password: "pass")
        newUser.save()

        then:
        User.count == 1
        newUser.errors.allErrors.size() == 2
        newUser.errors.getFieldErrorCount('username') == 1

    }

    void "test name"()
    {
        setup:

        User user=new User(name:"vaibhav",firstname: "sonu",lastname: "aggarwal",email:"sonu@gmail.com",password:'password')

        when:
        user.save()
        user.validate()

        then:
        user.errors.hasErrors()==false
    }

}
