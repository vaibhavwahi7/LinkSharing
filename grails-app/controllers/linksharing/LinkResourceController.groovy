package linksharing

class LinkResourceController extends ResourceController{

    def index() {}

//Question 8  Implement topic/save and linkresource/save save action.
//            Topic, linkresource save should set errors in flash and
//            user should redirected to the dashboard, successful save should set flash.message.


    def save(LinkResource resource) {
        User user = session.user
        resource.user = user
        if (resource.save(flush: true)) {
            addToReadingItems(resource)
            flash.message = "Resource saved Successfully"
        } else {
            flash.error = "Error saving resource"
        }
        redirect(controller: "login", action: "index")
    }

    def saveLink(String link,String description,String topic) {
        Topic topic1=Topic.findByName(topic)
        Resource resource=new LinkResource(url:link,description:description,topic:topic1,user:session.user)

        if(resource.save())
        {
            render "saved successfully"
        }
        else
        {

        }


    }
}