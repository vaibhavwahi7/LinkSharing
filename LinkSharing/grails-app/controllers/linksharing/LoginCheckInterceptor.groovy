package linksharing


class LoginCheckInterceptor {

    LoginCheckInterceptor() {

        matchAll().excludes(controller: 'login')
                .excludes(controller: 'resource', action: 'show')
                .excludes(controller: 'topic', action: 'show')
                .excludes(controller: 'resource', action: 'search')
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
