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
            <li><a href="upload_form.jsp">REVIEW</a></li>
            <li><a href="#about">ABOUT US</a></li>
            <li><a href="#help">HELP</a></li>
            <li style="float:right"><a href="logout.jsp">SIGN OUT</a></li>
        </ul>

    </body>
    <body>

        <%
            HttpSession sessionUser = request.getSession(false);
            String us = (String) sessionUser.getAttribute("user");

            User user_of_techworld3g = new User();
            user_of_techworld3g.setUser(us);
            user_of_techworld3g.GetUser();

            
        %>
   <html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
.container {
  position: relative;
  text-align: center;
  color: white;
}

.bottom-left {
  position: absolute;
  bottom: 8px;
  left: 16px;
}

.top-left {
  position: absolute;
  top: 8px;
  left: 16px;
}

.top-right {
  position: absolute;
  top: 8px;
  right: 16px;
}

.bottom-right {
  position: absolute;
  bottom: 8px;
  right: 16px;
}

.centered {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}
</style>
</head>
<body>

<div class="container">
    <img src="https://steamuserimages-a.akamaihd.net/ugc/991262566628548285/2A23B0BB92EC12348B1180161261CB2DD10AEFED/" alt="bg" style="width:100%;" height="550px%">
  <div class="centered">WELCOME. SELECT 'REVIEW' TO BEGIN YOUR INVESTIGATION</div>
</div>

</body>
    </body>
</html>
