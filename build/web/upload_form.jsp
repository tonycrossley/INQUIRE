<%@page import="java.io.IOException"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="database.Db_Connection"%>
<!DOCTYPE html>
<html lang="en" >
    <head>
        <title>INQUIRE</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="userstyle.css">
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
        <h1>DOCUMENTS FOR REVIEW</h1>
        <hr>
        </head>


        <table id="docTable" border="1" width="25%" cellpadding="5">
            <thead> 
            <th colspan="6"><img src="https://image.flaticon.com/icons/svg/1159/1159641.svg" height="16px" width="16px" > | <input type="text" id="filterSearch" onkeyup="filter()" placeholder="Filter by Filename..." title="Filter"></th>   

            </thead>

            <tbody>

                <tr>

                    <td><center><b>FILENAME</b></center><td><center><b>DOCID</b></center></td><td><center><b>NATIVE FILE</b></center></td><td><center><b>OCR FILE</b></center></td><td><center><b>TRANSLATE TEXT</b></center></td><td><center><b>KEY TERM ANALYSIS</b></center></td>       
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

                <td><center><%out.print(rs.getString("title")); %></center></td>
            <td><center><%out.print(rs.getString("id")); %></center></td>
            <td><center><a href="view_file.jsp?id=<%out.print(rs.getString("id"));%>"><img src="https://image.flaticon.com/icons/svg/32/32743.svg" height="25px" weight="25px"> </a></center></td>
            <td><center><button onclick="openText()" class="button" style="vertical-align:middle"><span><img src="https://i.pinimg.com/originals/8e/81/fc/8e81fce56cee548c7cc44d1a985657b7.png" height="20px" weight="20px"> </span></button></center></td>
            <td><center><button onclick="translateText()" class="button" style="vertical-align:middle"><span><img src="https://image.flaticon.com/icons/svg/1373/1373419.svg" height="20px" weight="20px"> </span></button></center></td>
            <td><center><button onclick="keyTerm()" class="button" style="vertical-align:middle"><span><img src="https://getdrawings.com/free-icon-bw/bar-chart-icon-14.png" height="20px" weight="20px"> </span></button></center></td>

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

    <h2>UPLOAD DOCUMENT</h2>
    <hr>
    <body>
        <form method="post" action="UploadFileController" enctype="multipart/form-data">
            <center>
                <table border="1" width="25%" cellpadding="5">
                    <tbody>
                        <tr>    
                            <td><center><b>FILENAME</b></center>
                    <td><input type="text" name="title" size="30"></td>
                    </tr>
                    <tr>
                        <td><center><b>SELECT DOCUMENT</b></center>
                    <td><input type="file" name="file_uploaded" /></td>
                    </tr>
                    <tr>
                        <td colspan="3"><center><input type="submit" value="Upload Document"></center></td>
                    </tr>
                    </tbody>             
                </table>
            </center>
        </form>


</nav>

<article>
    <h1>ACTIVE DOCUMENT</h1>
    <hr>
    <p><iframe id ="iframe" src="" ></iframe></p>
</article>


<div class="background"></div>

</body>
<script>
//FUNCTIONS FOR OCR/TRANSLATE/KEY TERMS
    function openText() {
        document.getElementById('iframe').src = "beatlestxt.txt";
    }

    function translateText() {
        document.getElementById('iframe').src = "beatlestranslation.txt";
    }
    function keyTerm() {
        document.getElementById('iframe').src = "beatleskeywords.txt";
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
    function filter() {
        var input, filter, table, tr, td, i, txtValue;
        input = document.getElementById("filterSearch");
        filter = input.value.toUpperCase();
        table = document.getElementById("docTable");
        tr = table.getElementsByTagName("tr");
        for (i = 0; i < tr.length; i++) {
            td = tr[i].getElementsByTagName("td")[0];
            if (td) {
                txtValue = td.textContent || td.innerText;
                if (txtValue.toUpperCase().indexOf(filter) > -1) {
                    tr[i].style.display = "";
                } else {
                    tr[i].style.display = "none";
                }
            }
        }
    }
</script>
</html>

