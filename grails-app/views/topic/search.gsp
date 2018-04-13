<!doctype html>
<html>
<head>

    <title>Untitled Document</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>

<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Link Sharing</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->


        <ul class="nav navbar-nav navbar-right">
            <form class="navbar-form navbar-left">
                <div class="form-group">
                    <i class="glyphicon glyphicon-search btn" style="margin-right:-20%; border-radius:15px;"></i><input
                        type="text" class="form-control" placeholder="Search"
                        style="border-radius:15px; padding-left:20%;">
                </div>
                <button type="img" class="glyphicon glyphicon-file pull-right" style="margin-top:2%;"
                        data-toggle="modal" data-target="#myModal4">

                </button>
                <button type="img" class="glyphicon glyphicon-link pull-right" style="margin-top:2%;"
                        data-toggle="modal" data-target="#myModal3">

                </button>
                <button type="img" class="glyphicon glyphicon-comment pull-right" style="margin-top:2%;"
                        data-toggle="modal" data-target="#myModal2">

                </button>

                <button type="img" class="glyphicon glyphicon-envelope pull-right" style="margin-top:2%;"
                        data-toggle="modal" data-target="#myModal5">

                </button>

            </form>
            <i class="glyphicon glyphicon-user" style="margin:3%  0 0;"></i>
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
               aria-expanded="false">Uday<span class="caret"></span></a>
            <ul class="dropdown-menu">

                <li><a href="#">Profile</a></li>
                <li><a data-toggle="modal" data-target="#myModal1">Users</a></li>
                <li><a href="#">Topics</a></li>
                <li><a href="#">Posts</a></li>
                <li><a href="#">Logout</a></li>

            </ul>

        </ul>
    </div>

</nav>


