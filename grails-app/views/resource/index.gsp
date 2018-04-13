<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script>
        function changeSeriousness(id,value) {
            console.log("inside change")
            console.log("id is : ", id)
            console.log("value is : ", value)
            $.ajax({
                type: 'post',
                data: {'id': id, 'seriousness': value},
                url: '/subscription/changeSeriousness',
                dataType: 'json',
                success: function(res){
                    alert(res);
                },
                error: function(res){
                    $('#message').text('Error!');
                    $('.dvLoading').hide();
                }
            });
        }
    </script>
    <script>
        function changeVisibility(id,value) {
            console.log("inside change")
            console.log("id is : ", id)
            console.log("value is : ", value)
            $.ajax({
                type: 'post',
                data: {'id': id, 'visibility': value},
                url: '/Topic/changeVisibility',
                dataType: 'json',
                success: function(res){
                    alert(res);
                },
                error: function(res){
                    $('#message').text('Error!');
                    $('.dvLoading').hide();
                }
            });
        }
    </script>

</head>


<body>
<div class="row">
    <div class="col-sm-12">
        <div class="col-sm-6">
            <g:render template="profile"/>
            <div>
            <g:render template="subscriptions"/>
        </div>
            <div>
                <g:render template="/user/trendingTopic"/>
            </div>
        </div>

        <g:render template="post"/>

    </div>
</div>

</body>
</html>