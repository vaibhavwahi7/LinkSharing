package linksharing
import co.linksharing.ResourceSearchCo

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

    List<Resource> show(Long id)
    {
      List<Topic> topic =Topic.findAllById(id)
        List<Resource> resources=Resource.findAllById(id)
        render(view: "show" ,model:[topics:topic,res:resources])
    }

    def delete(Integer id){
        Topic topic=Topic.load(id)
        println(topic)
        if(topic.delete()) {
            flash.message="sucess"
            render(action: 'index')
        }
        else {
            flash.error="error"
        }
    }

    def getTrendingTopic(){
        Topic.getTrendingTopics()
    }



    //Question 8  Implement topic/save and linkresource/save save action.
    //            Topic, linkresource save should set errors in flash and
    //            user should redirected to the dashboard, successful save should set flash.message.


    def save(String text,String visibility) {
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


}
