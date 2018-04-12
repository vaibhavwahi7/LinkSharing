<%@ page contentType="text/html" %>
<html>
<body>
<p>Hello ... You can now subscribe to this topic :
<g:link controller="topic" action="join" id="${link}"
        base="${grailsApplication.config.grails.serverURL}">Click this link ..</g:link>

</p>

<p>Thank you,<br/> linksharing team</p>
</body>
</html>