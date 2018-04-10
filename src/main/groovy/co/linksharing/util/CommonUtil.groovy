package co.linksharing.util

class CommonUtil {

    static String getUniqueString()
    {
        final String fileName = UUID.randomUUID().toString().replace("-", "");
        return fileName
    }
}
