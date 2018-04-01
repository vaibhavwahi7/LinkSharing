package com.im.test

import spock.lang.Specification

class PasswordEncrypterServiceTest extends Specification {
    Boolean encyryptPassword(String pwd) {

        String encryptedPassword = passwordEncrypterService.encrypt(pwd)

        return encryptedPassword

    }





    def "Valid password is encrypted" ( ) {

        given: "A user"

        User user = new User()


        and: "A passwordEncrypterMock"

        def passwordEncrypterService = Mock(PasswordEncrypterService)

        passwordEncrypterService.encrypt(_ as String) >> "drowssap"

        user.passwordEncrypterService = passwordEncrypterService

        passwordEncrypterService.encrypt(_ as String) >> "drowssap"


        when: "encryptPassword is called"

        String encryptedPwd = user.encyryptPassword("password")


        then:

        encryptedPwd == "drowssap"

    }
}
