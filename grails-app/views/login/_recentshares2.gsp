<%@ page import="linksharing.Topic" %>



<div class="col-sm-12">
    <div class="row">
        <div class="col-sm-2 glyphicon glyphicon-user fa-5x">
            <!--  <img src="avatar.png" class="img-thumbnail"> -->

        </div>

        <div class="col-sm-10">
            <span>${po.user.userName} &nbsp;&nbsp;&nbsp;&nbsp;<small
                    class="text-muted">@${po.user.userName} 5min</small>
                <a href="${createLink(controller: 'topic', action: 'show', id: po.id)}">${po.topic.name}</a>

                <p class="text">${po}
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



