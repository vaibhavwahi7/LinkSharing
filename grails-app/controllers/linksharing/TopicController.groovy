package linksharing
import co.linksharing.ResourceSearchCo

class TopicController {

    def index() {

    }

    //Q3.

//    def show(ResourceSearchCo resourceSearchCO){
//        def topic = Resource.search(resourceSearchCO).list()
//        render("CreatedBy- $topic.createdby.firstname Topicname- $topic.name")
//        User user=User.read(session.user.id)
//        render(user.topics)
//    }
    def show(ResourceSearchCo resourceSearchCO){
        def topic = Resource.search(resourceSearchCO).list()
        render("CreatedBy- $topic.createdby.firstname Topicname- $topic.name")
        User user=User.read(session.user.id)
        //println user.topics
        render(user.topics)
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

    def save(Topic topic) {
        if (topic.save()) {
            render("saved Successfully")
        } else {
            flash.error = "Error"
        }

    }

}
