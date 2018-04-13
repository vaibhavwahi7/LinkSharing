<%@ page import="linksharing.Resource; linksharing.Topic" %>
<div class="col-sm-6">

    <div class="panel panel-default">


        <g:each in="${linksharing.Resource.getPosts(session.user)}" var="post">

            <div class="panel-body">
                <div class="col-sm-12">
                    <div class="row">
                        <div class="col-sm-2">
                            <ls:userImage id="${session.user.id}" height="50px" width="50px"></ls:userImage>


                        </div>

                        <br class="col-sm-10">
                        <span>${post.user.userName}&nbsp;&nbsp;&nbsp;&nbsp;<small
                                class="text-muted">@${post.user.userName}  5min</small> <span class="text-muted pull-right">${post.dateCreated}</span>
                            <a href="#" class="pull-right"></a>

                            <p>

                                ${post.description}

                            </p>
                        </span>

                        <div>

                                <asset:image src="fb.png"/>
                                <asset:image src="twitter.png"/>
                                <asset:image src="google-1.png"/>


                            <span><a href="#" class="pull-right" style="margin-right: 10px">Delete</a>&nbsp;&nbsp;
                            </span>


                            <span><a href="#" class="pull-right" style="margin-right: 10px">Edit</a></span>
                            <span><a href="#" class="pull-right" style="margin-right: 10px">Download</a></span>
                            <span><a href="#" class="pull-right" style="margin-right: 10px">View Full Site</a></span>
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
