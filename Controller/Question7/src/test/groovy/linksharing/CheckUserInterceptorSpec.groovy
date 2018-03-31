package linksharing

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class CheckUserInterceptorSpec extends Specification implements InterceptorUnitTest<CheckUserInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test checkUser interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"checkUser")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
