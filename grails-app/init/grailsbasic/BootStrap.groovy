package grailsbasic

class BootStrap {

    def grailsApplication

    def init = { servletContext ->

        println " My File Name: ${grailsApplication.config.getProperty('name.of.file')}"
    }
    def destroy = {
    }
}
