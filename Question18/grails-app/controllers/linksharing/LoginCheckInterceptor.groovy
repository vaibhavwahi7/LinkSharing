package linksharing


class LoginCheckInterceptor {

//    LoginCheckInterceptor()
//    {
//        matchAll().except(controller: 'Login', action: 'loginHandler')
//    }

    boolean before() {
        if (!session.user) {
//            redirect(controller: 'Login', action: 'index')
            return false
        }
        return true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
