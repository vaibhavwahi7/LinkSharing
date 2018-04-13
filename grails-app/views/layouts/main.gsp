<%@ page import="linksharing.Topic" %>
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

    <g:if test="${session?.user}">
        <div class="dropdown pull-right">
            <a href="#" class="btn dropdown-toggle pull-right " data-toggle="dropdown" style="margin-left: 30px;">
                ${session?.user?.userName}
                <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li class="dropdown-header"></li>
                <li><a href="${createLink(controller: 'user', action: 'profile')}">Profile</a></li>
                <li><a href="${createLink(controller: 'user', action: 'profile')}">Users</a></li>
                <li><a href="${createLink(controller: 'topic', action: 'show')}">Topic</a></li>
                <li><a href="${createLink(controller: 'login', action: 'postRating')}">Posts</a></li>
                <li><g:link controller="login" action="logout">Logout</g:link>
                </li>
            </ul>
        </div>

        <div class="pull-right">
            <ls:userImage id="${session?.user?.id}" height="40px" width="40px"></ls:userImage>
            %{--<img src="${createLink(controller: 'login', action: 'fetchProductImage')}" style="width:30px;height:30px "/>--}%
        </div>



        <button type="img" class="fa fa-file pull-right " style="margin-left: 10px;" data-toggle="modal"
                data-target="#myModal4">

        </button>
        <button type="img" class="glyphicon glyphicon-link pull-right" style="margin-left: 10px;"
                data-toggle="modal" data-target="#myModal3">

        </button>
        <button type="img" class="fa fa-comment pull-right" data-toggle="modal" style="margin-left: 10px;"
                data-target="#myModal2">

        </button>

        <button type="img" class="glyphicon glyphicon-envelope pull-right" data-toggle="modal"
                style="margin-left: 10px;" data-target="#myModal5">

        </button>

        <div class="input-group add-on pull-right">
            <g:form controller="Search" action="index">
                <input placeholder="Search" name="topic" type="text">

                <div class="input-group-btn pull-right">

                    <button class="btn btn-default pull-right" type="submit">

                        <i class="glyphicon glyphicon-search"></i>

                    </button>

                </div>
            </g:form>
        </div>
        </div>
            </div>

</div>
</div>
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
                                            <span>${session?.user?.userName} &nbsp;&nbsp;&nbsp;&nbsp;<small
                                                    class="text-muted">@a${session?.user?.userName}  5min</small>
                                                <a href="#" class="pull-right">${session?.user?.topics?.name}</a>

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
                                                    <textarea name="text" style="width: 100%"
                                                              placeholder="Link"></textarea>
                                                </div>
                                                <br>

                                                <div>
                                                    <select style="width: 100%;height: 100%;" name="visibility">
                                                        <option>public</option>
                                                        <option>private</option>
                                                    </select>

                                                </div>
                                                <br>

                                                <div class="col-sm-12">
                                                    <div class="col-sm-6">

                                                        <button class="btn btn-primary ">Save</button>

                                                        <button class="btn btn-primary pull-right"
                                                                id="topicSaveButton">Cancel</button>
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
                                    <g:form class="form-horizontal" controller="linkResource" action="save">
                                        <div class="col-sm-12">
                                            <div class="col-sm-4">
                                                <div>
                                                    <h3 for="email">Link*</h3>
                                                </div>
                                                <br>

                                                <div>
                                                    <h3 for="email">Description*</h3>
                                                </div>
                                                <br>

                                                <div>
                                                    <br>

                                                    <h3 for="email">Topic*</h3>
                                                </div>
                                                <br>
                                            </div>

                                            <div class="col-sm-8">
                                                <div>
                                                    <textarea style="width: 100%" placeholder="Link" name="url">

                                                    </textarea>
                                                </div>
                                                <br>

                                                <div>
                                                    <textarea class="fa-2x" style="width: 100%;height: 100%;"
                                                              name="description"
                                                              placeholder="Description">
                                                    </textarea>
                                                </div>
                                                <br>

                                                <div>
                                                    <select style="width: 100%;height: 100%;" name="topic" id="topicLink">
                                                        <g:each in="${session?.user?.topics?.name}"><option>${it}</option></g:each>

                                                    </select>

                                                </div>
                                                <br>

                                                <div class="col-sm-12">
                                                    <div class="col-sm-6">
                                                        <g:submitButton name="LinkSave" class="btn btn-primary">Save</g:submitButton>

                                                        <button class="btn btn-primary pull-right">Cancel</button>
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
                                    <g:form controller="documentResource" action="saveDocument">
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
                                                        <input type="file" name="filePath" class="custom-file-input"
                                                               id="inputGroupFile04">
                                                    </div>
                                                    <br>
                                                </div>
                                                <br>

                                                <div>
                                                    <textarea class="fa-2x" style="width: 100%;height: 100%;"
                                                              placeholder="Description" name="description">
                                                    </textarea>
                                                </div>
                                                <br>

                                                <div>
                                                    <select style="width: 100%;height: 100%;">
                                                        <g:each in="${session?.user?.topics?.name}"><option>${it}</option></g:each>
                                                    </select>

                                                </div>
                                                <br>

                                                <div class="col-sm-12">
                                                    <div class="col-sm-6">

                                                        <g:submitButton name="submit"
                                                                        class="btn btn-primary">Save</g:submitButton>

                                                        <button class="btn btn-primary pull-right">Cancel</button>
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
                                    <g:form controller="invitation" action="sendMail">
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
                                                    <input type="text" style="width: 100%" placeholder="Email"
                                                           name="reciever"></textarea>
                                                </div>
                                                <br>

                                                <div>
                                                    <select style="width: 100%;height: 100%;" name="topicName">

                                                        <g:each in="${session?.user?.topics?.name}">
                                                            <option>${it}</option>
                                                        </g:each>

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
                                    </g:form>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>








        </div>

</div>
    </g:if>
</div>

</nav>


<g:if test="${flash.error}"/>
<g:message message="${flash.error}"/>
<g:layoutBody/>

<div class="footer" role="contentinfo"></div>



<asset:javascript src="application.js"/>

</body>
</html>