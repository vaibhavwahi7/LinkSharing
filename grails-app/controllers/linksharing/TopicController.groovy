package linksharing

import co.linksharing.ResourceSearchCo
import dto.linksharing.EmailDTO

class TopicController {

    def index() {

    }

//    def show(ResourceSearchCo resourceSearchCO){
//        def topic = Resource.search(resourceSearchCO).list()
//        render("CreatedBy- $topic.createdby.firstname Topicname- $topic.name")
//        User user=User.read(session.user.id)
//        render(user.topics)
//    }

//    def show(ResourceSearchCo resourceSearchCO){
//
//        List<Resource> resources=Resource.search(resourceSearchCO).list()
//        render("Resources are ${resources.id}")
//
//
//
//    }

    List<Resource> show(Long id) {
        Topic topic = Topic.findById(id)
        List<Resource> resources = Resource.findAllById(id)
        render(view: "show", model: [topics: topic, res: resources])
    }

    def delete(Integer id) {
        Topic topic = Topic.load(id)
        println(topic)
        if (topic.delete()) {
            flash.message = "sucess"
            render(action: 'index')
        } else {
            flash.error = "error"
        }
    }

    def getTrendingTopic() {
        Topic.getTrendingTopics()
    }

    //Question 8  Implement topic/save and linkresource/save save action.
    //            Topic, linkresource save should set errors in flash and
    //            user should redirected to the dashboard, successful save should set flash.message.


    def save(String text, String visibility) {
        Topic topic = new Topic()

        topic.name = text

        println(visibility)
        if (visibility == "public") {
            topic.visibility = Visibility.PUBLIC
        } else if (visibility == "private") {
            topic.visibility = Visibility.PRIVATE

        }
        topic.createdBy = session.user
        if (topic.save()) {
            flash.message = "Saved"

        } else {
            render(view: 'error')
        }
        forward(controller: 'user', action: 'index')


    }

    def topicIs()
    {
        String topic=Topic.isPublic(session.user.id)
        render topic
    }

    def viewedBy()
    {
        String topic=Topic.isPublic(session.user.id)
        if(topic.equals("PUBLIC")&&(session.user.admin.toString()==("true")))
        {
        }
        else
        if(topic.equals("PUBLIC")&&(session.user.admin.toString()==("false")))
        {
            render ("You are public")
        }
        else
        if(topic.equals("PRIVATE")&&(session.user.admin.toString().equals("true")))
        {
            render ("You are private")
        }
        else
        if(topic.equals("PRIVATE")&&(session.user.admin.toString().equals("false")))
        {
            render ("You haven't got the proper rights to access the topic")
        }

        render topic

    }


    def invite(Integer id, String emailId) {

        if (Topic.get(id) && User.findByEmail(emailId)) {
            EmailDTO emailDTO = new EmailDTO(to: params.emailId, subject: "invitation for Topic Subscription",
                    from: "rg488592@gmail.com", linkId: topic.id, content: "your new subscription")
            println(emailDTO.properties)

            emailService.sendInvitation(emailDTO)

        } else
            flash.error = "User Not Found"
    }

}
