<div class="panel panel-primary" style="margin-bottom: 0">

    <div class="panel-heading">

        <h3 class="panel-title ">
           Topics

            <i class="glyphicon glyphicon-search btn" style=" margin-left:5% ;border-radius:15px; color:#000;">

            <input type="text" class="form-control pull-right" placeholder="Search" style="border-radius:15px; width:50%; margin-top:-9%;">

        </i>

        </h3>




    </div>


</div>

<div class="panel panel-primary">
    <div class="panel-body">

        <div class="row">
            <div class="col-sm-12">

                <div class="row">

                    <div class="col-sm-3 glyphicon glyphicon-user fa-5x">
                        <!--  <img src="avatar.png" class="img-thumbnail"> -->

                    </div>
                    <div class="col-sm-9">
                        <g:form controller="topic" action="save">

                            <input type="text"  placeholder="Topic" name="text">


                            <g:submitButton name="Save">Save</g:submitButton>


                        <div class="row">

                            <div class="col-sm-6">
                                <h6 class="text-muted">@uday</h6>
                                <a href="#">Unsubscribe</a>
                            </div>


                            <div class="col-sm-3">
                                <h6 class="text-muted pull-left">Subscriptions</h6>
                                <h6 class="text-primary">50</h6>
                            </div>

                            <div class="col-sm-3">
                                <h6 class="text-muted  pull-right">Post</h6>
                                <br/>

                                <h6 class="text-primary">30
                                </h6>




                            </div>
                            <span type="img" class="glyphicon glyphicon-edit  pull-right fa-2x" style="margin-left: 10px;  margin-right: 5px;" data-toggle="modal" data-target="#myModal4">

                            </span>

                            <span type="img" class="fa fa-envelope pull-right fa-2x" style="margin-left: 10px;" data-toggle="modal" data-target="#myModal5">

                            </span>

                            <span type="img" class="glyphicon glyphicon-trash pull-right fa-2x"  style="margin-left: 10px;" data-toggle="modal">

                            </span>



                            <select class="pull-right">
                                <option>Serious</option>
                                <option>Private</option>
                            </select>
                            <div>
                                <select class="pull-right" name="visibility">
                                    <option>Private</option>
                                    <option>Public</option>
                                </select>


                            </div>
                        </div>
                        </g:form>

                    </div>

                </div>
            </div>

        </div>
    </div>
</div>
