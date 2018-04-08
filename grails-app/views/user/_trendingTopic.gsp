<div class="panel-body">
    <div class="col-sm-12">
        <div class="row">
            <div class="col-sm-2 glyphicon glyphicon-user fa-5x">
                <!--  <img src="avatar.png" class="img-thumbnail"> -->

            </div>
            %{--<ls:trending>--}%
            <div class="col-sm-10">
                <span>${session.user.userName} &nbsp;&nbsp;&nbsp;&nbsp;<small
                        class="text-muted">@${session.user.userName}  5min</small>
                    <a href="#" class="pull-right">${trend.name}</a>

                    <p class="text">

                    </p>
                </span>

                <div>
                    <asset:image src="fb.png"></asset:image>
                    <asset:image src="twitter.png"></asset:image>
                    <asset:image src="google-1.png"></asset:image>
                    <a href="#" class="pull-right">View Post</a>
                </div>
            </div>

            %{--</ls:trending>--}%

        </div>
    </div>

</div>

