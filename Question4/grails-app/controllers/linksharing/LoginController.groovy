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
            render("You are in index")
        }



    }


    def loginHandler()
    {
        redirect(action: "index")
    }

    def logoutAction()
    {
        session.invalidate()
        redirect(action: "loginHandler")
    }

}
