package co.linksharing

import linksharing.User
import linksharing.Visibility


class ResourceSearchCo extends SearchCO{

    Long topicId
    Visibility visibility
    Long id

    User getUser() {
        User.get(id)
    }
}
