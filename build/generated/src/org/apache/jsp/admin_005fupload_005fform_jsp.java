package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.IOException;
import java.io.File;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import database.Db_Connection;

public final class admin_005fupload_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" >\n");
      out.write("    <head>\n");
      out.write("        <title>INQUIRE</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"userstyle.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <img src=\"INQUIRElogo.png\" alt=\"INQUIRE\" width=\"100%\">\n");
      out.write("\n");
      out.write("        <ul>\n");
      out.write("            <li><a class=\"active\" href=\"upload_form.jsp\">REVIEW</a></li>\n");
      out.write("            <li><a href=\"#about\">ABOUT US</a></li>\n");
      out.write("            <li><a href=\"#help\">HELP</a></li>\n");
      out.write("            <li style=\"float:right\"><a href=\"logout.jsp\">SIGN OUT</a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <nav>           \n");
      out.write("        <head>\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <h1>DOCUMENTS FOR REVIEW</h1>\n");
      out.write("        <hr>\n");
      out.write("        </head>\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <table id=\"docTable\" border=\"1\" width=\"25%\" cellpadding=\"5\">\n");
      out.write("            <thead> \n");
      out.write("            <th colspan=\"7\"><img src=\"https://image.flaticon.com/icons/svg/1159/1159641.svg\" height=\"16px\" width=\"16px\" > | <input type=\"text\" id=\"filterSearch\" onkeyup=\"filter()\" placeholder=\"Filter by Filename...\" title=\"Filter\"></th>   \n");
      out.write("\n");
      out.write("            </thead>\n");
      out.write("\n");
      out.write("            <tbody>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td><center><b>FILENAME</b></center><td><center><b>DOCID</b></center></td><td><center><b>NATIVE FILE</b></center></td><td><center><b>OCR FILE</b></center></td><td><center><b>TRANSLATE TEXT</b></center></td><td><center><b>KEY TERM ANALYSIS</b></center></td><td><center><b>REMOVE DOCUMENT</b></center></td>       </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                try {
                    Db_Connection dbconn = new Db_Connection();
                    Connection myconnection = dbconn.Connection();

                    String sqlString = "SELECT * FROM files";
                    Statement myStatement = myconnection.createStatement();
                    ResultSet rs = myStatement.executeQuery(sqlString);

                    if (!rs.isBeforeFirst()) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"3\"><center>");
