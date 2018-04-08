package linksharing


class LoginController {

    def index() {

        List<Resource> resources = Resource.topPost()
        render(view: '/login/home', model: [resources1: resources])

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

    def logout() {
        session.invalidate()
        render(controller: 'login', view: 'home')
    }

    def loginHandler(String userName, String password) {
        println(userName)
        User user = User.findByUserNameAndPassword(userName, password)
        if (user != null) {

            if (user.active) {
                session.user = user
                forward(controller: 'resource', view: 'index')

            } else {
                flash.error = "Account is not active"

            }
        } else {

            render(view: 'index')
        }



    }

    def fetchProductImage(){
        def user = session.user
        byte[] imageInByte = user.photo
        response.contentType = 'image/png' // or the appropriate image content type
        response.outputStream << imageInByte
        response.outputStream.flush()
    }


    def register(User user) {

        def file = params.photo
        user.admin = false
        user.active = true
        user.photo = file.bytes
        if (user.save()) {

            render "Successfully changed the password"

        } else {

            render(text: "${user.errors.allErrors}")
//            render flash.error = "User not found"
        }

    }

    //Q14. Add /user/forgotPassword template which will show up on click on
    // forgotPassword link in login form

    def password(String userName, String password) {
        User.withNewTransaction {
            User user = User.findByUserName(userName)
            if (user != null) {
                user.password = password
                user.save(true)
                render "Successfully changed the password"

            } else {
                flash.error = "User not found"
            }
        }
    }

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