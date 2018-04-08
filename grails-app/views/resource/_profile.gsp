<div class="panel panel-default">
    <div class="panel-body">
        <div class="col-sm-12">
            <div class="row">
                <div class="col-sm-3 glyphicon glyphicon-user fa-5x">
                </div>

                <div class="col-sm-9">

                    <p>${session.user.userName}<br><small class="text-muted">@${session.user.userName}</small></p>

                    <div class="row">

                        <h6 class="text-muted col-sm-6">Subscriptions
                            <p class="text-primary">${session.user.subscriptions.size()}</p>
                        </h6>

                        <h6 class="text-muted col-sm-6">Topics
                            <p class="text-primary">${session.user.topics.size()}</p>
                        </h6>

                    </div>
                </div>

            </div>
        </div>
    </div>
</div>




