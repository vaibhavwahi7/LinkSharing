<div class="col-sm-8">

    <div class="panel panel-primary">

        <div class="panel-heading">
            <h3 class="panel-title">
                Recent Shares
            </h3>
        </div>

        <div>
<g:set var="recent" value="${linksharing.Resource.getRecentShares()}"></g:set>
<g:each in="${recent}" var="itr">
        <div class="panel-body">

            <div class="col-sm-12">
                <div class="row">
                    <div class="col-sm-2 glyphicon glyphicon-user fa-5x">
                        <!--  <img src="avatar.png" class="img-thumbnail"> -->

                    </div>

                    <div class="col-sm-10">
                        <span>${itr.user.firstName} ${itr.user.lastName} &nbsp;&nbsp;&nbsp;&nbsp;<small class="text-muted">@${itr.user.userName} 5min</small>
                            <a href="#" class="pull-right">${itr.topic.name}</a>

                            <p>
                                ${itr.description}
                            </p>
                        </span>

                        <div>
                            <asset:image src="fb.png"></asset:image>
                            <asset:image src="twitter.png"></asset:image>
                            <asset:image src="google-1.png"></asset:image>
                            <a href="#" class="pull-right">View Post</a>
                        </div>
                    </div>

                </div>
            </div>




        </div>
</g:each>

    </div>
    </div>
</div>

