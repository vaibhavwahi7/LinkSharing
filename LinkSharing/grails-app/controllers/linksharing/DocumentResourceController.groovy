package linksharing

import co.linksharing.util.CommonUtil
import grails.gorm.transactions.Transactional

class DocumentResourceController extends ResourceController{

    def index() {}


    @Transactional
    def saveDocument(String filePath, String description, String topic) {

        final String filename = CommonUtil.getUniqueString()
        Topic topic1 = Topic.findByName(topic)
        Resource resource = new DocumentResource(filePath: filePath, description: description, topic: topic1, user: session.user)



        resource.user = session.user

        if (resource.save()) {
            render "saved successfully"
        } else {

        }


    }

}
