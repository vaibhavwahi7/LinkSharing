<div class="panel panel-primary">

    <div class="panel-heading">
        <h3 class="panel-title">
            Login
        </h3>
    </div>

    <div class="panel-body">

        <g:form controller="login" action="loginHandler" method="POST">

            <label>Enter Username:</label>
            <input class="form-control" type="text" name="userName" placeholder="Enter Your Username">

            <label>Enter Password:</label>
            <input class="form-control" type="password" name="password" placeholder="Enter Your Password">

            <p>
                <a href="/user/forgotPass">?Forgot Password</a></p>

            <g:submitButton name="button" value="Login"/>
            <a href="/register/index">Register</a></p>
                <p>

        </g:form>

    </div>
</div>

</div>
