package linksharing


class LoginCheckInterceptor {

    LoginCheckInterceptor()
    {
        matchAll().except(controllerName: 'Login', actionName: 'loginHandler')
    }

    boolean before() {

true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
