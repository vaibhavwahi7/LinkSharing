package linksharing


class LoginCheckInterceptor {

    LoginCheckInterceptor()
    {
        matchAll().except(controller: 'login')
    }

    boolean before() {
        if (!session.user) {

            redirect(controller: 'login', action: 'index')
                return false
        }
        return true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
