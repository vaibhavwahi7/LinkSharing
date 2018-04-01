package linksharing

class LoginController {


    def username="vaibhav"
    def password="password"

    def index()
    {

    render("Hi user not active")

    }


    def loginHandler() {


        User user=User.findByUserNameAndPassword(username,password)
if(user!=null)
{
    if(user.active)
    {
        session.user=user
        redirect(action: "index")
    }
}
    }
    def logoutAction()
    {
        session.invalidate()
        redirect(action: "loginHandler")
    }

}
