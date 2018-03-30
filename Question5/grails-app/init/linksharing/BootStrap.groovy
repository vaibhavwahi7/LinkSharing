package linksharing


class BootStrap {

    def init = { servletContext ->

        final def password=DefaultPassword.password
        User admin = new User(email: "vaibhav@gmail.com", password: password, firstName: "vaibhav", lastName: "wahi", userName: 'vaibhavWahia', admin: true, active: true)
        if (admin.save()) {
            log.info("Admin Saved Successfully")
        } else {
            log.error("error: ${admin.errors.getAllErrors()}")
        }

        def destroy = {
        }
    }
}