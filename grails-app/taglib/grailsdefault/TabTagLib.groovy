package grailsdefault

class TabTagLib {
    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
    static namespace = "tt"



        def closure = {
            attr, body ->
                List list = []
                list.add(attr.name)
                list.add(attr.name1)
                out<<list


    }
}
