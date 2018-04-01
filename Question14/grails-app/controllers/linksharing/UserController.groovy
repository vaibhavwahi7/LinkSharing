package linksharing

class UserController {



    def index() {

//        render "text dashboard"
        redirect(action: 'show')
    }

    def show(Integer id){

        if(Topic.findAllById(id).size()==0) {
            flash.error = "No Topics Found"
            redirect(controller:"login",action:"index")
        }

        else {
            render("Topics Found")
        }
    }
}
