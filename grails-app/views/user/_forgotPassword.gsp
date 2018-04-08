<div class="row"  style="margin-left: 30%" >
    <div class="col-sm-6">
<div class="panel panel-primary">

                      <div class="panel-heading">
                        <h3 class="panel-title">
                        Forgot Password
                     </h3>
                  </div>

                     <div class="panel-body" >
<g:form controller="login" action="password" method="POST">

    <label>Enter Username:</label>
    <input class="form-control" type="text" name="userName" placeholder="Enter Your Username">

    <label>Enter Password:</label>
    <input class="form-control" type="password" name="password" placeholder="Enter Your Password">

    <p>
    <g:submitButton name="button" value="Save"/>
    </p>
</g:form>
</div>
</div>
    </div>
</div>