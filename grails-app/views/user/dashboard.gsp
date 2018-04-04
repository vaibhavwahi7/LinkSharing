<%@ page import="linksharing.User; linksharing.LoginController" %>
<!Doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>

<body>

<div id="myModal1" class="modal fade" role="dialog">
    <div class="container col-sm-12">
        <div class="row">

            <div class="col-sm-8">

                <div class="panel panel-primary">

                    <div class="panel-heading">
                        <h3 class="panel-title">
                            Inbox
                            <button type="button" class="close pull-right" data-dismiss="modal">&times;</button>
                        </h3>
                    </div>

                    <div class="panel-body">

                        <div class="col-sm-12">
                            <div class="row">
                                <div class="col-sm-2 glyphicon glyphicon-user fa-5x">
                                    <!--  <img src="avatar.png" class="img-thumbnail"> -->

                                </div>

                                <div class="col-sm-10">
                                    <span>Uday Pratap Singh &nbsp;&nbsp;&nbsp;&nbsp;<small
                                            class="text-muted">@Uday  5min</small>
                                        <a href="#" class="pull-right">Grails</a>

                                        <p>
                                            lasjbdjb asjbdashj asjkdbjasd djknasndjk asdnasjknd jkasdjjassajkndjskadjkkjksadjknj
                                            adksjnasd jkansjkdnas askdnasjkn m,as dasdjkasjd jknkjjknds asjndnasd jknasjkd jkasndj
                                            askndklkasndjksa
                                        </p>
                                    </span>

                                    <div>
                                        <img src="fb.png">
                                        <img src="twitter.png">
                                        <img src="google-1.png">
                                        <a href="#" class="pull-right">View Post</a>
                                    </div>
                                </div>

                            </div>
                        </div>


                        <div class="col-sm-12">
                            <div class="row">
                                <div class="col-sm-2 glyphicon glyphicon-user fa-5x">
                                    <!--  <img src="avatar.png" class="img-thumbnail"> -->

                                </div>

                                <div class="col-sm-10">
                                    <span>Uday Pratap Singh &nbsp;&nbsp;&nbsp;&nbsp;<small
                                            class="text-muted">@Uday  5min</small>
                                        <a href="#" class="pull-right">Grails</a>

                                        <p>
                                            lasjbdjb asjbdashj asjkdbjasd djknasndjk asdnasjknd jkasdjjassajkndjskadjkkjksadjknj
                                            adksjnasd jkansjkdnas askdnasjkn m,as dasdjkasjd jknkjjknds asjndnasd jknasjkd jkasndj
                                            askndklkasndjksa
                                        </p>
                                    </span>

                                    <div>
                                        <img src="fb.png">
                                        <img src="twitter.png">
                                        <img src="google-1.png">
                                        <a href="#" class="pull-right">View Post</a>
                                    </div>
                                </div>

                            </div>
                        </div>

                    </div>

                </div>

            </div>
        </div>
    </div>
</div>
</div>
</div>





<div id="myModal2" class="modal fade" role="dialog">
    <div class="container col-sm-12">
        <div class="row">

            <div class="col-sm-8">

                <div class="panel panel-primary">

                    <div class="panel-heading">
                        <h3 class="panel-title">
                            Create Topic (Pop-up)
                            <button type="button" class="close pull-right" data-dismiss="modal">&times;</button>
                        </h3>
                    </div>
                    <g:form controller="topic" action="save" method="POST">
                        <div class="panel">
                            <div class="panel-body">

                                <div class="col-sm-12">
                                    <div class="col-sm-4">
                                        <div>
                                            <h4>Name*</h4>
                                        </div>
                                        <br>

                                        <div>
                                            <h4>Visibility*</h4>
                                        </div>
                                        <br>

                                    </div>

                                    <div class="col-sm-8">
                                        <div>
                                            <textarea name="text" style="width: 100%" placeholder="Link"></textarea>
                                        </div>
                                        <br>

                                        <div>
                                            <select style="width: 100%;height: 100%;">
                                                <option>public</option>
                                                <option>private</option>
                                            </select>

                                        </div>
                                        <br>

                                        <div class="col-sm-12">
                                            <div class="col-sm-6">

                                                <button class="btn btn-primary ">Save</button>

                                                <button class="btn btn-primary pull-right">Cancel</button>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </g:form>
                </div>
            </div>
        </div>
    </div>
