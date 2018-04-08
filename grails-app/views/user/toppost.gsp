<%@ page import="linksharing.TopicController; linksharing.User" %>

<html>
<head>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="layout" content="main">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>
        Assignment
    </title>

</head>

<body>
%{--<g:render template="userLogin"></g:render>--}%

<g:render template="/topic/show" var="top" collection="${resources}"></g:render>

</body>
</html>
