<div class="panel panel-default">
    <div class="panel-body">
        <div class="col-sm-12">
            <div class="row">
                <ls:userImage id="${session.user.id}" height="50px" width="50px"></ls:userImage>
                %{--<img src="${createLink(controller: 'login', action: 'fetchProductImage')}" style="width:40px;height:40px"/>--}%


                <div class="col-sm-9">
                    <a href="/resource/edit" class="glyphicon glyphicon-edit"></a>
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




