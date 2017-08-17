package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fruitDayDB.vo.Fruit;
import java.util.List;
import java.util.ArrayList;
import com.fruitDayDB.vo.User;

public final class showcart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <title>购物车</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/showcart.css\" />\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\"/>\r\n");
      out.write("  <script src=\"js/imgs.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\r\n");
      out.write("  <script>\r\n");
      out.write("    window.onload=function footer_img_non(){\r\n");
      out.write("      document.getElementById(\"footer_img\").style.display=\"none\";\r\n");
      out.write("    }\r\n");
      out.write("  </script>\r\n");
      out.write("  ");

      List<Fruit> fruits=(List<Fruit>)request.getAttribute("fruits");
      User user=(User)session.getAttribute("user");
  
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"money()\">\r\n");
      out.write("<div class=\"con\">\r\n");
      out.write("  <div class=\"head\">\r\n");
      out.write("    <a href=\"index.jsp\">\r\n");
      out.write("      <img src=\"img/logo_login.png\" alt=\"\" />\r\n");
      out.write("    </a>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"shop_box\">\r\n");
      out.write("    <div class=\"head_text_box\">\r\n");
      out.write("\t\t\t\t\t<span id=\"head_text\">\r\n");
      out.write("\t\t\t\t\t\t我的购物车\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"shop_title\">\r\n");
      out.write("      <div id=\"st1\">商品</div>\r\n");
      out.write("      <div id=\"st2\">规格</div>\r\n");
      out.write("      <div id=\"st3\">单价</div>\r\n");
      out.write("      <div id=\"st4\">数量</div>\r\n");
      out.write("      <div id=\"st5\">小计</div>\r\n");
      out.write("      <div id=\"st6\">操作</div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    ");

      for(Fruit fruit:fruits)
      {
        out.print("    <div class=\"shop\">\n" +
                "      <div class=\"s1\">\n" +
                "        <div class=\"s1_img\"><a href=\"/FruitServlet?key=info&id="+user.getId()+"&fid="+fruit.getFid()+"\"><img src=\"img/fruits/"+fruit.getFid()+"/ (1).jpg\" /></a></div>\n" +
                "        <div class=\"s1_text\"><a href=\"/FruitServlet?key=info&id="+user.getId()+"&fid="+fruit.getFid()+"\">"+fruit.getFname()+"</a></div>\n" +
                "      </div>\n" +
                "\n" +
                "      <div class=\"s2\">\n" +
                "        "+fruit.getSpec()+"\n" +
                "      </div>\n" +
                "\n" +
                "      <div class=\"s3\">\n" +
                "        ￥<span id=\"up"+fruit.getFid()+"\">"+fruit.getUp()+"</span>\n" +
                "      </div>\n" +
                "\n" +
                "      <div class=\"s4\">\n" +
                "     <div class=\"Unum\"><span id=\"numl\" class=\"numl\" onclick=\"number(1,"+fruit.getFid()+");sum("+fruit.getFid()+");money()\">-</span><span id=\"num"+fruit.getFid()+"\">1</span><span id=\"numr\" class=\"numr\" onclick=\"number(0,"+fruit.getFid()+");sum("+fruit.getFid()+");money()\">+</span></div>\n" +
                "      </div>\n" +
                "\n" +
                "      <div class=\"s5\">\n" +
                "        ￥<span id=\"sum"+fruit.getFid()+"\" class=\"fsum\">"+fruit.getUp()+"</span>\n" +
                "      </div>\n" +
                "\n" +
                "      <div class=\"s6\">\n" +
                "        <a href=\"/ShopServlet?key=del&uid="+user.getId()+"&fid="+fruit.getFid()+"&str=cart\">删除</a>\n" +
                "      </div>\n" +
                "    </div>");
      }
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"shop_footer\">\r\n");
      out.write("      &nbsp;\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"sum_mon\">\r\n");
      out.write("    <div class=\"money\">商品总金额：<span id=\"money\">￥68 </span></div><br />\r\n");
      out.write("    <input type=\"button\" name=\"\" id=\"addmon\" value=\"订单结算\" />\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer/footer.jsp", out, false);
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
