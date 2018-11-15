package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=utf-8\"/>\n");
      out.write("        <title>Formulario</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      com.test_entrevista.modelos.test_Model t = null;
      synchronized (request) {
        t = (com.test_entrevista.modelos.test_Model) _jspx_page_context.getAttribute("t", PageContext.REQUEST_SCOPE);
        if (t == null){
          t = new com.test_entrevista.modelos.test_Model();
          _jspx_page_context.setAttribute("t", t, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("        <h1>Ingrese sus datos</h1>\n");
      out.write("        <form action =\"form.jsp\" method=\"post\">\n");
      out.write("            <label for=\"nombre\">Nombre </label>\n");
      out.write("            <input type=\"text\" name=\"nombre\" required/><br>\n");
      out.write("             <label for=\"email\">E-Mail </label>\n");
      out.write("            <input type=\"email\" name=\"email\" required/><br>\n");
      out.write("             <label for=\"nombre\">Pais </label>\n");
      out.write("             <select name=\"pais\" required>\n");
      out.write("                 <option value=\"cl\">Chile</option>\n");
      out.write("                  <option value=\"pe\">Peru</option>\n");
      out.write("                  <option value=\"vn\">Venezuela</option>\n");
      out.write("                  <option value=\"mx\">Mexico</option>\n");
      out.write("                  <option value=\"ar\">Argentina</option>             \n");
      out.write("             </select><br>\n");
      out.write("             <label for=\"sexo\" required>Sexo</label><br>\n");
      out.write("             Masculino <input type=\"radio\" name=\"sexo\" value=\"m\"/>\n");
      out.write("             Femenino <input type=\"radio\" name=\"sexo\" value=\"f\"/>\n");
      out.write("             <hr/><input type=\"submit\" value=\"Enviar\" title=\"Enviar\">\n");
      out.write("        </form>\n");
      out.write("    <li> <a href=\"Nosotros\">Nosotros</a></li>\n");
      out.write("    <li>  <a href=\"Mision\">Mision</a></li>\n");
      out.write("        \n");
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
