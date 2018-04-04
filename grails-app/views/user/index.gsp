<%@ page import="linksharing.User" %>

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
<div class="container col-sm-12">
    <div class="row">

        <div class="col-sm-4">

            <div class="panel panel-default">
                <div class="panel-body">
                    <div class="col-sm-12">
                        <div class="row">
                            <div class="col-sm-3 glyphicon glyphicon-user fa-5x">
                            </div>
                            <div class="col-sm-9">

                                <p>${session.user.userName}<br><small class="text-muted">@uday</small></p>

                                <div class="row">

                                    <h6 class="text-muted col-sm-6">Subscriptions
                                        <p class="text-primary">${session.user.subscriptions.size()}</p>
                                    </h6>

                                    <h6 class="text-muted col-sm-6">Topics
                                        <p class="text-primary">${session.user.topics.size()}</p>
                                    </h6>

                                </div>


                            </div>

                        </div>
                    </div>
                </div>

            </div>linksharing.Subscription.user
            <div>
                <p>"Subscribed users are:- "${linksharing.User.listOrderBySubscriptions()}</p>
            </div>
        </div>
    </div>
</div>
</body>
</html>
