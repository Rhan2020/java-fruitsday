package org.apache.jsp.head;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fruitDayDB.vo.User;

public final class head_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title></title>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"head/css/head.css\"/>\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/ShopServlet?key=num", out, false);
      out.write("\r\n");
      out.write("  ");

    User user=new User(0,"","","","");
    int num=0;
    if(session.getAttribute("user")!=null)
      user=(User)session.getAttribute("user");
    if(request.getAttribute("num")!=null)
     num=(Integer)request.getAttribute("num");
  
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"top\">\r\n");
      out.write("    <div class=\"con\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"head_left\">您好,欢迎来到天天果园！</div>\r\n");
      out.write("\r\n");
      out.write("      ");

        if(user.getId()==0)
          out.print("        <div class=\"head_right noLink\" >\n" +
                  "            <a href=\"login.jsp\">[ 登陆 ]</a>&nbsp;&nbsp;\n" +
                  "            <a href=\"reg.jsp\">[ 注册<span style=\"color: red;font-size: 12px;\">有惊喜</span> ]</a>\n" +
                  "        </div>");
        else {
          out.print("      <div class=\"head_right\" >\n" +
                  "        <div class=\"username\"><a href=\"#\">"+user.getUname()+"</a></div>\n" +
                  "        <div class=\"star\">\n" +
                  "          <div class=\"star_img\">\n" +
                  "          </div>\n" +
                  "          <div class=\"toStar\"><a href=\""+request.getContextPath()+"/ShopServlet?key=show&id="+user.getId()+"&boob=star\">我的关注</a>\n" +
                  "          </div>\n" +
                  "        </div>\n" +
                  "      </div>");
        }
      
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("  <div class=\"head\">\r\n");
      out.write("    <div class=\"con\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"logo\">\r\n");
      out.write("        <a href=\"BSindex.jsp\">\r\n");
      out.write("          <img src=\"head/imgs/fdaylogo.png\" alt=\"天天果园-水果网购首选品牌，水果，我们只挑有来头的！\"  />\r\n");
      out.write("        </a>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"ser\">\r\n");
      out.write("        <form action=");
      out.print(request.getContextPath());
      out.write("/SELServlet?selkey=ser method=\"post\" >\r\n");
      out.write("          <input type=\"text\" name=\"ser\" id=\"ser_border\" value=\"苹果\" />\r\n");
      out.write("          <input type=\"submit\" name=\"ser_button\" id=\"ser_button\" value=\"搜索\" />\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"shopcart\">\r\n");
      out.write("        <div class=\"cart_img\"></div>\r\n");
      out.write("        <div class=\"cart\">\r\n");
      out.write("          <a href=");
      out.print(request.getContextPath());
      out.write("/ShopServlet?key=show&id=");
      out.print(user.getId());
      out.write("&boob=cart>我的购物车</a>\r\n");
      out.write("          <div class=\"cart_num\" id=\"cart_num\">");
      out.print(num);
      out.write("</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"cart_to\">></div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("  <div class=\"head_menu\">\r\n");
      out.write("    <div class=\"con\">\r\n");
      out.write("      <ul class=\"hmenu_ul\">\r\n");
      out.write("        <li><a href=\"index.jsp\">首页</a></li>\r\n");
      out.write("        <li><a href=");
      out.print(request.getContextPath());
      out.write("/SELServlet?selkey=all>全部商品</a></li>\r\n");
      out.write("        <li><a href=\"\">进口水果</a></li>\r\n");
      out.write("        <li><a href=\"\">国货</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
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
