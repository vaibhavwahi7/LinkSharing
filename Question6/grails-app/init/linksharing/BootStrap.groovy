package linksharing


class BootStrap {

    def init = { servletContext ->



        createTopics()
        createUser()

        }
    void createUser()
    {
        final def password=DefaultPassword.password
        User admin = new User(email: "vaibhavwahi@gmail.com", password: password, firstName: "vaibhav123", lastName: "wahi", userName: 'vaibhavWahia', admin: true, active: true)
        if (admin.save()) {
            log.info("Admin Saved Successfully")
        } else {
            log.error("error: ${admin.errors.getAllErrors()}")
        }
    }
        void createTopics()
        {
            final def password=DefaultPassword.password
            User user = new User(email: "vaibhav@gmail.com", password: "aandhh", firstName: "vaibhav", lastName: "wahi", userName: 'vaibhavWahi', admin: true, active: true)
            user.save()
            Topic topic = new Topic(name: "Vaibhav", createdBy:user, visibility: Visibility.PUBLIC )
            if (topic.save()) {
                log.info("Admin Saved Successfully")
            } else {
                log.error("error: ${topic.errors.getAllErrors()}")
            }
        }

        def destroy = {
        }



}