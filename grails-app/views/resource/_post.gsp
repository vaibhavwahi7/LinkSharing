<%@ page import="linksharing.Resource; linksharing.Topic" %>
<div class="col-sm-6">

    <div class="panel panel-primary">

        <div class="panel-heading">
            <h3 class="panel-title">
                Inbox
                <button type="button" class="close pull-right" data-dismiss="modal">&times;</button>
            </h3>
        </div>
        <g:each in="${linksharing.Resource.getPosts(session.user)}" var="post">

            <div class="panel-body">
                <div class="col-sm-12">
                    <div class="row">
                        <div class="col-sm-2">
                            <ls:userImage id="${session.user.id}" height="50px" width="50px"></ls:userImage>


                        </div>

                        <br class="col-sm-10">
                        <span>${post.user.userName}&nbsp;&nbsp;&nbsp;&nbsp;<small
                                class="text-muted">@${post.user.userName}  5min</small>
                            <a href="#" class="pull-right"></a>

                            <p>

                                ${post.description}

                            </p>
                        </span>

                        <div>

                            <span><a href="#" class="pull-right" style="margin-right: 10px">View Post</a>&nbsp;&nbsp;
                            </span>
                            <span><a href="#" class="pull-right" style="margin-right: 10px">

                                <div class="col-sm-4">
                                    <g:link controller="resource" action="changeIsRead" id="${post.id}">
                                        <ls:readLink read="${post.id}"></ls:readLink>
                                    </g:link>
                                </div>
                            </a>&nbsp;&nbsp;</span>
                            <span><a href="#" class="pull-right" style="margin-right: 10px">View Full Site</a></span>
                            <span><a href="#" class="pull-right" style="margin-right: 10px">Download</a></span>
                        </div>
                        <br>
                    </div>
                    <hr>
                </div>
                <br>

            </div>

        </g:each>
    </div>

</div>
