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
<div class="row" style="margin-left: 30%">
    <div class="col-sm-6">
        <div class="panel panel-primary">

            <div class="panel-heading">
                <h3 class="panel-title">
                    Forgot Password
                </h3>
            </div>

            <div class="panel-body">
                <g:form controller="login" action="editSave" method="POST">

                    <label>Enter FirstName:</label>
                    <input class="form-control" type="text" name="firstName" placeholder="Enter Your FirstName">

                    <label>Enter LastName:</label>
                    <input class="form-control" type="text" name="lastName" placeholder="Enter Your LastName">

                    <label>Enter UserName:</label>
                    <input class="form-control" type="text" name="userName" placeholder="Enter Your UserName">

                    <label>Enter Email:</label>
                    <input class="form-control" type="email" name="email" placeholder="Enter Your Email">

                    <p>
                        <g:submitButton name="button" value="Save"/>
                    </p>
                    <div>
<p>Add Photo:
                           <label class="btn btn-primary">
                               <input type="file" style="display:none;" name="photo">
                               browse
                           </label>
    </p>
                       </br>
                       </div>
                </g:form>
            </div>
        </div>
    </div>
</div>

</body>