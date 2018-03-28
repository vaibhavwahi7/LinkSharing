package grailsapp

import grails.testing.web.controllers.ControllerUnitTest
import grailsdefault.UtilController
import spock.lang.Specification

class UtilControllerSpec extends Specification implements ControllerUnitTest<UtilController> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            false == false
    }
}
