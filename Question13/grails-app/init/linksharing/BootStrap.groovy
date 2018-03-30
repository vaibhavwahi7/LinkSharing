package linksharing

class BootStrap {

    def init = { servletContext ->

        createUsers()
        createTopics()
        createResource()
      
    }
    void createUsers(){

        final def pass=DefaultPassword.password

        if(User.count()==0) {
            User admin = new User(email: "vd@gmail.com", password: pass, firstName: "vd", lastName: "indee", userName: 'vdindee',admin: true, active: true)
            admin.validate()
            log.error("error: ${admin.errors.getAllErrors()}")
            admin.save(flush: true)
            if(admin.errors.hasErrors()==false)
                log.info("Admin Saved Successfully")


            User normal = new User(email: "vaibhav@gmail.com", password: pass, firstName: "vaibhav", lastName: "wahi", userName: 'vaibhav',admin: false, active: true)
            normal.validate()
            log.error("error: ${normal.errors.getFieldErrors()}")
            normal.save(flush: true)
            if(normal.errors.hasErrors()==false)
                log.info("Normal User Saved Successfully")
        }
    }

    void createTopics() {
        List<User> userCount = User.getAll()
        userCount.each {

            if (Topic.findAllByCreatedBy(it).size()==0) {

                Topic topic = new Topic(name: "BigData", createdBy: it, visibility: Visibility.PUBLIC)

                Topic topic1 = new Topic(name: "Java", createdBy: it, visibility: Visibility.PRIVATE)

                Topic topic2 = new Topic(name: "nodeJs", createdBy: it, visibility: Visibility.PUBLIC)

                Topic topic3 = new Topic(name: "AngularJs", createdBy: it, visibility: Visibility.PRIVATE)

                Topic topic4 = new Topic(name: "MachineLearning", createdBy: it, visibility: Visibility.PUBLIC)


                if(topic.save())
                    it.addToTopics(topic)

                if(topic1.save())
                    it.addToTopics(topic1)

                if(topic2.save())
                    it.addToTopics(topic2)

                if(topic3.save())
                    it.addToTopics(topic3)

                if(topic4.save())
                    it.addToTopics(topic4)


                else {
                    log.error("Topic ${topic.errors.getFieldErrors()}")
                    log.error("Topic ${topic1.errors.getFieldErrors()}")
                    log.error("Topic ${topic2.errors.getFieldErrors()}")
                    log.error("Topic ${topic3.errors.getFieldErrors()}")
                    log.error("Topic ${topic4.errors.getFieldErrors()}")

                }
                it.save()
                log.info("Topics Saved Successfully")


            }
        }
    }

    void createResource(){

        if(Resource.count()==0) {

            List<Topic> topics = Topic.getAll()

            topics.each {
                Resource resource = new LinkResource(url: "https://www.google.com", description: "cghhch", user: it.createdBy, topic: it)
                resource.validate()
                log.error("Resource Error: ${resource.errors.allErrors}")
                resource.save()
                Resource resource1 = new LinkResource(url: "https://www.yahoo.com", user: it.createdBy, description: "ggjhhj", topic: it)
                resource1.validate()
                log.error("Resource Error: ${resource1.errors.allErrors}")
                resource1.save()
                Resource resource2 = new DocumentResource(filePath: "adadf", description: "vjjjj",user: it.createdBy ,topic: it)
                resource2.validate()
                log.error("Resource Error: ${resource2.errors.allErrors}")
                resource2.save()
                Resource resource3 = new DocumentResource(filePath: "asda", description: "hjgkkkk",user:it.createdBy, topic: it)
                resource3.validate()
                log.error("Resource Error: ${resource3.errors.allErrors}")
                resource3.save()

            }

        }


    }



    def destroy = {
    }
}