package linksharing

class BootStrap {

    def init = { servletContext ->

        /*FLUSH : True*/

//if(User.count==0) {

    User admin = new User(email: "vaibhav@gmail.com", password: "admin", firstName: "vaibhav", lastName: "wahi", userName: 'vaibhavWahia', admin: true, active: true)
    if (admin.save(flush: true)) {
        log.info("Admin Saved Successfully")
    } else {
        log.error("error: ${admin.errors.getAllErrors()}")
    }


    User normal = new User(email: "normalUser@gmail.com", password: "user3", firstName: "normal", lastName: "User", userName: 'normal', admin: false, active: true)
    if (normal.save(flush: true)) {
        log.info("Normal User Saved Successfully")
    } else {
        log.error("error: ${normal.errors.getFieldErrors()}")
    }

//}
        /*FailOnError: true*/

//        User admin = new User(email: "vaibhav@gmail.com", password: "admin", firstName: "vaibhav", lastName: "wahi", userName: 'vaibhavWahia', admin: true, active: true)
//        if (admin.save(failOnError: true)) {
//            log.info("Admin Saved Successfully")
//        } else {
//            log.error("error: ${admin.errors.getAllErrors()}")
//        }



//        User normal = new User(email: "normalUser@gmail.com", password: "user3", firstName: "normal", lastName: "User", userName: 'normal', admin: false, active: true)
//        if(normal.save(failOnError:true)){
//            log.info("Normal User Saved Successfully")
//        }
//        else {
//            log.error("error: ${normal.errors.getFieldErrors()}")
//        }
//
//
//    }
        def destroy = {
        }
    }
}