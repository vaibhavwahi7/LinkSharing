<!doctype html>
<html lang="en" class="no-js">
<head>

    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>

        <g:layoutTitle default="Grails"/>


    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>
<body>

<nav class="navbar">
    <div class="panel panel-default">

        <div class="panel-heading">
            <a href="#">
                Link Sharing
            </a>

            <input class="glyphicon glyphicon-search pull-right" placeholder="Search" >
        </div>
    </div>
</nav>

<g:if test="${flash.error}"/>
<g:message message="${flash.error}"/>
    <g:layoutBody/>

    <div class="footer" role="contentinfo"></div>



    <asset:javascript src="application.js"/>

</body>
</html>
