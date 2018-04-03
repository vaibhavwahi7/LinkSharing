<%--
  Created by IntelliJ IDEA.
  User: vaibhav
  Date: 2/4/18
  Time: 8:02 PM
--%>


<html>
<head>

    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
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

            <input class="glyphicon glyphicon-search pull-right" placeholder="Search" >
        </div>
    </div>
</nav>
<div class="container col-sm-12">
    <div class="row">

        <div class="col-sm-8">

            <div class="panel panel-primary">

                <div class="panel-heading">
                    <h3 class="panel-title">
                        Recent Shares
                    </h3>
                </div>

                <div class="panel-body">


                    <div class="col-sm-12">
                        <div class="row">
                            <div class="col-sm-2 glyphicon glyphicon-user fa-5x">
                                <!--  <img src="avatar.png" class="img-thumbnail"> -->

                            </div>
                            <div class="col-sm-10">
                                <span>Uday Pratap Singh &nbsp;&nbsp;&nbsp;&nbsp;<small class="text-muted">@Uday  5min</small>
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
                                <span>Uday Pratap Singh &nbsp;&nbsp;&nbsp;&nbsp;<small class="text-muted">@Uday  5min</small>
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





            <div class="panel panel-primary">

                <div class="panel-heading">

                    <select class="pull-right">
                        <option>vaibhav</option>
                        <option>ajay</option>
                    </select>


                    <h3 class="panel-title">
                        Recent Shares
                    </h3>
                </div>

                <div class="panel-body">
                    <div class="col-sm-12">
                        <div class="row">
                            <div class="col-sm-2 glyphicon glyphicon-user fa-5x">
                                <!--  <img src="avatar.png" class="img-thumbnail"> -->

                            </div>
                            <div class="col-sm-10">
                                <span>Uday Pratap Singh &nbsp;&nbsp;&nbsp;&nbsp;<small class="text-muted">@Uday  5min</small>
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

        <div class="col-sm-4">
            <div class="panel panel-primary">

                <div class="panel-heading">
                    <h3 class="panel-title">
                        Login
                    </h3>
                </div>

                <div class="panel-body">

<g:form controller="login" action="loginHandler" method="POST">

    <label>Enter Username:</label>
    <input class="form-control" type="text" name="userName" placeholder="Enter Your Username">

    <label>Enter Password:</label>
    <input class="form-control" type="password" name="password" placeholder="Enter Your Password">

    <p><a href="#">Forgot Password</a></p>
    <g:submitButton name="button" value="Login"/>
</g:form>

                </div>
            </div>

        </div>




        <div class="col-sm-4">
            <div class="panel panel-primary">

                <div class="panel-heading">
                    <h3 class="panel-title">
                        Register
                    </h3>
                </div>


                <div class="panel-body">

                    <form class="form-horizontal">
                        <div class="form-group">



                            <label  class="control-label col-sm-4"> First name :</label><div class="col-sm-6"><input type="text" class="form-control " ></div>

                        </div>

                        <div class="form-group">

                            <label class="control-label col-sm-4"> Last name :</label><div class="col-sm-6"><input type="text" class="form-control"></div>
                        </div>

                        <div class="form-group">

                            <label class="control-label col-sm-4"> Email :</label><div class="col-sm-6"><input type="text" class="form-control"></div>
                        </div>

                        <div class="form-group">

                            <label class="control-label col-sm-4"> Username :</label><div class="col-sm-6"><input type="text" class="form-control"></div>
                        </div>

                        <div class="form-group">

                            <label class="control-label col-sm-4"> Password :</label><div class="col-sm-6"><input type="text" class="form-control"></div>
                        </div>

                        <div class="form-group">

                            <label class="control-label col-sm-4"> Confirm :</label><div class="col-sm-6"><input type="text" class="form-control"></div>
                        </div>

                        <div class="form-group">


                            <label class="control-label col-sm-4"> Photo :</label><div class="col-sm-5"><input type="text" class="form-control"></div><div class="col-sm-2">
                            <button>Browse</button></div>



                        </div>
                        <div class="col-sm-3 pull-right"><button>Register</button></div>
                    </form>





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
