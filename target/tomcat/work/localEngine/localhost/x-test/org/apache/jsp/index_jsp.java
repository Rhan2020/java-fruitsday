package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.fruitDayDB.vo.Fruit;
import com.fruitDayDB.vo.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\" />\r\n");
      out.write("  <title>天天果园-水果网购首选品牌，水果，我们只挑有来头的！</title>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\"/>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\"/>\r\n");
      out.write("  <script src=\"js/imgs.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/FruitServlet?key=hot", out, false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head/head.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"fimg()\" >\r\n");
      out.write("\r\n");

    List<Fruit> hotFruits=(List<Fruit>)request.getAttribute("fruits");
   int id=0;
    if(session.getAttribute("user")!=null) {
        User user = (User) session.getAttribute("user");
        id= user.getId();
    }

      out.write("\r\n");
      out.write("<div class=\"imgs\">\r\n");
      out.write("  <div class=\"con\">\r\n");
      out.write("    <div id=\"p0\" class=\"show\"><a  target=\"_blank\" href=\"http://huodong.fruitday.com/sale/zhongqiu0906/pcsh.html\"><img src=\"img/index/h0.jpg\" alt=\"\" /></a></div>\r\n");
      out.write("    <div id=\"p1\" class=\"non\"><a  target=\"_blank\" href=\"http://huodong.fruitday.com/sale/midautumn/pc.html\"><img src=\"img/index/h1.jpg\" alt=\"\" /></a></div>\r\n");
      out.write("    <div id=\"p2\" class=\"non\"><a  target=\"_blank\" href=\"http://huodong.fruitday.com/sale/912_oh/pc.html\"><img src=\"img/index/h2.jpg\" alt=\"\" /></a></div>\r\n");
      out.write("    <div id=\"p3\" class=\"non\"><a  target=\"_blank\" href=\"http://subject.fruitday.com/sale/pg/pg.html\"><img src=\"img/index/h3.jpg\" alt=\"\" /></a></div>\r\n");
      out.write("    <div id=\"p4\" class=\"non\"><a  target=\"_blank\" href=\"http://huodong.fruitday.com/sale/Zespri_0901/PC.html\"><img src=\"img/index/h4.jpg\" alt=\"\" /></a></div>\r\n");
      out.write("\r\n");
      out.write("    <ul class=\"imgul\">\r\n");
      out.write("      <li id=\"l0\"  onmouseover=\"simg(this.innerHTML)\" onmouseout=\"fimg()\">1</li>\r\n");
      out.write("      <li id=\"l1\"  onmouseover=\"simg(this.innerHTML)\" onmouseout=\"fimg()\">2</li>\r\n");
      out.write("      <li id=\"l2\"  onmouseover=\"simg(this.innerHTML)\" onmouseout=\"fimg()\">3</li>\r\n");
      out.write("      <li id=\"l3\"  onmouseover=\"simg(this.innerHTML)\" onmouseout=\"fimg()\">4</li>\r\n");
      out.write("      <li id=\"l4\"  onmouseover=\"simg(this.innerHTML)\" onmouseout=\"fimg()\">5</li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"fruitboxs\">\r\n");
      out.write("\r\n");
      out.write("  <div class=\"con\">\r\n");
      out.write("    <div class=\"fhead\">\r\n");
      out.write("      <div class=\"fhr\"></div>\r\n");
      out.write("      <div class=\"ser_more\">\r\n");
      out.write("        <div class=\"fser\">优惠专区</div>\r\n");
      out.write("        <div class=\"fmore\"><a href=\"\">查看更多 ></a></div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");

  for(Fruit fruit:hotFruits)
  {
    out.print("    <div class=\"fruit_box\">\n" +
            "      <div class=\"fruit_img\">\n" +
            "        <a href=\""+request.getContextPath()+"/FruitServlet?key=info&id="+id+"&fid="+fruit.getFid()+"\"><img src=\"img/fruits/"+fruit.getFid()+"/ (1).jpg\" /></a>\n" +
            "      </div>\n" +
            "      <div class=\"fruit_name\">\n" +
            "        <a href=\""+request.getContextPath()+"/FruitServlet?key=info&id="+id+"&fid="+fruit.getFid()+"\">"+fruit.getFname()+"</a>\n" +
            "      </div>\n" +
            "      <div class=\"fruit_num\">\n" +
            "        "+fruit.getSpec()+"\n" +
            "      </div>\n" +
            "      <div class=\"fruit_mon\">\n" +
            "        "+fruit.getUp()+"\n" +
            "      </div>\n" +
            "    </div>");
  }

      out.write("\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<!--<script language=\"javascript\">\r\n");
      out.write("function getData() {\r\n");
      out.write("window.location.href = \"getDataServlet\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<BODY onload=\"getData()\">-->\r\n");
      out.write("\r\n");
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
