package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class online_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title></title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"loginstyle.css\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      \n");
      out.write("       ");
      beans.User user = null;
      synchronized (request) {
        user = (beans.User) _jspx_page_context.getAttribute("user", PageContext.REQUEST_SCOPE);
        if (user == null){
          user = new beans.User();
          _jspx_page_context.setAttribute("user", user, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("        <form action=\"LoginController\" method=\"post\">\n");
      out.write("<div class=\"login-box\">\n");
      out.write("  <h1>Login</h1>\n");
      out.write("  <div class=\"textbox\">\n");
      out.write("    <i class=\"fas fa-user\"></i>\n");
      out.write("    <input type=\"text\" name=\"user\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((beans.User)_jspx_page_context.findAttribute("user")).getUser())));
      out.write("\" placeholder=\"Username\">\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"textbox\">\n");
      out.write("    <i class=\"fas fa-lock\"></i>\n");
      out.write("    <input type=\"password\" name=\"pwd\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((beans.User)_jspx_page_context.findAttribute("user")).getPwd())));
      out.write("\" placeholder = \"Password\">\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write(" <input type=\"submit\" value=\"Sign In\">\n");
      out.write("        </div>\n");
      out.write("  </body>\n");
      out.write("</form>\n");
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
