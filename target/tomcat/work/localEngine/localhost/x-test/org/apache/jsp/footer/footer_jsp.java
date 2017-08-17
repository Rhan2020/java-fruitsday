package org.apache.jsp.footer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title></title>\r\n");
      out.write("  <link rel=\"stylesheet\"  type=\"text/css\" href=\"footer/css/footer.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"footer\" id=\"footer_img\">\r\n");
      out.write("    <ul class=\"foot_ul\">\r\n");
      out.write("      <li><img src=\"footer/imgs/foot_img/foot_a1.jpg\" alt=\"\" /></li>\r\n");
      out.write("      <li><img src=\"footer/imgs/foot_img/foot_a2.jpg\" alt=\"\" /></li>\r\n");
      out.write("      <li><img src=\"footer/imgs/foot_img/foot_a3.jpg\" alt=\"\" /></li>\r\n");
      out.write("      <li><img src=\"footer/imgs/foot_img/foot_a4.jpg\" alt=\"\" /></li>\r\n");
      out.write("      <li><img src=\"footer/imgs/foot_img/foot_a5.jpg\" alt=\"\" /></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"foot_box\">\r\n");
      out.write("    <div class=\"con\">\r\n");
      out.write("      <p>版权所有 © 2015版权所有 © 2015 保留所有权利 保留所有权利 | <a href=\"http://www.miitbeian.gov.cn/\">沪ICP备12042163</a>\t| <a href=\"http://www.cnzz.com/stat/website.php?web_id=2559666\">站长统计</a></p>\r\n");
      out.write("      <p class=\"b\">天天果园 鲜果网购</p>\r\n");
      out.write("    </div>\r\n");
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
