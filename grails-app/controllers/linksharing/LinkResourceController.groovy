package linksharing

class LinkResourceController {

    def index() {}


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