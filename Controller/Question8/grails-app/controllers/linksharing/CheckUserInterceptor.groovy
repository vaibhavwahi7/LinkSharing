package linksharing


class CheckUserInterceptor {

    boolean before() {
        def user = LoginController.findWhere(userName: params['username'],password: params['password'])
        session.user = user
        redirect(action: "LoginController")
        true }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
