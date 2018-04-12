package dto.linksharing

import grails.validation.Validateable


class EmailDTO {
    List<String> to
    String subject
    String view
    String content
    Map model

    static constraints = {
        model(nullable: true)
    }
}
