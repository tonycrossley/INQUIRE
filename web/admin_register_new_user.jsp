<!DOCTYPE html>
<html lang="en" >
    <head>
        <title>INQUIRE</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="loginstyle.css">
    </head>
    <body>

        <img src="INQUIRElogo.png" alt="INQUIRE" width="100%">

        <ul>
            <li><a href="admin_upload_form.jsp">REVIEW</a></li>
            <li><a href="#about">ABOUT US</a></li>
            <li><a href="#help">HELP</a></li>
            <li style="float:right"><a href="logout.jsp">SIGN OUT</a></li>
            <li style="float:right"><a href="admin_register_new_user.jsp">ADD NEW USER</a></li>
        </ul>

        <div class="background">
            <div class="transbox" width="75px" height="75px">
                <body>

                    <jsp:useBean id="user" scope="request" class="beans.User"></jsp:useBean>
                        <form action="NewRegisterController" method="post">
                            <div class="login-box">
                                <h1>ADD USER</h1>
                                <div class="textbox">
                                    <i class="fas fa-user"></i>
                                    <input type="text" placeholder= "Email Address" name="first_name" value="<jsp:getProperty name="user" property="first_name"/>">
                            </div>

                            <div class="textbox">
                                <i class="far fa-eye"></i></i>
                                <input type="text" placeholder = "Admin User? (Y/N)" maxlength = "1" name="last_name" value="<jsp:getProperty name="user" property="last_name"/>">
                            </div>

                            <div class="textbox">
                                <i class="far fa-address-card"></i></i>
                                <input type="text" placeholder = "Username" name="user" value="<jsp:getProperty name="user" property="user"/>">
                            </div>

                            <div class="textbox">
                                <i class="fas fa-lock"></i>
                                <input type="password" placeholder = "Password" name="pwd" value="<jsp:getProperty name="user" property="pwd"/>">
                            </div>



                            <input type="reset" value="RESET" class="btn" />
                            <input type="submit" value="ADD USER" class="btn">
                        </div>
            </div>
    </body>
</div>
</body>

</body>
</html>


