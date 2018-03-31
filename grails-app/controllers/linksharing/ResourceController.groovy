package linksharing

class ResourceController {

    def index() {}

    def delete(Integer id) {
        Resource resource = Resource.load(id)

    }

    def objectNotFound(Exception e) {
        render "object not found handled"
    }
}
