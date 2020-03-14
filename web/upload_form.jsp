<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="database.Db_Connection"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en" >
    <head>
        <title>INQUIRE</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <img src="INQUIRElogo.png" alt="INQUIRE" width="100%">

        <ul>
            <li><a class="active" href="upload_form.jsp">REVIEW</a></li>
            <li><a href="#about">ABOUT US</a></li>
            <li><a href="#help">HELP</a></li>
            <li style="float:right"><a href="logout.jsp">SIGN OUT</a></li>
        </ul>

    </body>

    <nav>           
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <h1>UPLOAD DOCUMENT</h1>
    </head>

    <body>
        <form method="post" action="UploadFileController" enctype="multipart/form-data">
            <center>
                <table border="1" width="25%" cellpadding="5">
                    <tbody>
                        <tr>    
                            <td>Subject or Filename</td>
                            <td><input type="text" name="title" size="30"></td>
                        </tr>
                        <tr>
                            <td>Select Document</td>
                            <td><input type="file" name="file_uploaded" /></td>
                        </tr>
                        <tr>
                            <td colspan="3"><center><input type="submit" value="Upload"></center></td>
                    </tr>
                    </tbody>             
                </table>
            </center>
        </form>

        <br><br>

        <table border="1" width="25%" cellpadding="5">
            <thead> 
            <th colspan="3">Uploaded Files</th>        
            </thead>
            <tbody>
                <tr>
                    <td><center><b>DocID</b></center><td><center><b>Subject or Filename</b></center></td><td><center><b>Native File</b></center></td>
            </tr>

            <%
                try {
                    Db_Connection dbconn = new Db_Connection();
                    Connection myconnection = dbconn.Connection();

                    String sqlString = "SELECT * FROM files";
                    Statement myStatement = myconnection.createStatement();
                    ResultSet rs = myStatement.executeQuery(sqlString);

                    if (!rs.isBeforeFirst()) {
            %>
            <tr>
                <td colspan="3"><center><%out.print("No Files!"); %></center></td>
            </tr>
            <%
                }

                while (rs.next()) {
            %>
            <tr>
                <td><center><%out.print(rs.getString("id")); %></center></td>
            <td><center><%out.print(rs.getString("title")); %></center></td>
            <td><center><a href="view_file.jsp?id=<%out.print(rs.getString("id"));%>">View</a></center></td>
            <td><center><a href="ocrdb.jsp?id=<%out.print(rs.getString("id"));%>">View</a></center></td>
            <td><center><button id = translate onclick="openText()" class="button" style="vertical-align:middle"><span>OCR </span></button></center></td>
            <td><center><button id = translate onclick="translateText()" class="button" style="vertical-align:middle"><span>TRANSLATE </span></button></center></td>
            <td><center><button id = translate onclick="keyTerm()" class="button" style="vertical-align:middle"><span>KEY TERM ANALYSIS </span></button></center></td>

            </tr>


            <%
                }
            %>

            </tbody> 
        </table>

        <%
                rs.close();
                myStatement.close();
                myconnection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        %>
    </body>

</nav>

<article>
    <h1>DOCUMENT FOR REVIEW</h1>
    <p><iframe id ="iframe" src="" ></iframe></p>
</article>




</body>
<script>
//FUNCTIONS FOR OCR/TRANSLATE/KEY TERMS
    function openText() {
        document.getElementById('iframe').src = "output.html";
    }
    function loginpage() {
        document.getElementById('iframe').src = "LoginForm.java";
    }
    function translateText() {
        document.getElementById('iframe').src = "translationOutput.html";
    }
    function keyTerm() {
        document.getElementById('iframe').src = "keywordsOutput.html";
    }

//UPLOAD DOCUMENT
//Source for development - (https://codepen.io/dcode-software/pen/RerBgR)
    const realFileBtn = document.getElementById("real-file");
            const customBtn = document.getElementById("custom-button");
            const customTxt = document.getElementById("custom-text");
            customBtn.addEventListener("click", function() {
                realFileBtn.click();
            });
    realFileBtn.addEventListener("change", function() {
        if (realFileBtn.value) {
            customTxt.innerHTML = realFileBtn.value.match(
                    /[\/\\]([\w\d\s\.\-\(\)]+)$/
                    )[1];
        } else {
            customTxt.innerHTML = "PLEASE SELECT A DOCUMENT FOR REVIEW";
        }
    });

</script>
</html>

