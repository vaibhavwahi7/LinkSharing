<div class="panel panel-primary" style="margin-bottom: 0">

    <div class="panel-heading">
        <h3 class="panel-title">
            Trending Topics
        </h3>
    </div>
<div class="panel-body">
    <g:each in="${linksharing.Topic.getTrendingTopics()}" var="trend">
    <div class="col-sm-12">
        <ls:userImage id="${session.user.id}" height="50px" width="50px"></ls:userImage>

        <div class="row">

            <div class="col-sm-10">
                <span><a href="#">${trend.name}</a> &nbsp;&nbsp;&nbsp;&nbsp;<small
                        class="text-muted">@${trend.user} 5min</small>
                    <a href="#" class="pull-right"></a>

                    <p class="text">

                    </p>
                </span>

                <div>
                    <asset:image src="fb.png"></asset:image>
                    <asset:image src="twitter.png"></asset:image>
                    <asset:image src="google-1.png"></asset:image>
                    <a href="#" class="pull-right">View Post</a>
                    <hr>
                </div>

            </div>


        </div>
    </div>

    </g:each>

</div>

</div>