out.print("No Files!"); 
      out.write("</center></td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }

                while (rs.next()) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("\n");
      out.write("                <td><center>");
out.print(rs.getString("title")); 
      out.write("</center></td>\n");
      out.write("            <td><center>");
out.print(rs.getString("id")); 
      out.write("</center></td>\n");
      out.write("            <td><center><a href=\"view_file.jsp?id=");
out.print(rs.getString("id"));
      out.write("\"><img src=\"https://lh3.googleusercontent.com/proxy/SK2UMWCC4R-AeUxdo5I1_fc_74rlxeXDupQI17yeEgRMyaVKdKbNIwUYZK8A8N-6pjCjIFOEiIa20JsP-fOb1_-dVbPVhsNkFptOt4LZ6SI-UaULC3ESfMmGi0D7Zz1QNTPj\" height=\"25px\" weight=\"25px\"> </a></center></td>\n");
      out.write("            <td><center><button onclick=\"translateText()\" class=\"button\" style=\"vertical-align:middle\"><span><img src=\"https://i.pinimg.com/originals/8e/81/fc/8e81fce56cee548c7cc44d1a985657b7.png\" height=\"20px\" weight=\"20px\"> </span></button></center></td>\n");
      out.write("         <td><center><button onclick=\"translateText()\" class=\"button\" style=\"vertical-align:middle\"><span><img src=\"https://image.flaticon.com/icons/svg/1373/1373419.svg\" height=\"20px\" weight=\"20px\"> </span></button></center></td>\n");
      out.write("         <td><center><button onclick=\"translateText()\" class=\"button\" style=\"vertical-align:middle\"><span><img src=\"https://getdrawings.com/free-icon-bw/bar-chart-icon-14.png\" height=\"20px\" weight=\"20px\"> </span></button></center></td>\n");
      out.write("         <td><center><button onclick=\"translateText()\" class=\"button\" style=\"vertical-align:middle\"><span><img src=\"https://image.flaticon.com/icons/png/512/61/61848.png\" height=\"20px\" weight=\"20px\"> </span></button></center></td>\n");
      out.write("         \n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("\n");
      out.write("            </tbody> \n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        ");

                rs.close();
                myStatement.close();
                myconnection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        
      out.write("\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    <h2>UPLOAD DOCUMENT</h2>\n");
      out.write("    <hr>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"UploadFileController\" enctype=\"multipart/form-data\">\n");
      out.write("            <center>\n");
      out.write("                <table border=\"1\" width=\"25%\" cellpadding=\"5\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>    \n");
      out.write("                            <td><center><b>FILENAME</b></center>\n");
      out.write("                            <td><input type=\"text\" name=\"title\" size=\"30\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><center><b>SELECT DOCUMENT</b></center>\n");
      out.write("                            <td><input type=\"file\" name=\"file_uploaded\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"3\"><center><input type=\"submit\" value=\"Upload Document\"></center></td>\n");
      out.write("                    </tr>\n");
      out.write("                    </tbody>             \n");
      out.write("                </table>\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<article>\n");
      out.write("    <h1>ACTIVE DOCUMENT</h1>\n");
      out.write("    <hr>\n");
      out.write("    <p><iframe id =\"iframe\" src=\"\" ></iframe></p>\n");
      out.write("</article>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"background\"></div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("//FUNCTIONS FOR OCR/TRANSLATE/KEY TERMS\n");
      out.write("    function openText() {\n");
      out.write("        controllers.ReadFile.main(new String[0]);\n");
      out.write("    }\n");
      out.write("    function loginpage() {\n");
      out.write("        document.getElementById('iframe').src = \"LoginForm.java\";\n");
      out.write("    }\n");
      out.write("    function translateText() {\n");
      out.write("        document.getElementById('iframe').src = \"translationOutput.html\";\n");
      out.write("    }\n");
      out.write("    function keyTerm() {\n");
      out.write("        document.getElementById('iframe').src = \"keywordsOutput.html\";\n");
      out.write("    }\n");
      out.write("\n");
      out.write("//UPLOAD DOCUMENT\n");
      out.write("//Source for development - (https://codepen.io/dcode-software/pen/RerBgR)\n");
      out.write("    const realFileBtn = document.getElementById(\"real-file\");\n");
      out.write("            const customBtn = document.getElementById(\"custom-button\");\n");
      out.write("            const customTxt = document.getElementById(\"custom-text\");\n");
      out.write("            customBtn.addEventListener(\"click\", function() {\n");
      out.write("                realFileBtn.click();\n");
      out.write("            });\n");
      out.write("    realFileBtn.addEventListener(\"change\", function() {\n");
      out.write("        if (realFileBtn.value) {\n");
      out.write("            customTxt.innerHTML = realFileBtn.value.match(\n");
      out.write("                    /[\\/\\\\]([\\w\\d\\s\\.\\-\\(\\)]+)$/\n");
      out.write("                    )[1];\n");
      out.write("        } else {\n");
      out.write("            customTxt.innerHTML = \"PLEASE SELECT A DOCUMENT FOR REVIEW\";\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("    function filter() {\n");
      out.write("        var input, filter, table, tr, td, i, txtValue;\n");
      out.write("        input = document.getElementById(\"filterSearch\");\n");
      out.write("        filter = input.value.toUpperCase();\n");
      out.write("        table = document.getElementById(\"docTable\");\n");
      out.write("        tr = table.getElementsByTagName(\"tr\");\n");
      out.write("        for (i = 0; i < tr.length; i++) {\n");
      out.write("            td = tr[i].getElementsByTagName(\"td\")[0];\n");
      out.write("            if (td) {\n");
      out.write("                txtValue = td.textContent || td.innerText;\n");
      out.write("                if (txtValue.toUpperCase().indexOf(filter) > -1) {\n");
      out.write("                    tr[i].style.display = \"\";\n");
      out.write("                } else {\n");
      out.write("                    tr[i].style.display = \"none\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
