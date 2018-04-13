package linksharing

class LinkResourceController extends ResourceController{

    def index() {}

//Question 8  Implement topic/save and linkresource/save save action.
//            Topic, linkresource save should set errors in flash and
//            user should redirected to the dashboard, successful save should set flash.message.



    def save(String url,String description,String topic) {
        Topic topic1=Topic.findByName(topic)
        Resource resource=
        new LinkResource(url:url,description:description,topic:topic1.id,user:session.user)

        if(resource.save())
        {

            render "saved successfully"
        }
        else
        {
         println resource.errors.allErrors
        }


    }
}