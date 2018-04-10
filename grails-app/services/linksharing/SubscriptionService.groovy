package linksharing

import co.linksharing.util.TopicSearchCO
import grails.gorm.transactions.Transactional

@Transactional
class SubscriptionService {

//to get subscribed topics of user
    def search(TopicSearchCO co) {
        if (co.id) {
            User user = co.getUser()
            return user.getSubscribedTopics()
        }
    }
}