</div>


<div id="myModal3" class="modal fade" role="dialog">
    <div class="container col-sm-12">
        <div class="row">

            <div class="col-sm-8">

                <div class="panel panel-primary">

                    <div class="panel-heading">
                        <h3 class="panel-title">
                            Share Link (Pop-up)
                            <button type="button" class="close pull-right" data-dismiss="modal">&times;</button>
                        </h3>
                    </div>

                    <div class="panel">
                        <div class="panel-body">

                            <div class="col-sm-12">
                                <div class="col-sm-4">
                                    <div>
                                        <h3>Link*</h3>
                                    </div>
                                    <br>

                                    <div>
                                        <h3>Description*</h3>
                                    </div>
                                    <br>

                                    <div>
                                        <br>

                                        <h3>Topic*</h3>
                                    </div>
                                    <br>
                                </div>

                                <div class="col-sm-8">
                                    <div>
                                        <textarea style="width: 100%" placeholder="Link"></textarea>
                                    </div>
                                    <br>

                                    <div>
                                        <textarea class="fa-2x" style="width: 100%;height: 100%;"
                                                  placeholder="Description">
                                        </textarea>
                                    </div>
                                    <br>

                                    <div>
                                        <select style="width: 100%;height: 100%;">
                                            <option>Topic</option>
                                            <option>Link</option>
                                        </select>

                                    </div>
                                    <br>

                                    <div class="col-sm-12">
                                        <div class="col-sm-6">

                                            <button class="btn btn-primary">Share</button>

                                            <button class="btn btn-primary pull-right">Cancel</button>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>


<div id="myModal4" class="modal fade" role="dialog">
    <div class="container col-sm-12">
        <div class="row">

            <div class="col-sm-8">

                <div class="panel panel-primary">

                    <div class="panel-heading">
                        <h3 class="panel-title">
                            Share Link (Pop-up)
                            <button type="button" class="close pull-right" data-dismiss="modal">&times;</button>
                        </h3>
                    </div>

                    <div class="panel">
                        <div class="panel-body">

                            <div class="col-sm-12">
                                <div class="col-sm-4">
                                    <div>
                                        <h3>Document*</h3>
                                    </div>
                                    <br>

                                    <div>
                                        <h3>Description*</h3>
                                    </div>
                                    <br>

                                    <div>
                                        <br>

                                        <h3>Topic*</h3>
                                    </div>
                                    <br>
                                </div>

                                <div class="col-sm-8">
                                    <div>
                                        <br>

                                        <div class="input-group">
                                            <input type="file" class="custom-file-input" id="inputGroupFile04">
                                        </div>
                                        <br>
                                    </div>
                                    <br>

                                    <div>
                                        <textarea class="fa-2x" style="width: 100%;height: 100%;"
                                                  placeholder="Description">
                                        </textarea>
                                    </div>
                                    <br>

                                    <div>
                                        <select style="width: 100%;height: 100%;">
                                            <option>Topic</option>
                                            <option>Link</option>
                                        </select>

                                    </div>
                                    <br>

                                    <div class="col-sm-12">
                                        <div class="col-sm-6">

                                            <button class="btn btn-primary">Share</button>

                                            <button class="btn btn-primary pull-right">Cancel</button>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>


