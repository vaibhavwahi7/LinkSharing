package gormdemo1

class TestController {

    def index() {
Map name =[1:"vaibhav",2:"wahi"]
        render(view: "index",model:[test: name])

    }
}