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
                        <div class="row ">
                            <div class="col-sm-2">

                                %{--
                                                                <g:if test="${session?.user}">
                                                                    <ls:userImage id="${session?.user?.id}" height="50px" width="50px"></ls:userImage>
                                                                    <!--  <img src="avatar.png" class="img-thumbnail"> -->

                                                                </g:if>
                                                                <g:else>
                                                                    <span type="img" class="glyphicon glyphicon-user pull-right fa-2x"  style="margin-left: 10px;" data-toggle="modal" data-target="#myModal">
                                                                </g:else>
                                --}%

                                <span type="img" class="glyphicon glyphicon-user pull-right fa-2x"
                                      style="margin-left: 10px;" data-toggle="modal" data-target="#myModal">
                                </span>
                            </div>


                            <div class="col-sm-10">
                                <span>${itr?.user?.firstName} ${itr?.user?.lastName} &nbsp;&nbsp;&nbsp;&nbsp;<small
                                        class="text-muted">@${itr?.user?.userName} 5min</small>
                                    <a href="#" class="pull-right">${itr?.topic?.name}</a>

                                    <p>
                                        ${itr?.description}
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

