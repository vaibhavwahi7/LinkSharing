package linksharing


class LoginController {

    def index() {

        render(view: "index")

//        if (session.user)
//            forward(controller: 'user', action: 'index')
//        else {
//            if(!flash.error)
//                render("User not found")
//        }
    }

//    def logout() {
//        session.invalidate()
//        redirect(action: 'index')
//    }
//
    def loginHandler(String userName, String password) {
        println(userName)
        User user = User.findByUserNameAndPassword(userName, password)
        if(user!=null) {

            if(user.active) {
                session.user=user
                forward(controller: 'user', action: 'index')

            }
            else {
                flash.error = "Account is not active"

            }
        }
        else
        {
            flash.error="User not found"
        }
        render(view:'index')


    }
//
//
//    void Users(){
//
//        final def pass=DefaultPassword.password
//
//        if(User.count()==0) {
//            User admin = new User(email: "vd@gmail.com", password: pass, firstName: "vd", lastName: "indee", userName: 'vdindee',admin: true, active: true)
//            admin.validate()
//            log.error("error: ${admin.errors.getAllErrors()}")
//            admin.save(flush: true)
//            if(admin.errors.hasErrors()==false)
//                log.info("Admin Saved Successfully")
//
//
//            User normal = new User(email: "vaibhav@gmail.com", password: pass, firstName: "vaibhav", lastName: "wahi", userName: 'vaibhav',admin: false, active: true)
//            normal.validate()
//            log.error("error: ${normal.errors.getFieldErrors()}")
//            normal.save(flush: true)
//            if(normal.errors.hasErrors()==false)
//                log.info("Normal User Saved Successfully")
//        }
//    }

}