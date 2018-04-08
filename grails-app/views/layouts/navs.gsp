<div id="myModal1" class="modal fade" role="dialog">
    <div class="container col-sm-12">
        <div class="row">

            <div class="col-sm-8">

                <div class="panel panel-primary">

                    <div class="panel-heading">
                        <h3 class="panel-title">
                            Inbox
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
                                    <span>Uday Pratap Singh &nbsp;&nbsp;&nbsp;&nbsp;<small
                                            class="text-muted">@Uday  5min</small>
                                        <a href="#" class="pull-right">Grails</a>

                                        <p>
                                            lasjbdjb asjbdashj asjkdbjasd djknasndjk asdnasjknd jkasdjjassajkndjskadjkkjksadjknj
                                            adksjnasd jkansjkdnas askdnasjkn m,as dasdjkasjd jknkjjknds asjndnasd jknasjkd jkasndj
                                            askndklkasndjksa
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


                        <div class="col-sm-12">
                            <div class="row">
                                <div class="col-sm-2 glyphicon glyphicon-user fa-5x">
                                    <!--  <img src="avatar.png" class="img-thumbnail"> -->

                                </div>

                                <div class="col-sm-10">
                                    <span>Uday Pratap Singh &nbsp;&nbsp;&nbsp;&nbsp;<small
                                            class="text-muted">@Uday  5min</small>
                                        <a href="#" class="pull-right">Grails</a>

                                        <p>
                                            lasjbdjb asjbdashj asjkdbjasd djknasndjk asdnasjknd jkasdjjassajkndjskadjkkjksadjknj
                                            adksjnasd jkansjkdnas askdnasjkn m,as dasdjkasjd jknkjjknds asjndnasd jknasjkd jkasndj
                                            askndklkasndjksa
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
        </div>
    </div>
</div>
</div>
</div>





<div id="myModal2" class="modal fade" role="dialog">
    <div class="container col-sm-12">
        <div class="row">

            <div class="col-sm-8">

                <div class="panel panel-primary">

                    <div class="panel-heading">
                        <h3 class="panel-title">
                            Create Topic (Pop-up)
                            <button type="button" class="close pull-right" data-dismiss="modal">&times;</button>
                        </h3>
                    </div>
                    <g:form controller="topic" action="save" method="POST">
                        <div class="panel">
                            <div class="panel-body">

                                <div class="col-sm-12">
                                    <div class="col-sm-4">
                                        <div>
                                            <h4>Name*</h4>
                                        </div>
                                        <br>

                                        <div>
                                            <h4>Visibility*</h4>
                                        </div>
                                        <br>

                                    </div>

                                    <div class="col-sm-8">
                                        <div>
                                            <textarea name="text" style="width: 100%" placeholder="Link"></textarea>
                                        </div>
                                        <br>

                                        <div>
                                            <select style="width: 100%;height: 100%;" name="visibility">
                                                <option>public</option>
                                                <option>private</option>
                                            </select>

                                        </div>
                                        <br>

                                        <div class="col-sm-12">
                                            <div class="col-sm-6">

                                                <button class="btn btn-primary ">Save</button>

                                                <button class="btn btn-primary pull-right">Cancel</button>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </g:form>
                </div>
            </div>
        </div>
    </div>
</div>


