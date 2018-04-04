



<div class="row">
    <div class="col-sm-4">
        <div class="panel panel-primary" style="margin-bottom: 0">

            <div class="panel-heading">
                <h3 class="panel-title">
                    Topic("Grails")
                </h3>
            </div>
            <div class="panel-body">

                <div class="row">
                    <div class="col-sm-12">
                        <div class="row">

                            <div class="col-sm-3 glyphicon glyphicon-user fa-5x">

                            </div>
                            <div class="col-sm-9">
                                <a href="#" class="pull-left">Grails(private)</a>
                                <br>
                                <div class="row">

                                    <div class="col-sm-6">
                                        <h6 class="text-muted">@uday</h6>
                                        <a href="#">Unsubscribe</a>
                                    </div>


                                    <div class="col-sm-3">
                                        <h6 class="text-muted pull-left">Subscriptions</h6>
                                        <h6 class="text-primary"></h6>
                                    </div>

                                    <div class="col-sm-3">
                                        <h6 class="text-muted  pull-right">Post
                                            <br>
                                            <br>
                                            <p class="text-primary">30</p>
                                        </h6>

                                    </div>


                                    <span type="img" class="fa fa-envelope pull-right fa-2x" style="margin-right: 20px" data-toggle="modal" data-target="#myModal5">

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
</div>

<div>"Subscribed users are:- "${linksharing.User.listOrderBySubscriptions()}</div>
</body>
</html>