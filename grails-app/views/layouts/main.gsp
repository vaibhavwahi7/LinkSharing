%{--Question1:  Add Application layout--}%
%{--Question2: Application layout should use bootstrap and font awesome--}%

%{--Question6: Update layout main.gsp according to the document
               mentioned in intro to linksharing, add flash message
               and flash error in layout by using g:if tag--}%

<!doctype html>
<html lang="en" class="no-js">
<head>

    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <meta name="viewport" content="width=device-width, initial-scale=1"/>


    <g:layoutHead/>
</head>
<body>

<nav class="navbar" style="width:100%">
    <div class="container-fluid">
        <div class="panel panel-default">

            <div class="panel-heading">
                <a href="#">
                    Link Sharing
                </a>

    <g:if test="${session.user!=null}">


    <div class="dropdown pull-right">
    <a href="#" class="btn dropdown-toggle pull-right " data-toggle="dropdown" style="margin-left: 30px;">
    Uday
    <span class="caret"></span></a>
    <ul class="dropdown-menu">
    <li class="dropdown-header"></li>
    <li><a href="#">Profile</a></li>
    <li><a data-toggle="modal" data-target="#myModal1">Users</a></li>
    <li><a href="/topic/index">Topics</a></li>
    <li><a href="#">Posts</a></li>
    <li><a href="#">Logout</a></li>
    </ul>
    </div>



    <div class="glyphicon glyphicon-user pull-right" style="margin-left: 30px; margin-top: 5px; "></div>



    <button type="img" class="fa fa-file pull-right " style="margin-left: 10px;" data-toggle="modal" data-target="#myModal4">

    </button>
    <button type="img" class="glyphicon glyphicon-link pull-right"  style="margin-left: 10px;" data-toggle="modal" data-target="#myModal3">

    </button>
    <button type="img" class="fa fa-comment pull-right" data-toggle="modal"  style="margin-left: 10px;"  data-target="#myModal2">

    </button>

    <button type="img" class="glyphicon glyphicon-envelope pull-right" data-toggle="modal"  style="margin-left: 10px;" data-target="#myModal5">

    </button>

    <div class="input-group add-on pull-right	">
    <input placeholder="Search" 	type="text">
    <div class="input-group-btn pull-right">
    <button class="btn btn-default pull-right" type="submit"><i class="glyphicon glyphicon-search"></i></button>
    </div>
    </div>
    </div>
        </div>
</g:if>
        </div>
    </div>

</nav>


<g:if test="${flash.error}"/>
<g:message message="${flash.error}"/>
    <g:layoutBody/>

    <div class="footer" role="contentinfo"></div>



    <asset:javascript src="application.js"/>

</body>
</html>
