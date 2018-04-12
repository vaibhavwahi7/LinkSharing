<div class="panel panel-primary" style="margin-bottom: 0">

    <div class="panel-heading">
        <h3 class="panel-title">
            Subscriptions
            <a href="#" class="pull-right">View All</a>
        </h3>
    </div>
    <div class="panel-body">
    <g:each in="${linksharing.Resource.getSubscriptions(session.user)}" var="sub">
        <div class="row">
            <ls:userImage id="${session.user.id}" height="50px" width="50px"></ls:userImage>

            <div class="col-sm-12">



                <div class="col-sm-9">
                        <a href="#" class="pull-left">${sub.topic.name}</a>
                        <br>
                        <div class="row">

                            <div class="col-sm-6">
                                <h6 class="text-muted">@${sub.user.userName}</h6>
                                <a href="#">Unsubscribe</a>
                            </div>


                            <div class="col-sm-3">
                                <h6 class="text-muted pull-left">Subscriptions</h6>
                                <h6 class="text-primary">${linksharing.Subscription.findAllByUser(session.user).size()}</h6>
                            </div>

                            <div class="col-sm-3">
                                <h6 class="text-muted  pull-right">Post
                                <br>
                                <br>
                                <p class="text-primary">${linksharing.Resource.findAllByUser(session.user).size()}</p>
                            </h6>

                            </div>

                            <span type="img" class="fa fa-file pull-right fa-2x" style="margin-left: 10px;  margin-right: 5px;" data-toggle="modal" data-target="#myModal4">

                            </span>

                            <span type="img" class="fa fa-envelope pull-right fa-2x" style="margin-left: 10px;" data-toggle="modal" data-target="#myModal5">

                            </span>

                            <span type="img" class="glyphicon glyphicon-trash pull-right fa-2x"  style="margin-left: 10px;" data-toggle="modal" data-target="#myModal">

                            </span>



                            <select class="pull-right">
                                <option>Serious</option>
                                <option>Private</option>
                            </select>
                            <div>
                                <select class="pull-right">
                                    <option>Private</option>
                                    <option>Public</option>
                                </select>

                            </div>



                        </div>
                    <hr>
                    </div>

                </div>












    </div>
</g:each>
</div>
</div>