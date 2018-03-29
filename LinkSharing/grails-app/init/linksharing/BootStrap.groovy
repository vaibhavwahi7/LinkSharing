package linksharing

class BootStrap {

    def init = { servletContext ->

        User user = new User(firstName: "vaibhav", lastName: "wahi", email: "vaibhavdsdv@ne.com", password: "tdgsds",active: true, admin:true)
        user.save()
        println user.save()
        println(user.errors.allErrors)


    }
    def destroy = {
    }
}
