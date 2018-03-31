package linksharing


class LoginCheckInterceptor {

    LoginCheckInterceptor()
    {
        matchAll().excludes(controller: 'login', action: 'loginHandler')
    }

    boolean before() {


    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
