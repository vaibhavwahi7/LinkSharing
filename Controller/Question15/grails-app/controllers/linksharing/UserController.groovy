package linksharing

class UserController {

    def index() {
        render(session.user.userName)
    }

    def show(Integer id){

    }
    }


