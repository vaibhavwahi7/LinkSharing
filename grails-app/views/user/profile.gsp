%{--<%@ page contentType="text/html;charset=UTF-8" %>--}%
%{--<html>--}%
%{--<head>--}%
    %{--<title></title>--}%
    %{--<meta name="layout" content="main"/>--}%
    %{--<script>--}%
        %{--$(document).ready(function () {--}%
            %{--$.ajax({--}%
                %{--url: "/user/topics",--}%
                %{--data: {--}%
                    %{--id: $('#userId').val()--}%
                %{--},--}%
                %{--success: function (result) {--}%
                    %{--$('#topicsPanel').html(result);--}%
                %{--}--}%
            %{--});--}%

            %{--$.ajax({--}%
                %{--url: "/user/subscriptions",--}%
                %{--data: {id: $("#userId").val()},--}%
                %{--success: function (result) {--}%
                    %{--$('#subscribedTopics').html(result)--}%
                %{--}--}%
            %{--});--}%


        %{--});--}%
    %{--</script>--}%
%{--</head>--}%


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
<g:render template="/resource/edit"></g:render>
</body>
</html>