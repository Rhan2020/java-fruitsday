package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fruitDayDB.vo.Fruit;
import java.util.List;
import com.fruitDayDB.vo.User;

public final class fruit_005finfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>水果信息</title>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/imgs.css\"/>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\"/>\r\n");
      out.write("  <script src=\"js/imgs.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("  ");

    Fruit fruit=(Fruit)request.getAttribute("fruit");
    List<Fruit> hotFruits=(List<Fruit>)request.getAttribute("fruits");
    User user=new User(0);
    if(session.getAttribute("user")!=null)
       user=(User)session.getAttribute("user");

    String tit1="加入购物车";
    if(request.getAttribute("tit1")!=null)
      tit1=(String)request.getAttribute("tit1");

    String tit2="关注商品";
    if(request.getAttribute("tit2")!=null)
      tit2=(String)request.getAttribute("tit2");
  
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"show()\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head/head.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"fruit_info\">\r\n");
      out.write("  <div class=\"img_box\">\r\n");
      out.write("    ");

      String cname="show";
      for(int i=1;i<fruit.getInum()+1;i++)
      {
        out.println("<div id=\"p"+(i-1)+"\" class=\"" + cname + "\"><img src=\"img/fruits/" + fruit.getFid() + "/ (" + i + ").jpg\" /></div>");
        cname="non";
      }
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"img_to\">\r\n");
      out.write("      <ul >\r\n");
      out.write("        ");

          for(int i=1;i<fruit.getInum()+1;i++)
          {
            out.print("<li><img src=\"img/fruits/"+fruit.getFid()+"/ ("+i+").jpg\" id=\"s"+(i-1)+"\" onMouseMove=\"himg(this.id)\"/></li>");
          }
        
      out.write("\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"fruit_text\">\r\n");
      out.write("    <div class=\"fname\">");
      out.print(fruit.getFname());
      out.write("</div>\r\n");
      out.write("    <p>&nbsp;</p>\r\n");
      out.write("    <div class=\"spec\"><input type=\"radio\" checked=\"checked\" name=\"fnum_radio\" value=\"fnum_radio\" />");
      out.print(fruit.getSpec());
      out.write("</div>\r\n");
      out.write("    <div class=\"up\">￥");
      out.print(fruit.getUp());
      out.write("</div>\r\n");
      out.write("    <div class=\"fid\">商品编号:");
      out.print(fruit.getFid());
      out.write("</div>\r\n");
      out.write("    <hr />\r\n");
      out.write("\r\n");
      out.write("    <form  method=\"post\" id=\"fform\">\r\n");
      out.write("      <div class=\"fform\">\r\n");
      out.write("        <div class=\"fform1\">\r\n");
      out.write("      <div class=\"Uaddress\">配送至 :\r\n");
      out.write("        <select name=\"address\" id=\"sel\">\r\n");
      out.write("          <option value=\"上海\">上海</option>\r\n");
      out.write("          <option value=\"吉林\">吉林</option>\r\n");
      out.write("          <option value=\"山西\">山西</option>\r\n");
      out.write("          <option value=\"北京\">北京</option>\r\n");
      out.write("        </select>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"Unum\"><span id=\"numl\" onclick=\"number(1,");
      out.print(fruit.getFid());
      out.write(")\">-</span><span id=\"num");
      out.print(fruit.getFid());
      out.write("\">1</span><span id=\"numr\" onclick=\"number(0,");
      out.print(fruit.getFid());
      out.write(")\">+</span></div>\r\n");
      out.write("      </div>\r\n");
      out.write("          <div class=\"Uadd\"><input type=\"button\" name=\"add\" id=\"cart\" value=\"");
      out.print(tit1);
      out.write("\" onclick=\"addCart(");
      out.print(user.getId());
      out.write(',');
      out.print(fruit.getFid());
      out.write(")\" /></div>\r\n");
      out.write("          <div class=\"starbutton\"><input type=\"button\" name=\"add\" id=\"star\" value=\"");
      out.print(tit2);
      out.write("\" onclick=\"addStar(");
      out.print(user.getId());
      out.write(',');
      out.print(fruit.getFid());
      out.write(")\"/></div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    <hr />\r\n");
      out.write("    <div class=\"finfo\">\r\n");
      out.write("      <h3>商品简介</h3>\r\n");
      out.write("      <p id=\"finfo_text\">");
      out.print(fruit.getT1());
      out.write("</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <hr />\r\n");
      out.write("    <div class=\"fpro\">\r\n");
      out.write("      <h3>温馨提示</h3>\r\n");
      out.write("      <p id=\"fpro_text\">");
      out.print(fruit.getT2());
      out.write("</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <hr />\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"fruit_hot\" >\r\n");
      out.write("    <div class=\"hf_title\"><span class=\"ht_l\">热卖商品</span><span class=\"ht_r\"><a href=\"\">MORE+</a></span></div>\r\n");
      out.write("    ");

      int i=1;
      for(Fruit fruits:hotFruits)
      {
        out.print("    <div class=\"hot_fruit\">\n" +
                "      <div class=\"hf_img\"><a href=\""+request.getContextPath()+"/FruitServlet?key=info&id="+user.getId()+"&fid="+fruits.getFid()+"\"><img src=\"img/fruits/"+fruits.getFid()+"/ (1).jpg\" /></a></div>\n" +
                "      <div c=\"hf_text\">\n" +
                "        <div class=\"hf_name\"><a href=\""+request.getContextPath()+"/FruitServlet?key=info&id="+user.getId()+"&fid="+fruits.getFid()+"\">"+fruits.getFname()+"</a></div>\n" +
                "        <div class=\"hf_mon\">现货：￥<span>"+fruits.getUp()+"</span></div>\n" +
                "      </div>\n" +
                "    </div>");
        i++;
        if(i==4)
          break;
      }

    
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
