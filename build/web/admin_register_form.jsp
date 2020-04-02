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
            <li><a href="index.html">REVIEW</a></li>
            <li><a href="#about">ABOUT US</a></li>
            <li><a href="#help">HELP</a></li>

            <li class="dropdown" style="float:right">
                <a href="javascript:void(0)" class="dropbtn">SIGN IN <img src="https://www.materialui.co/materialIcons/action/account_circle_white_180x180.png" height="13px" width="18px"></a>
                <div class="dropdown-content">
                    <a href="login_form.jsp">USER</a>
                    <a href="admin_login_form.jsp">ADMIN</a>
                </div>
            </li>
            <li class="dropdown" style="float:right">
                <a href="javascript:void(0)" class="dropbtn">REGISTER</a>
                <div class="dropdown-content">
                    <a href="register_form.jsp">USER</a>
                    <a href="admin_register_form.jsp">ADMIN</a>
                </div>
            </li>
        </ul>

        <div class="background">
            <div class="transbox" width="75px" height="75px">
                <body>

                    <jsp:useBean id="user" scope="request" class="beans.User"></jsp:useBean>
                        <form action="AdminRegisterController" method="post">
                            <div class="login-box">
                                <h1>REGISTER</h1>
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
                            <input type="submit" value="REGISTER ADMIN" class="btn">
                        </div>
            </div>
    </body>
</div>
</body>

</body>
</html>


