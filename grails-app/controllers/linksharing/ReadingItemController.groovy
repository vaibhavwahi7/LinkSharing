package linksharing

class ReadingItemController {

    def index() { }
    def changeIsRead(Long id,Boolean isRead){
        if(ReadingItem.executeUpdate([isRead:isRead,id:id])==0){
            render("error")
        }
        else
            render("success")
    }
}
