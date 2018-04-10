<%@ page import="linksharing.Topic" %>
%{--<div class="col-sm-7">--}%

    %{--<div class="panel panel-primary">--}%

        %{--<div class="panel-heading">--}%
            %{--<h3 class="panel-title">--}%
                %{--Topic"${topics.name}"--}%
                %{--<button type="button" class="close pull-right" data-dismiss="modal">&times;</button>--}%
            %{--</h3>--}%
        %{--</div>--}%

        %{--<div class="panel-body">--}%

            %{--<div class="col-sm-12">--}%
                %{--<div class="row">--}%
                    %{--<div class="col-sm-2 glyphicon glyphicon-user fa-5x">--}%
                        %{--<!--  <img src="avatar.png" class="img-thumbnail"> -->--}%

                    %{--</div>--}%

                    %{--<div class="col-sm-10">--}%
                        %{--<span>&nbsp;&nbsp;&nbsp;&nbsp;<small class="text-muted">@${session.user.userName}  5min</small>--}%
                            %{--<a href="#" class="pull-right">${topics.name}</a>--}%

                            %{--<p>--}%
                                %{--${topics.resources.description}--}%
                            %{--</p>--}%
                        %{--</span>--}%

                        %{--<div>--}%

                            %{--<a href="#" class="pull-right">View Post</a>--}%
                        %{--</div>--}%
                    %{--</div>--}%

                %{--</div>--}%
            %{--</div>--}%
        %{--</div>--}%
    %{--</div>--}%
%{--</div>--}%






















<div class="container col-sm-5">
<div class="panel panel-primary">
    <div class="panel-heading ">
    <h3 class="panel-title">
        Topics"${topics.name}"
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
                    <a href="#" class="pull-left">${topics.name}</a>
                    <br>
                    <div class="row">

                        <div class="col-sm-6">
                            <h6 class="text-muted">@${topics.createdBy.userName}</h6>
                            <a href="#">Unsubscribe</a>
                        </div>


                        <div class="col-sm-3">
                            <h6 class="text-muted pull-left">Subscriptions</h6>
                            <h6 class="text-primary">${topics.subscriptions.size()}</h6>
                        </div>

                        <div class="col-sm-3">
                            <h6 class="text-muted  pull-right">Post
                            <br>
                            <br>
                            <p class="text-primary">${topics.resources.size()}</p>
                        </h6>




                        </div>


                        <span type="img" class="fa fa-envelope pull-right fa-2x" style="margin-left: 10px; margin-right: 5px;" data-toggle="modal" data-target="#myModal5">

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
