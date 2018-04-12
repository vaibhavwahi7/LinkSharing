<%@ page import="linksharing.Resource; linksharing.Topic" %>

<div class="col-sm-12">

    <div class="row">
<div class="col-sm-2">
        <ls:userImage id="${session.user.id}" height="50px" width="50px"></ls:userImage>
</div>
        <div class="col-sm-10">
            <span>${po.user.userName} &nbsp;&nbsp;&nbsp;&nbsp;<small
                    class="text-muted">@${po.user.userName} 5min</small>
                <a href="${createLink(controller: 'topic', action: 'show', id: po.id)}">${po.topic.name}</a>

                <p class="text">
                    <g:each in="${linksharing.Resource.createCriteria().list(){eq('topic',po)}}" var="des">
                    ${des.description}
                </g:each>
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



