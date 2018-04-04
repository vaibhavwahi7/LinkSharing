<%@ page import="linksharing.User" %>
<!Doctype html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>
        Assignment
    </title>



</head>
<body>
<nav class="navbar">
    <div class="panel panel-default">
        <div class="panel-heading">
            <a href="#">
                Link Sharing
            </a>

            <div class="dropdown pull-right">
                <a href="#" class="btn dropdown-toggle pull-right " data-toggle="dropdown" style="margin-left: 30px;">
                    Uday
                    <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li class="dropdown-header"></li>
                    <li><a href="#">Profile</a></li>
                    <li><a data-toggle="modal" data-target="#myModal1">Users</a></li>
                    <li><a href="#">Topics</a></li>
                    <li><a href="#">Posts</a></li>
                    <li><a href="#">Logout</a></li>
                </ul>
            </div>

        </div>
    </div>
</nav>
<div class="row">
    <div class="col-sm-4">
        <div class="panel panel-primary" style="margin-bottom: 0">

            <div class="panel-heading">
                <h3 class="panel-title">
                    Topic("Grails")
                </h3>
            </div>
            <div class="panel-body">

                <div class="row">
                    <div class="col-sm-12">
                        <div class="row">

                            <div class="col-sm-3 glyphicon glyphicon-user fa-5x">

                            </div>
                            <div class="col-sm-9">
                                <a href="#" class="pull-left">Grails(private)</a>
                                <br>
                                <div class="row">

                                    <div class="col-sm-6">
                                        <h6 class="text-muted">@uday</h6>
                                        <a href="#">Unsubscribe</a>
                                    </div>


                                    <div class="col-sm-3">
                                        <h6 class="text-muted pull-left">Subscriptions</h6>
                                        <h6 class="text-primary"></h6>
                                    </div>

                                    <div class="col-sm-3">
                                        <h6 class="text-muted  pull-right">Post
                                            <br>
                                            <br>
                                            <p class="text-primary">30</p>
                                        </h6>

                                    </div>


                                    <span type="img" class="fa fa-envelope pull-right fa-2x" style="margin-right: 20px" data-toggle="modal" data-target="#myModal5">

                                    </span>




                                    <select class="pull-right">
                                        <option>Serious</option>
                                        <option>Private</option>
                                    </select>




                                </div>
                            </div>

                        </div>


                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>