<div class="container">

    <div class="row">

        <div class="col-sm-4">

            <div class="panel panel-primary" style="margin-bottom: 0">

                <div class="panel-heading">
                    <h3 class="panel-title">
                        Trending Topics

                    </h3>

                </div>

                <div class="panel-body">

                    <div class="row">
                        <div class="col-sm-12">

                            <div class="row">

                                <div class="col-sm-3 glyphicon glyphicon-user fa-5x">
                                    <!--  <img src="avatar.png" class="img-thumbnail"> -->

                                </div>

                                <div class="col-sm-9">
                                    <a href="#" class="pull-left">Grails</a>
                                    <br>

                                    <div class="row">

                                        <div class="col-sm-6">
                                            <h6 class="text-muted">@uday</h6>
                                            <a href="#">Subscription</a>
                                        </div>


                                        <div class="col-sm-3">
                                            <h6 class="text-muted pull-left">Subscriptions</h6>
                                            <h6 class="text-primary">50</h6>
                                        </div>

                                        <div class="col-sm-3">
                                            <h6 class="text-muted  pull-right">Post</h6>
                                            <br>

                                            <h6 class="text-primary">30
                                            </h6>

                                        </div>

                                    </div>
                                </div>

                            </div>

                        </div>
                    </div>

                </div>

            </div>

            <div class="panel panel-primary">
                <div class="panel-body">

                    <div class="row">
                        <div class="col-sm-12">

                            <div class="row">

                                <div class="col-sm-3 glyphicon glyphicon-user fa-5x">
                                    <!--  <img src="avatar.png" class="img-thumbnail"> -->

                                </div>

                                <div class="col-sm-9">
                                    <form class="form-inline">

                                        <input type="text" placeholder="Grail">


                                        <input type="button" value="Save">
                                    </form>

                                    <div class="row">

                                        <div class="col-sm-6">
                                            <h6 class="text-muted">@uday</h6>
                                            <a href="#">Unsubscribe</a>
                                        </div>


                                        <div class="col-sm-3">
                                            <h6 class="text-muted pull-left">Subscriptions</h6>
                                            <h6 class="text-primary">50</h6>
                                        </div>

                                        <div class="col-sm-3">
                                            <h6 class="text-muted  pull-right">Post</h6>
                                            <br/>

                                            <h6 class="text-primary">30
                                            </h6>

                                        </div>
                                        <span type="img" class="fa fa-file pull-right fa-2x"
                                              style="margin-left: 10px;  margin-right: 5px;" data-toggle="modal"
                                              data-target="#myModal4">

                                        </span>

                                        <span type="img" class="fa fa-envelope pull-right fa-2x"
                                              style="margin-left: 10px;" data-toggle="modal" data-target="#myModal5">

                                        </span>

                                        <span type="img" class="glyphicon glyphicon-trash pull-right fa-2x"
                                              style="margin-left: 10px;" data-toggle="modal" data-target="#myModal">

                                        </span>



                                        <select class="pull-right">
                                            <option>Serious</option>
                                            <option>Private</option>
                                        </select>

                                        <div>
                                            <select class="pull-right">
                                                <option>Private</option>
                                                <option>Public</option>
                                            </select>

                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>

            <div class="panel panel-primary">

                <div class="panel panel-primary">

                    <div class="panel-heading">
                        <h3 class="panel-title">
                            Top Post
                        </h3>
                    </div>

                    <div class="panel-body">

                        <div class="col-sm-12">
                            <div class="row">
                                <div class="col-sm-3 glyphicon glyphicon-user fa-5x">
                                </div>

                                <div class="col-sm-9">
                                    <span>Uday Pratap Singh <small class="text-muted">@Uday</small>
                                        <a href="#" class="pull-right">Grail</a>
                                        <br/><br/>

                                        <p>
                                            Lorem ipsum dolor sit ament,consectetuer
                                            edipiscing elit.Nulla cum vali cultuer.

                                        </p>
                                    </span>

                                </div>

                                <div>
                                    <i class="fa fa-facebook-square "></i>
                                    <i class="fa fa-google-plus-square "></i>
                                    <i class="fa fa-twitter "></i>
                                    <a href="#" style=" font-size:12px">Download</a>
                                    <a href="#" style="font-size:12px">View full Site</a>
                                    <a href="#" style="font-size:12px">Mark as read</a>
                                    <a href="#" style="font-size:12px">View Post</a>
                                </div>

                            </div>
                        </div>

                    </div>
                </div>

                <div class="panel panel-primary">
                    <div class="panel-body">

                        <div class="col-sm-12">
                            <div class="row">
                                <div class="col-sm-3 glyphicon glyphicon-user fa-5x">
                                </div>

                                <div class="col-sm-9">
                                    <span>Uday Pratap Singh <small class="text-muted">@Uday</small>
                                        <a href="#" class="pull-right">Grail</a>
                                        <br/><br/>

                                        <p>
                                            Lorem ipsum dolor sit ament,consectetuer
                                            edipiscing elit.Nulla cum vali cultuer.

                                        </p>
                                    </span>

                                </div>

                                <div>
                                    <i class="fa fa-facebook-square "></i>
                                    <i class="fa fa-google-plus-square "></i>
                                    <i class="fa fa-twitter "></i>
                                    <a href="#" style="font-size:12px">Download</a>
                                    <a href="#" style="font-size:12px">View full Site</a>
                                    <a href="#" style="font-size:12px">Mark as read</a>
                                    <a href="#" style="font-size:12px">View Post</a>
                                </div>

                            </div>
                        </div>

                    </div>
                </div>

            </div>

        </div>


        <div class="col-sm-8">
            <div class="panel panel-primary">

                <div class="panel panel-primary">

                    <div class="panel-heading">
                        <h3 class="panel-title">
                            Search for "test"
                        </h3>
                    </div>

                    <div class="panel-body">

                        <div class="col-sm-12">
                            <div class="row">
                                <div class="col-sm-3 glyphicon glyphicon-user fa-5x">
                                </div>

                                <div class="col-sm-9">
                                    <span>Uday Pratap Singh <small class="text-muted">@Uday</small>
                                        <a href="#" class="pull-right">Grail</a>
                                        <br/><br/>

                                        <p>l
                                        Lorem ipsum dolor sit ament,consectetuer
                                        edipiscing elit.Nulla cum vali cultuer.

                                        </p>
                                    </span>
                                    <i class="fa fa-facebook-square fa-2x "></i>
                                    <i class="fa fa-google-plus-square fa-2x"></i>
                                    <i class="fa fa-twitter fa-2x "></i>
                                    <a href="#" class="pull-right"
                                       style="font-size:15px; margin-left:10px ;">Download</a>
                                    <a href="#" class="pull-right"
                                       style="font-size:15px; margin-left:10px ;">View full Site</a>
                                    <a href="#" class="pull-right"
                                       style="font-size:15px; margin-left:10px ;">Mark as read</a>
                                    <a href="#" class="pull-right"
                                       style="font-size:15px; margin-left:10px ;">View Post</a>
                                </div>

                                <div>

                                </div>

                            </div>
                        </div>

                    </div>
                </div>

                <div class="panel panel-primary">
                    <div class="panel-body">

                        <div class="col-sm-12">
                            <div class="row">
                                <div class="col-sm-3 glyphicon glyphicon-user fa-5x">
                                </div>

                                <div class="col-sm-9">
                                    <span>Uday Pratap Singh <small class="text-muted">@Uday</small>
                                        <a href="#" class="pull-right">Grail</a>
                                        <br/><br/>

                                        <p>
                                            Lorem ipsum dolor sit ament,consectetuer
                                            edipiscing elit.Nulla cum vali cultuer.

                                        </p>
                                    </span>
                                    <i class="fa fa-facebook-square fa-2x "></i>
                                    <i class="fa fa-google-plus-square fa-2x"></i>
                                    <i class="fa fa-twitter fa-2x "></i>
                                    <a href="#" class="pull-right"
                                       style="font-size:15px; margin-left:10px ;">Download</a>
                                    <a href="#" class="pull-right"
                                       style="font-size:15px; margin-left:10px ;">View full Site</a>
                                    <a href="#" class="pull-right"
                                       style="font-size:15px; margin-left:10px ;">Mark as read</a>
                                    <a href="#" class="pull-right"
                                       style="font-size:15px; margin-left:10px ;">View Post</a>
                                </div>

                                <div>

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
