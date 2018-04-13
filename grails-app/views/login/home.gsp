<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <asset:javascript src="jquery-2.2.0.min.js"/>


</head>

<body>
<div class="row">
    <div class="container col-sm-12">

        <div class="col-sm-6">
            <div class="panel panel-primary">

                <div class="panel-heading">
                    <h3 class="panel-title">
                        Top Post
                    </h3>
                </div>

                <div class="panel-body">

                    <g:render template="/login/recentshares2" var="po" collection="${resources1}"/>
                    %{--<g:render template="/login/recentshares2" var="res" collection="${resource}"/>--}%

                </div>

                <div></div>
                <g:render template="recentShares"></g:render>

            </div>
        </div>

        <div class="col-sm-6">
            <g:render template="login"></g:render>

            <div>
                <g:render template="/register/registermain"></g:render>
            </div>

        </div>

    </div>
</div>
</body>
</html>