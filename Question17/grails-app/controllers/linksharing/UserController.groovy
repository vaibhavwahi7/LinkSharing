package linksharing

class UserController {



    def index() {

//        render "text dashboard"
        redirect(action: 'show')
    }

    def show(Integer id){

        if(!Topic.findByIdAndVisibility(id,Visibility.PUBLIC)) {
            flash.error="No Topics Found"
            redirect(controller:"login",action:"index")
        }

        else {
            render("sucess")
        }

    }

    }


