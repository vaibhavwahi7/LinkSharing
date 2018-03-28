package grailsdefault

class UtilController {

    def index() {

        log.trace "Hello world"
        log.error "Hello world"
        log.warn "Hello world"
        log.info "Hello world"
        log.debug "Hello world"

        log.info "request params: $params"


        render "hello"

    }
}