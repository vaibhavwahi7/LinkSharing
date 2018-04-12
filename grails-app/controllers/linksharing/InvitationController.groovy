package linksharing

import grails.plugins.mail.MailService

class InvitationController {

    def index() { }

    MailService mailService
    def sendMail() {
        println("printing params : " + params)
        println "InvitationController sendMail >> " + params.reciever
        println "InvitationController bean >> " + mailService

//

        mailService.sendMail {
            to "${params.reciever}"
            subject "Regarding Invitation For Topic : ${params.topicName}"
            html """Hey checkout this interesting topic I came across.
<a href = "${createLink(controller: 'subscription', action: 'subscribeThroughEmail', id: params.topicName ,absolute: true)} ">Click Here</a>
"""
        }



        flash.message= "invitation send successfully"
        redirect(controller: 'user', action: 'index')
    }
}
