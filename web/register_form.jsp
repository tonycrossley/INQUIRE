<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="beans.User"%>
<!DOCTYPE html>
<html>
    <head>
        <title>INQUIRE</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>

        <img src="INQUIRElogo.png" alt="INQUIRE" width="100%">

        <ul>
            <li><a href="index.html">REVIEW</a></li>
            <li><a href="#about">ABOUT US</a></li>
            <li><a href="#help">HELP</a></li>
            <li style="float:right"><a href="login_form.jsp">SIGN IN</a></li>
            <li style="float:right"><a class="active" href="register_form.jsp">REGISTER</a></li>
        </ul>

    </body>
    <body>

        <jsp:useBean id="user" scope="request" class="beans.User"></jsp:useBean>

            <form action="RegisterController" method="post">
                <center>
                    <table border="1" width="15%" cellpadding="5">
                        <thead>
                            <tr>
                                <th colspan="2">Register Form</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>    
                                <td>Email Address</td>
                                <td><input type="text" name="first_name" value="<jsp:getProperty name="user" property="first_name"/>"></td>
                        </tr>
                        <tr>    
                            <td>Admin User? (Y/N)</td>
                            <td><input type="text" maxlength = "1" name="last_name" value="<jsp:getProperty name="user" property="last_name"/>"></td>
                        </tr>
                        <tr>    
                            <td>Username</td>
                            <td><input type="text" name="user" value="<jsp:getProperty name="user" property="user"/>"></td>
                        </tr>
                        <tr>
                            <td>Password</td>
                            <td><input type="password" name="pwd" value="<jsp:getProperty name="user" property="pwd"/>"></td>
                        </tr>
                        <tr>
                            <td><center><input type="reset" value="Reset" /></center></td>
                    <td><center><input type="submit" value="Register"></center></td>
                    </tr>
                    </tbody>             
                </table>
            </center>
        </form>               

    </body>
</html>
