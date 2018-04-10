<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>

<body>
<div class="row">
    <div class="container col-sm-12">
        <div class="col-sm-5">

            <div class="panel panel-primary">

                <div class="panel-heading">
                    <h3 class="panel-title">
                        TrendingTopic.
                    </h3>
                </div>
                %{--<g:render template="userLogin"></g:render>--}%
                <g:render template="/user/trendingTopic" var="trend" collection="${topic}"></g:render>

                %{--<g:render template="/topic/show" var="top1" collection="${resources}"></g:render>--}%
                %{--<ls:top></ls:top>--}%
</body>
</html>
