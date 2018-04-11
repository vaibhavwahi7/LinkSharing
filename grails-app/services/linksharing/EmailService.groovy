package linksharing

import dto.linksharing.EmailDTO
import linksharing.Resource
import linksharing.User
import grails.gorm.transactions.Transactional
import org.springframework.context.MessageSource

@Transactional
class EmailService {

    static transactional = false
    def mailService
    MessageSource messageSource

    def serviceMethod() {

    }


    def sendMail(EmailDTO emailDTO) {
        mailService.sendMail {
            to emailDTO.to
            subject emailDTO.subject
            body emailDTO.content

        }
    }


    def sendUnreadResourcesMail(User user, List<Resource> unreadResources) {

    }
}