<div id="myModal3" class="modal fade" role="dialog">
    <div class="container col-sm-12">
        <div class="row">

            <div class="col-sm-8">

                <div class="panel panel-primary">

                    <div class="panel-heading">
                        <h3 class="panel-title">
                            Share Link (Pop-up)
                            <button type="button" class="close pull-right" data-dismiss="modal">&times;</button>
                        </h3>
                    </div>

                    <div class="panel">
                        <div class="panel-body">

                            <div class="col-sm-12">
                                <div class="col-sm-4">
                                    <div>
                                        <h3>Link*</h3>
                                    </div>
                                    <br>

                                    <div>
                                        <h3>Description*</h3>
                                    </div>
                                    <br>

                                    <div>
                                        <br>

                                        <h3>Topic*</h3>
                                    </div>
                                    <br>
                                </div>

                                <div class="col-sm-8">
                                    <div>
                                        <textarea style="width: 100%" placeholder="Link"></textarea>
                                    </div>
                                    <br>

                                    <div>
                                        <textarea class="fa-2x" style="width: 100%;height: 100%;"
                                                  placeholder="Description">
                                        </textarea>
                                    </div>
                                    <br>

                                    <div>
                                        <select style="width: 100%;height: 100%;">
                                            <option>Topic</option>
                                            <option>Link</option>
                                        </select>

                                    </div>
                                    <br>

                                    <div class="col-sm-12">
                                        <div class="col-sm-6">

                                            <button class="btn btn-primary">Share</button>

                                            <button class="btn btn-primary pull-right">Cancel</button>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>


<div id="myModal4" class="modal fade" role="dialog">
    <div class="container col-sm-12">
        <div class="row">

            <div class="col-sm-8">

                <div class="panel panel-primary">

                    <div class="panel-heading">
                        <h3 class="panel-title">
                            Share Link (Pop-up)
                            <button type="button" class="close pull-right" data-dismiss="modal">&times;</button>
                        </h3>
                    </div>

                    <div class="panel">
                        <div class="panel-body">

                            <div class="col-sm-12">
                                <div class="col-sm-4">
                                    <div>
                                        <h3>Document*</h3>
                                    </div>
                                    <br>

                                    <div>
                                        <h3>Description*</h3>
                                    </div>
                                    <br>

                                    <div>
                                        <br>

                                        <h3>Topic*</h3>
                                    </div>
                                    <br>
                                </div>

                                <div class="col-sm-8">
                                    <div>
                                        <br>

                                        <div class="input-group">
                                            <input type="file" class="custom-file-input" id="inputGroupFile04">
                                        </div>
                                        <br>
                                    </div>
                                    <br>

                                    <div>
                                        <textarea class="fa-2x" style="width: 100%;height: 100%;"
                                                  placeholder="Description">
                                        </textarea>
                                    </div>
                                    <br>

                                    <div>
                                        <select style="width: 100%;height: 100%;">
                                            <option>Topic</option>
                                            <option>Link</option>
                                        </select>

                                    </div>
                                    <br>

                                    <div class="col-sm-12">
                                        <div class="col-sm-6">

                                            <button class="btn btn-primary">Share</button>

                                            <button class="btn btn-primary pull-right">Cancel</button>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>


<div id="myModal5" class="modal fade" role="dialog">
    <div class="container col-sm-12">
        <div class="row">

            <div class="col-sm-8">

                <div class="panel panel-primary">

                    <div class="panel-heading">
                        <h3 class="panel-title">
                            Send Invitation (Pop-up)
                            <button type="button" class="close pull-right" data-dismiss="modal">&times;</button>
                        </h3>
                    </div>

                    <div class="panel">
                        <div class="panel-body">

                            <div class="col-sm-12">
                                <div class="col-sm-4">
                                    <div>
                                        <h4>Email*</h4>
                                    </div>
                                    <br>

                                    <div>
                                        <h4>Topic*</h4>
                                    </div>
                                    <br>

                                </div>

                                <div class="col-sm-8">
                                    <div>
                                        <input type="text" style="width: 100%" placeholder="Email"></textarea>
                                    </div>
                                    <br>

                                    <div>
                                        <select style="width: 100%;height: 100%;">
                                            <option>Topic</option>
                                            <option>Link</option>
                                        </select>

                                    </div>
                                    <br>

                                    <div class="col-sm-12">
                                        <div class="col-sm-6">

                                            <button class="btn btn-primary ">Invite</button>

                                            <button class="btn btn-primary pull-right">Cancel</button>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>








</div>
</div>
</div>
