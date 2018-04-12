package linksharing

class DocumentResource extends Resource {

    String filePath
    String contentType
    String fileName
    static transients = ['contentType','fileName']
    static constraints = {

        filePath(blank: false, nullable: false)
         contentType  validator: { val, obj ->
            if (val == null) {
                return false
            }
            if (val.empty) {
                return false
            }

            ['pdf'].any { extension ->
                val.contentType?.toLowerCase()?.endsWith(extension)
                val.equals(DefaultPassword.DOCUMENT_CONTENT_TYPE)
            }


        }


    }



}
