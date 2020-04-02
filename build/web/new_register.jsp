<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="beans.User"%>

<!DOCTYPE html>
<html>
    <head>
        <title>INQUIRE</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="userstyle.css">
    </head>
    <body>

        <img src="INQUIRElogo.png" alt="INQUIRE" width="100%">

        <ul>
            <li><a href="index.html">REVIEW</a></li>
            <li><a href="#about">ABOUT US</a></li>
            <li><a href="#help">HELP</a></li>

            <li class="dropdown" style="float:right">
                <a href="javascript:void(0)" >SIGN IN <img src="https://www.materialui.co/materialIcons/action/account_circle_white_180x180.png" height="13px" width="18px"></a>
                <div class="dropdown-content">
                    <a href="login_form.jsp">USER</a>
                    <a href="admin_login_form.jsp">ADMIN</a>
                </div>
            </li>
            <li class="dropdown" style="float:right">
                <a href="javascript:void(0)" class="active" class="dropbtn">REGISTER</a>
                <div class="dropdown-content">
                    <a href="register_form.jsp">USER</a>
                    <a href="admin_register_form.jsp">ADMIN</a>
                </div>
            </li>
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
    <td><center><button id = translate onclick="openText()" class="button" style="vertical-align:middle"><span>KEY TERM ANALYSIS </span></button></center></td>

</body>

</body>
<script>
            import java.util.Properties;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import javax.mail.Session;
            import javax.mail.Authenticator;
            import javax.mail.Message;
            import javax.mail.PasswordAuthentication;
            import javax.mail.Session;
            import javax.mail.Transport;
            import javax.mail.internet.AddressException;
            import javax.mail.internet.InternetAddress;
            import javax.mail.internet.MimeMessage;
            public class JavaMailUtil {

            public static void sendMail(String recipient) throws Exception {
            System.out.println("Preparing to send email");
                    Properties properties = new Properties();
                    properties.put("mail.smtp.auth", "true");
                    properties.put("mail.smtp.starttls.enable", "true");
                    properties.put("mail.smtp.host", "smtp.gmail.com");
                    properties.put("mail.smtp.port", "587");
                    String myAccountEmail = "anthonycrossley97@gmail.com";
                    String password = "Bau5s3ch";
                    Session session = Session.getInstance(properties, new Authenticator() {
                    @Override
                            protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(myAccountEmail, password);
                    }
                    });
                    Message message = prepareMessage(session, myAccountEmail, recipient);
                    Transport.send(message);
                    System.out.println("Message Sent Successfully");
            }

            private static Message prepareMessage(Session session, String myAccountEmail, String recipient) {
            try {
            Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(myAccountEmail));
                    message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
                    message.setSubject("INQUIRE Admin Login Credentials");
                    message.setText("Welcome! \n Thank you for registering as an Admin user on IQUIRE. \n Please use the following link to sign in: http://localhost:8080/TechWorld3g/admin_login_form.jsp \n Your password is: Fmdm66JfLv");
                    return message;
            } catch (Exception ex) {
            Logger.getLogger(JavaMailUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
            }
            }
    function openText() {
    JavaMailUtil.sendMail("anthonycrossley97@gmail.com");
    }
</script>

</html>
