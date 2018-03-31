package linksharing

class TopicController {

    def index() {

    }

    def show() {
        User user = Topic.read(session.user.id)
        render user.topics
    }

    def delete(Long id) {
        Topic topic = Topic.load(id)
        topic.delete()
        render "success"

    }

    def save(Topic topic, String seriousness) {

        if (topic.save()) {
            render "saved Successfully"
        } else {
            flash.error = "Error"
            render "could not able to save the topic"
        }
    }
}
