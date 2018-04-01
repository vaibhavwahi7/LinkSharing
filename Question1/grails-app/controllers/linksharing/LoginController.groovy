package linksharing

class LoginController {

    def user = session["user"]

    def index()
    {



        if(session.user)
        {
            forward(action: "loginHandler")
        }
        else
        {
            forward(action: "loginHandler")
        }



    }


    def loginHandler()
    {
        render("you are now in login handler........login failed")
    }

    def logoutAction()
    {
    }

}
