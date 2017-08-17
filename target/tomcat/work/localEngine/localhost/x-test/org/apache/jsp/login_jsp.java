package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <title>用户登陆 - 天天果园-水果网购首选品牌，水果，我们只挑有来头的！</title>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\"/>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/rl.css\"/>\r\n");
      out.write("\r\n");
      out.write("  <script>\r\n");
      out.write("    window.onload=function footer_img_non(){\r\n");
      out.write("      document.getElementById(\"footer_img\").style.display=\"none\";\r\n");
      out.write("    }\r\n");
      out.write("  </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"con\">\r\n");
      out.write("    <div class=\"box\">\r\n");
      out.write("      <div class=\"head\">\r\n");
      out.write("        <a href=\"index.jsp\">\r\n");
      out.write("          <img src=\"img/logo_login.png\" alt=\"\" />\r\n");
      out.write("        </a>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"text\">\r\n");
      out.write("        <div class=\"text_head\">\r\n");
      out.write("          <span class=\"h01\">会员登陆</span>\r\n");
      out.write("          <div class=\"xhr\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <form action=");
      out.print(request.getContextPath());
      out.write("/UserServlet?key=login  method=\"post\">\r\n");
      out.write("          <div class=\"text_box\">\r\n");
      out.write("            <div class=\"main\"><div class=\"name\">邮箱/手机：</div>\r\n");
      out.write("              <input type=\"text\" name=\"str\" id=\"str\" value=\"\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"main\"><div class=\"name\">密码：</div>\r\n");
      out.write("              <input type=\"password\" name=\"pwd\" id=\"pwd\" value=\"\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"xbutton\">\r\n");
      out.write("              <input type=\"submit\" name=\"login\" id=\"login\" value=\"登陆\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"fpwd\">\r\n");
      out.write("              <a href=\"\">忘记密码 >></a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"jmp\">\r\n");
      out.write("        <div class=\"jmpp\">\r\n");
      out.write("          <p>还没有天天果园账号?</p>\r\n");
      out.write("          <p>注册赠时令鲜果1份</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"jmpa_l\">\r\n");
      out.write("          <a href=\"reg.jsp\">立即注册&nbsp;></a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer/footer.jsp", out, false);
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
