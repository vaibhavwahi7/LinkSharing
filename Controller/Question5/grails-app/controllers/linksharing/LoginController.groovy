package linksharing

class LoginController {

    def user = session["user"]

    def index()
    {
        
    forward(action: "loginHandler")

    }


    def loginHandler()
    {
        def username="Vaibhav"
        def password="pass"
        render( "username is ${username} and password is ${password}")
    }

    def logoutAction()
    {
        session.invalidate()
        redirect(action: "loginHandler")
    }

}
