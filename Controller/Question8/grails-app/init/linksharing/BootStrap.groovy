package linksharing

class BootStrap {

    def init = { servletContext ->

<<<<<<< HEAD

        createUsers()
        createTopics()
        createResource()
        subscribeTopicsNotCreatedByUser()
        createReadingItems()
        createdByresourceRating()




      
    }


=======
        createUsers()
        createTopics()
        subscribeTopicsNotCreatedByUser()
      
    }
>>>>>>> 68d395611bd1124a83bb0662d91e33d1ea78843d
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
<<<<<<< HEAD

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

=======
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
>>>>>>> 68d395611bd1124a83bb0662d91e33d1ea78843d

            }
        }
    }
<<<<<<< HEAD

    void createResource(){

        if(Resource.count()==0) {

            List<Topic> topics = Topic.getAll()

            topics.each {
                Resource resource = new LinkResource(url: "https://www.google.com", description: "${it.name}", user: it.createdBy, topic: it)
                resource.validate()
                log.error("Resource Error: ${resource.errors.allErrors}")
                resource.save()
                Resource resource1 = new LinkResource(url: "https://www.yahoo.com", user: it.createdBy, description: "${it.name}", topic: it)
                resource1.validate()
                log.error("Resource Error: ${resource1.errors.allErrors}")
                resource1.save()
                Resource resource2 = new DocumentResource(filePath: "adadf", description: "${it.name}",user: it.createdBy ,topic: it)
                resource2.validate()
                log.error("Resource Error: ${resource2.errors.allErrors}")
                resource2.save()
                Resource resource3 = new DocumentResource(filePath: "asda", description: "${it.name}",user:it.createdBy, topic: it)
                resource3.validate()
                log.error("Resource Error: ${resource3.errors.allErrors}")
                resource3.save()

            }

        }


    }

    void subscribeTopicsNotCreatedByUser(){
        List<User> userList=User.getAll()

        userList.each{
            User user->
                List<Topic> topics=Topic.findAllByCreatedByNotEqual(user)

                topics.each {
                    if(Subscription.findAllByTopicAndUser(it,user).size()==0) {
                        Subscription subscription = new Subscription(seriousness: Seriousness.CASUAL, user: user, topic: it)
                        if (subscription.save()) {
                            it.addToSubscriptions(subscription)
                            user.addToSubscriptions(subscription)
                        }
                        else {
                            log.error("Error:${subscription.errors.getAllErrors()}")
                        }
                    }
                }


=======
    void subscribeTopicsNotCreatedByUser(){
        Integer id=1;
        List<User> userCount=User.getAll()

        userCount.each{
            User user=it
            List<Topic> topics=Topic.findAllByCreatedByNotEqual(user)

            topics.each {
                if(Subscription.findAllByTopicAndUser(it,user).size()==0) {
                    Subscription subscription = new Subscription(seriousness: Seriousness.CASUAL, user: user, topics: it)
                    subscription.validate()
                    log.error("Error:${subscription.errors.getAllErrors()}")
                    subscription.save()
                }
            }

            id++
>>>>>>> 68d395611bd1124a83bb0662d91e33d1ea78843d
        }

    }

<<<<<<< HEAD
    void createReadingItems(){
        List<User> users = User.getAll()
        users.each{
            User user->
                user.subscriptions.each {

                    it.topic.resources.each{

                        if(it.user != user && ReadingItem.findAllByResourceAndUser(it,user).size()==0){
                            ReadingItem readingItem = new ReadingItem(user: user,isRead: false,resource: it)
                            if(readingItem.save()){
                                user.addToReadingItem(readingItem)
                                user.save()
                            }
                            else{
                                log.error("Error:${readingItem.errors.getAllErrors()}")
                            }
                        }
                    }
                }
        }
    }


    void createdByresourceRating() {
        List<ResourceRating> resourceRatingList = ResourceRating.getAll()
        resourceRatingList.each {
            ResourceRating resourceRating ->
                if (ReadingItem.findAllByUserAndResource(resourceRating.user, resourceRating.resource).size() == 0) {
                    ReadingItem readingItem = new ReadingItem(user: resourceRating.user,resource: resourceRating.resource, isRead: false)
                    if (readingItem.save()) {
                        log.info("Saved Successfully")
                        resourceRating.resource.addToReadingItem(readingItem)
                        resourceRating.user.addToReadingItem(readingItem)
                        resourceRating.resource.save()
                        resourceRating.user.save()
                    } else {
                        log.error("Error:- ${readingItem.errors.getAllErrors()}")
                    }
                }
        }
    }
    def destroy = {
    }

=======
    def destroy = {
    }
>>>>>>> 68d395611bd1124a83bb0662d91e33d1ea78843d
}