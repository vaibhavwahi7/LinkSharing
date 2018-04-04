package linksharing

class LinkResourceController {

    def index() {}

//Question 8  Implement topic/save and linkresource/save save action.
//            Topic, linkresource save should set errors in flash and
//            user should redirected to the dashboard, successful save should set flash.message.


    def save(Topic topic) {
        topic.createdBy = session.user
        if (topic.save()) {
            flash.message = "Saved"

        } else {
            flash.error = "Error"

        }
        forward(controller: 'user', action: 'index')
    }
}