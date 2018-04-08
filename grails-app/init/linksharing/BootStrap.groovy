package linksharing

class BootStrap {

    def init = { servletContext ->


        createUsers()
        createTopics()
        createResource()
        subscribeTopicsNotCreatedByUser()
        createReadingItems()
        createResourceRating()


    }


    void createUsers() {

        final def pass = DefaultPassword.password

            User admin = new User(email: "vd@gmail.com", password: pass, firstName: "vd", lastName: "indee", userName: 'vdindee', admin: true, active: true)
            admin.validate()
            log.error("error: ${admin.errors.getAllErrors()}")
            admin.save(flush: true)
            if (admin.errors.hasErrors() == false)
                log.info("Admin Saved Successfully")


            User normal = new User(email: "vaibhav@gmail.com", password: pass, firstName: "vaibhav", lastName: "wahi", userName: 'vaibhav', admin: false, active: true)
            normal.validate()
            log.error("error: ${normal.errors.getFieldErrors()}")
            normal.save(flush: true)
            if (normal.errors.hasErrors() == false)
                log.info("Normal User Saved Successfully")


    }

    void createTopics() {
        List<User> userCount = User.getAll()
        userCount.each {

            if (Topic.findAllByCreatedBy(it).size() == 0) {

                Topic topic = new Topic(name: "BigData", createdBy: it, visibility: Visibility.PUBLIC)

                Topic topic1 = new Topic(name: "Java", createdBy: it, visibility: Visibility.PRIVATE)

                Topic topic2 = new Topic(name: "nodeJs", createdBy: it, visibility: Visibility.PUBLIC)

                Topic topic3 = new Topic(name: "AngularJs", createdBy: it, visibility: Visibility.PRIVATE)

                Topic topic4 = new Topic(name: "MachineLearning", createdBy: it, visibility: Visibility.PUBLIC)


                if (topic.save())
                    it.addToTopics(topic)

                if (topic1.save())
                    it.addToTopics(topic1)

                if (topic2.save())
                    it.addToTopics(topic2)

                if (topic3.save())
                    it.addToTopics(topic3)

                if (topic4.save())
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

    void createResource() {


            List<Topic> topics = Topic.getAll()

            topics.each {
                Resource resource = new LinkResource(url: "https://www.google.com", description: "This is AngularJS", user: it.createdBy, topic: it)
                resource.validate()
                log.error("Resource Error: ${resource.errors.allErrors}")
                resource.save()
                Resource resource1 = new LinkResource(url: "https://www.yahoo.com", user: it.createdBy, description: "This is Big Data", topic: it)
                resource1.validate()
                log.error("Resource Error: ${resource1.errors.allErrors}")
                resource1.save()
                Resource resource2 = new DocumentResource(filePath: "adadf", description: "This is Java}", user: it.createdBy, topic: it)
                resource2.validate()
                log.error("Resource Error: ${resource2.errors.allErrors}")
                resource2.save()
                Resource resource3 = new DocumentResource(filePath: "asda", description: "${"This is node JS"}", user: it.createdBy, topic: it)
                resource3.validate()
                log.error("Resource Error: ${resource3.errors.allErrors}")
                resource3.save()



        }


    }

    void subscribeTopicsNotCreatedByUser() {
        List<User> userList = User.getAll()

        userList.each {
            User user ->
                List<Topic> topics = Topic.findAllByCreatedByNotEqual(user)

                topics.each {
                    if (Subscription.findAllByTopicAndUser(it, user).size() == 0) {
                        Subscription subscription = new Subscription(seriousness: Seriousness.CASUAL, user: user, topic: it)
                        if (subscription.save()) {
                            it.addToSubscriptions(subscription)
                            user.addToSubscriptions(subscription)
                        } else {
                            log.error("Error:${subscription.errors.getAllErrors()}")
                        }
                    }
                }


        }

    }

    def createReadingItems() {

        List<User> userList = User.findAll()
        userList.each {
            List<Resource> resourceList = Resource.findAll()
            User user = it
            resourceList.each {

                Topic topic = it.topic
                if (topic.createdBy != user && it.user != user) {

                    ReadingItem readingItem = new ReadingItem(user: user, isRead: true, resource: it)
                    if (!readingItem.save(flush: true)) {
                        log.error("Error while saving : $readingItem")
                    } else {
                        log.info("Saved Succesfully: $readingItem")
                        user.addToReadingItem(readingItem)
                    }
                }
            }
        }

    }

    void createResourceRating() {
        List<Resource> resource = Resource.getAll()
        resource.each {
            ResourceRating resourceRating = new ResourceRating(user: it.user, resource: it, score: 3)
            resourceRating.save()
        }
    }
    def destroy = {
    }

}