package linksharing

class SearchController {

   def index()
   {
       List<Topic> topicList = Topic.findAllByNameIlike("%${searchObject}%")
       return topicList
       render (view: 'index')
   }
}