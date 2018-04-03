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

    def getTrendingTopic(){
        Topic.getTrendingTopics();
    }


    def save(Topic topic) {
        topic.createdBy=session.user
        if(topic.save()){
            flash.message="Saved"

        }
        else{
            flash.error="Error"

        }
        forward(controller:'user', action: 'index')

    }

}
