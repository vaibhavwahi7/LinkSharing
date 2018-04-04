<%--
  Created by IntelliJ IDEA.
  User: vaibhav
  Date: 2/4/18
  Time: 8:02 PM
--%>


%{--Question 9: Login should work from login form on home page
                and show top posts and recent post on home page--}%


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

    <p>
        <a href="/user/forgotPass">Forgot Password</a></p>

    <g:submitButton name="button" value="Login"/>
    <p>
        <a href="/register/index">Register</a></p>
</g:form>

                </div>
            </div>

        </div>






</body>
</html>
