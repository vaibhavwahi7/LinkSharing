<div class="col-sm-7">

    <div class="panel panel-primary">

        <div class="panel-heading">
            <h3 class="panel-title">
                Topic"${topics.name}"
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
                        <span>&nbsp;&nbsp;&nbsp;&nbsp;<small class="text-muted">@${session.user.userName}  5min</small>
                            <a href="#" class="pull-right">${topics.name}</a>

                            <p>
                                ${topics.resources.description}
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
