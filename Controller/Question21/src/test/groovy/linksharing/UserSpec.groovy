package linksharing

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
        User user = new User(firstName: "Vd", lastName: "Indeevar", email: email, password: password,active: true,admin: true)


        when:
        user.save()

        then:
        User.count == 1

        when:
        User newUser = new User(firstname: "vaibhav", lastName:"wahi", email: email, password: password,active: true,admin: false)
        newUser.save()

        then:
        User.count==1
        newUser.errors.hasErrors()==true
    }

    void "Test Email Type"() {

        setup:
        String email = "vaibhav@tothenew"
        String password = 'vaibhav'
        User user = new User(firstname: "Vd", lastName: "Indeevar", email: email, password: password)


        when:
        user.save()

        then:
        user.errors.hasErrors()==true
    }

    void "Test Email Not Null"() {

        setup:
        String password = 'vaibhav'
        User user = new User(firstname: "Vd", lastName: "Indeevar", email: null, password: password)


        when:
        user.save()

        then:
        user.errors.hasErrors()==true
    }


    void "Test Email Not Blank"() {

        setup:
        String password = 'vaibhav'
        User user = new User(firstname: "Vd", lastName: "Indeevar", email: "", password: password)


        when:
        user.save()

        then:
        user.errors.hasErrors()==true
    }

    void "Test Password Not Null"() {

        setup:

        User user = new User(firstname: "Vd", lastName: "Indeevar", email: "vaibhav@gmail.com", password: null)


        when:
        user.save()

        then:
        user.errors.hasErrors()==true
    }

    void "Test Password Not Blank"() {

        setup:

        User user = new User(firstname: "Vd", lastName: "Indeevar", email: "vaibhav@gmail.com", password: "")


        when:
        user.save()

        then:
        user.errors.hasErrors()==true
    }

    void "Test Password Minimum 5 Characters"() {

        setup:

        User user = new User(firstname: "Vd", lastName: "Indeevar", email: "vaibhav@gmail.com", password: 'sd')


        when:
        user.save()

        then:
        user.errors.hasErrors()==true
    }

    void "Test Firstname Not Null"() {

        setup:

        User user = new User(firstname: null, lastName: "Indeevar", email: "vaibhav@gmail.com", password: 'sddjsaj')


        when:
        user.save()

        then:
        user.errors.hasErrors()==true
    }

    void "Test lastName Not Null"() {

        setup:

        User user = new User(firstname: "Vd", lastName: null, email: "vaibhav@gmail.com", password: 'sd')


        when:
        user.save()

        then:
        user.errors.hasErrors()==true
    }

    void "Test FirstName not blank"() {

        setup:

        User user = new User(firstname: "", lastName: "Indeevar", email: "vaibhav@gmail.com", password: 'sdsdd')


        when:
        user.save()

        then:
        user.errors.hasErrors()==true
    }

    void "Test lastName not blank"() {

        setup:

        User user = new User(firstname: "Vd", lastName: "", email: "vaibhav@gmail.com", password: 'sdsdsd')


        when:
        user.save()

        then:
        user.errors.hasErrors()==true
    }

    void "Test Photo Null"() {

        setup:

        User user = new User(firstname: "Vd", lastName: "indeevar", email: "vaibhav@gmail.com", password: 'sdsdsd',photo: null)


        when:
        user.save()

        then:
        user.errors.hasErrors()==false
    }

    void "Test Admin Null"() {

        setup:

        User user = new User(firstname: "Vd", lastName: "indeevar", email: "vaibhav@gmail.com", password: 'sdsdsd',admin: null)


        when:
        user.save()

        then:
        user.errors.hasErrors()==false
    }

    void "Test Active Null"() {

        setup:

        User user = new User(firstname: "Vd", lastName: "indeevar", email: "vaibhav@gmail.com", password: 'sdsdsd',active: null)


        when:
        user.save()

        then:
        user.errors.hasErrors()==false
    }

    void "userName Unique"()
    {

        setup:
        String userName = 'vaibhav'
        User user= new User(firstname: "Vd", lastName: "Indeevar",userName: userName, email: "vd@gmail.com", password: "password")


        when:
        user.save()

        then:
        User.count == 1

        when:
        User newUser = new User(firstname: "vaibhav", lastName:"wahi",userName: userName ,email: "vaibhav@gmail.com", password: "pass")
        newUser.save()

        then:
        User.count == 1
        newUser.errors.allErrors.size() == 2
        newUser.errors.getFieldErrorCount('userName') == 1

    }

    void "test name"()
    {
        setup:

        User user=new User(name:"vaibhav",firstname: "sonu",lastName: "aggarwal",email:"sonu@gmail.com",password:'password')

        when:
        user.save()
        user.validate()

        then:
        user.errors.hasErrors()==true
    }

}
