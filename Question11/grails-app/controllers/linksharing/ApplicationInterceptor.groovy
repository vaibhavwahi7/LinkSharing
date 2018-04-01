package linksharing


class ApplicationInterceptor {

    boolean before() {

        log.info("ACTION AND CONTROLLER LOG: ${params.toString()}")
        true
    }

    boolean after() {

        log.info("ACTION AND CONTROLLER LOG: ${params.toString()}")
        true
    }

    void afterView() {
        // no-op
    }
}