<div id="myModal5" class="modal fade" role="dialog">
    <div class="container col-sm-12">
        <div class="row">

            <div class="col-sm-8">

                <div class="panel panel-primary">

                    <div class="panel-heading">
                        <h3 class="panel-title">
                            Send Invitation (Pop-up)
                            <button type="button" class="close pull-right" data-dismiss="modal">&times;</button>
                        </h3>
                    </div>

                    <div class="panel">
                        <div class="panel-body">

                            <div class="col-sm-12">
                                <div class="col-sm-4">
                                    <div>
                                        <h4>Email*</h4>
                                    </div>
                                    <br>

                                    <div>
                                        <h4>Topic*</h4>
                                    </div>
                                    <br>

                                </div>

                                <div class="col-sm-8">
                                    <div>
                                        <input type="text" style="width: 100%" placeholder="Email"></textarea>
                                    </div>
                                    <br>

                                    <div>
                                        <select style="width: 100%;height: 100%;">
                                            <option>Topic</option>
                                            <option>Link</option>
                                        </select>

                                    </div>
                                    <br>

                                    <div class="col-sm-12">
                                        <div class="col-sm-6">

                                            <button class="btn btn-primary ">Invite</button>

                                            <button class="btn btn-primary pull-right">Cancel</button>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>








</div>
</div>
</div>




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
                                        <p class="text-primary">
                                            %{--${session.user?.getSubscribedTopic().size}--}%
                                            ${session.user.subscriptions.size()}
                                            ${session.user.subscriptions.topic.name.size()}
                                        </p>
                                    </h6>

                                    <h6 class="text-muted col-sm-6">Topics
                                        <p class="text-primary">30</p>
                                    </h6>

                                </div>
                            </div>

                        </div>
                    </div>
                </div>

            </div>


            <div class="panel panel-primary" style="margin-bottom: 0">

                <div class="panel-heading">
                    <h3 class="panel-title">
                        Subscriptions
                        <a href="#" class="pull-right">View All</a>
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
                                            <a href="#">Unsubscribe</a>
                                        </div>


                                        <div class="col-sm-3">
                                            <h6 class="text-muted pull-left">Subscriptions</h6>
                                            <h6 class="text-primary">50</h6>
                                        </div>

                                        <div class="col-sm-3">
                                            <h6 class="text-muted  pull-right">Post
                                                <br>
                                                <br>

                                                <p class="text-primary">30</p>
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
                                            <a href="#">Unsubscribe</a>
                                        </div>


                                        <div class="col-sm-3">
                                            <h6 class="text-muted pull-left">Subscriptions</h6>
                                            <h6 class="text-primary">50</h6>
                                        </div>

                                        <div class="col-sm-3">
                                            <h6 class="text-muted  pull-right">Post
                                                <br>
                                                <br>

                                                <p class="text-primary">30</p>
                                            </h6>

                                        </div>


                                        <span type="img" class="fa fa-envelope pull-right fa-2x"
                                              style="margin-left: 10px; margin-right: 5px;" data-toggle="modal"
                                              data-target="#myModal5">

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


            <div class="panel panel-primary" style="margin-bottom: 0">

                <div class="panel-heading">
                    <h3 class="panel-title">
                        Subscriptions
                        <a href="#" class="pull-right">View All</a>
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
                                            <a href="#">Unsubscribe</a>
                                        </div>


                                        <div class="col-sm-3">
                                            <h6 class="text-muted pull-left">Subscriptions</h6>
                                            <h6 class="text-primary">50</h6>
                                        </div>

                                        <div class="col-sm-3">
                                            <h6 class="text-muted  pull-right" ">Post
                                            <br>
                                            <br>

                                            <p class="text-primary">30</p>
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
                                    <a href="#" class="pull-left">Grails</a>
                                    <br>

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
                                            <h6 class="text-muted  pull-right" ">Post
                                            <br>
                                            <br>

                                            <p class="text-primary">30</p>
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

                <div class="panel-heading">
                    <h3 class="panel-title">
                        Login
                    </h3>
                </div>

                <div class="panel-body">

                    <form class="form-inline">

                        <label>Enter Username:</label><input type="text" class="form-control">

                    </form>

                    <form class="form-inline">
                        <label>Enter Password:</label><input type="Password" class="form-control">

                    </form>


                    <a href="#">Forgot Password ?</a> <input type="button" class="pull-right col-sm-4" value="Login">

                </div>
            </div>

        </div>
    </div>
</div>
</body>
</html>