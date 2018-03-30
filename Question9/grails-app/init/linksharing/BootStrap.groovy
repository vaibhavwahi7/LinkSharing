package linksharing

class BootStrap {

    def init = { servletContext ->

        createUsers()
        createTopics()
        subscribeTopicsNotCreatedByUser()
      
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
                it.addToTopics(topic)

                Topic topic1 = new Topic(name: "Java", createdBy: it, visibility: Visibility.PRIVATE)
                it.addToTopics(topic1)

                Topic topic2 = new Topic(name: "nodeJs", createdBy: it, visibility: Visibility.PUBLIC)
                it.addToTopics(topic2)

                Topic topic3 = new Topic(name: "AngularJs", createdBy: it, visibility: Visibility.PRIVATE)
                it.addToTopics(topic3)

                Topic topic4 = new Topic(name: "MachineLearning", createdBy: it, visibility: Visibility.PUBLIC)
                it.addToTopics(topic4)

                topic.validate()
                log.error("Topic ${topic.errors.getFieldErrors()}")
                topic.save()
                topic1.validate()
                log.error("Topic ${topic1.errors.getFieldErrors()}")
                topic1.save()
                topic2.validate()
                log.error("Topic ${topic2.errors.getFieldErrors()}")
                topic2.save()
                topic3.validate()
                log.error("Topic ${topic3.errors.getFieldErrors()}")
                topic3.save()
                topic4.validate()
                log.error("Topic ${topic4.errors.getFieldErrors()}")
                topic4.save()

            }
        }
    }
    void subscribeTopicsNotCreatedByUser(){
        Integer id=1;
        List<User> userCount=User.getAll()

        userCount.each{
            User user=it
            List<Topic> topics=Topic.findAllByCreatedByNotEqual(user)

            topics.each {
                if(Subscription.findAllByTopicAndUser(it,user).size()==0) {
                    Subscription subscription = new Subscription(seriousness: Seriousness.CASUAL, user: user, topic: it)
                    subscription.validate()
                    log.error("Error:${subscription.errors.getAllErrors()}")
                    subscription.save()
                }
            }

            id++
        }

    }

    def destroy = {
    }
}
