package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.User;

public final class admin_005fwelcome_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("       <head>\n");
      out.write("        <title>INQUIRE</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <img src=\"INQUIRElogo.png\" alt=\"INQUIRE\" width=\"100%\">\n");
      out.write("\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"admin_upload_form.jsp\">REVIEW</a></li>\n");
      out.write("            <li><a href=\"#about\">ABOUT US</a></li>\n");
      out.write("            <li><a href=\"#help\">HELP</a></li>\n");
      out.write("            <li style=\"float:right\"><a href=\"logout.jsp\">SIGN OUT</a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            HttpSession sessionUser = request.getSession(false);
            String us = (String) sessionUser.getAttribute("user");

            User user_of_techworld3g = new User();
            user_of_techworld3g.setUser(us);
            user_of_techworld3g.GetUser();

            
        
      out.write("\n");
      out.write("   <html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write(".container {\n");
      out.write("  position: relative;\n");
      out.write("  text-align: center;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bottom-left {\n");
      out.write("  position: absolute;\n");
      out.write("  bottom: 8px;\n");
      out.write("  left: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".top-left {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 8px;\n");
      out.write("  left: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".top-right {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 8px;\n");
      out.write("  right: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bottom-right {\n");
      out.write("  position: absolute;\n");
      out.write("  bottom: 8px;\n");
      out.write("  right: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".centered {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  left: 50%;\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <img src=\"https://steamuserimages-a.akamaihd.net/ugc/991262566628548285/2A23B0BB92EC12348B1180161261CB2DD10AEFED/\" alt=\"bg\" style=\"width:100%;\" height=\"555px%\">\n");
      out.write("  <div class=\"centered\">WELCOME ADMIN. SELECT 'REVIEW' TO BEGIN YOUR INVESTIGATION</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
