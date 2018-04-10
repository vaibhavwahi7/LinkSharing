<g:form controller="login" action="register" enctype="multipart/form-data">
    <div class="container col-sm-6">

        <div class="panel panel-primary">

            <div class="panel-heading">
                <h3 class="panel-title">
                    Register
                </h3>
            </div>


            <div class="panel-body">

                <div class="form-group">
                    <label class="control-label col-sm-4">First name :</label>

                    <div class="col-sm-6">
                        <input name="firstName" type="text" class="form-control ">
                    </br>
                    </div>

                </div>

                <div class="form-group">

                    <label class="control-label col-sm-4">Last name :</label>

                    <div class="col-sm-6">
                        <input name="lastName" type="text" class="form-control">
                    </br>
                    </div>

                </div>

                <div class="form-group">

                    <label class="control-label col-sm-4">Email :</label>

                    <div class="col-sm-6">
                        <input name="email" type="text" class="form-control">
                    </br>
                    </div>
                </div>

                <div class="form-group">

                    <label class="control-label col-sm-4">Username :</label>

                    <div class="col-sm-6">
                        <input name="userName" type="text" class="form-control">
                    </br>
                    </div>
                </div>

                <div class="form-group">

                    <label class="control-label col-sm-4">Password :</label>

                    <div class="col-sm-6">
                        <input name="password" type="text" class="form-control">
                    </br>
                    </div>
                </div>

                <div class="form-group">

                    <label class="control-label col-sm-4">Confirm :</label>

                    <div class="col-sm-6">
                        <input type="text" class="form-control">
                    </br>
                    </div>
                </div>

                <div class="form-group">

                    <label class="control-label col-sm-4">Photo :</label>

                    <div class="col-sm-5">
                        <input type="text" class="form-control">
                    </br>
                    </div>

                    <div class="col-sm-2">

                        <div>

                            <label class="btn btn-primary">
                                <input type="file" style="display:none;" name="photo">
                                browse
                            </label>
                        </br>
                        </div>

                        <div>
                        </br>
                            <g:submitButton name="button" value="Register"/>
                        </div>
                    </div>

                </div>

            </div>
        </div>
    </div>
</g:form>