package domain

import grails.web.Controller

class BootStrap {

    def init = { servletContext ->
        User user = new User(firstname: "Neha", lastname: "Gupta", email: "vaibhav@nehftyw.com", password: "tdgsds")
        user.save()
        println user.save()
        println(user.errors.allErrors)
        Topic topic = new Topic(name:"BookAgenda",password:"ghfhd",visibility: Visibility.PUBLIC)
        user.addToTopics(topic)
        println(topic.errors.allErrors)
        println topic.save()


    }
    def destroy = {
    }

}
