package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fruitDayDB.vo.User;
import java.util.List;
import java.util.ArrayList;

public final class BSindex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("  <meta charset=\"utf-8\" />\r\n");
      out.write("  <title></title>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/BSindex.css\"/>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\"/>\r\n");
      out.write("  <script src=\"js/BSindex.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("  ");

    String show="x0";
    if(request.getAttribute("sky")!=null)
      show=(String)request.getAttribute("sky");
  
      out.write("\r\n");
      out.write("  <script>\r\n");
      out.write("    setTimeout(alert(");
      out.print(show);
      out.write("),2000);\r\n");
      out.write("  </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("<div class=\"mean\">\r\n");
      out.write("  <div class=\"logo\">\r\n");
      out.write("    <img src=\"img/alogo.png\" alt=\"\" />\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"mean_ul\">\r\n");
      out.write("    <div class=\"mean_li\" onclick=\"sss('u')\">用户管理</div>\r\n");
      out.write("    <div class=\"user_list\" id=\"user_list\">\r\n");
      out.write("      <div class=\"mm\"><a href=\"/BSServlet?key=alluser\">全部用户</a></div>\r\n");
      out.write("      <div class=\"mm\"><a href=\"/BSServlet?key=addto\">添加用户</a></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"mean_li\" onclick=\"sss('f')\">商品管理</div>\r\n");
      out.write("    <div class=\"fruit_list\" id=\"fruit_list\">\r\n");
      out.write("      <div class=\"mm\"><a href=\"\">库存水果</a></div>\r\n");
      out.write("      <div class=\"mm\"><a href=\"\">热卖水果</a></div>\r\n");
      out.write("      <div class=\"mm\"><a href=\"\">水果入库</a></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"gong\" id=\"x1\">\r\n");
      out.write("  <div class=\"con\">\r\n");
      out.write("    <div class=\"tit\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li>用户名</li>\r\n");
      out.write("        <li class=\"i\">&nbsp;</li>\r\n");
      out.write("        <li>邮箱</li>\r\n");
      out.write("        <li class=\"i\">&nbsp;</li>\r\n");
      out.write("        <li>手机</li>\r\n");
      out.write("        <li class=\"i\">&nbsp;</li>\r\n");
      out.write("        <li>操作</li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    ");

      List<User> users=new ArrayList<User>();
      if(request.getAttribute("sky")!=null)
      {
        users=(List<User>)request.getAttribute("allusers");

        for(User user:users)
        {
          out.print("    <div class=\"info\">\n" +
                  "      <ul>\n" +
                  "        <li><a href=\"/BSServlet?key=finduser&id="+user.getId()+"\">"+user.getUname()+"</a></li>\n" +
                  "        <li class=\"i\">&nbsp;</li>\n" +
                  "        <li><a href=\"/BSServlet?key=finduser&id="+user.getId()+"\">"+user.getEmail()+"</a></li>\n" +
                  "        <li class=\"i\">&nbsp;</li>\n" +
                  "        <li><a href=\"/BSServlet?key=finduser&id="+user.getId()+"\">"+user.getPhone()+"</a></li>\n" +
                  "        <li class=\"i\">&nbsp;</li>\n" +
                  "        <li><a href=\"/BSServlet?key=deluser\">删除</a></li>\n" +
                  "      </ul>\n" +
                  "    </div>");
        }
      }


    
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"gong\" id=\"x2\">\r\n");
      out.write("  <div class=\"con\">\r\n");
      out.write("    <div class=\"form\">\r\n");
      out.write("      <form action=\"/BSServlet?key=adduser\" method=\"post\">\r\n");
      out.write("        <div class=\"add\">\r\n");
      out.write("          <span class=\"add_tit\">用户名 ：</span>\r\n");
      out.write("          <span class=\"add_text\"><input type=\"text\" name=\"name1\" id=\"name1\" value=\"\" /></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"add\">\r\n");
      out.write("          <span class=\"add_tit\">邮箱 ：</span>\r\n");
      out.write("          <span class=\"add_text\"><input type=\"text\" name=\"email1\" id=\"email1\" value=\"\" /></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"add\">\r\n");
      out.write("          <span class=\"add_tit\">手机 ：</span>\r\n");
      out.write("          <span class=\"add_text\"><input type=\"text\" name=\"phone1\" id=\"phone1\" value=\"\" /></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"add\">\r\n");
      out.write("          <span class=\"add_tit\">密码 ：</span>\r\n");
      out.write("          <span class=\"add_text\"><input type=\"text\" name=\"pwd1\" id=\"pwd1\" value=\"\" /></span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"add_sublmit\">\r\n");
      out.write("          <input type=\"submit\" value=\"添加\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"gong\" id=\"x3\">\r\n");
      out.write("  <div class=\"con\">\r\n");
      out.write("    ");

      User user3=new User(1,"","","","");
      if(request.getAttribute("user")!=null)
        user3=(User)request.getAttribute("user");
    
      out.write("\r\n");
      out.write("    <div class=\"form\">\r\n");
      out.write("      <form action=/BSServlet?key=upuser&id=");
      out.print(user3.getId());
      out.write(" method=\"post\">\r\n");
      out.write("        <div class=\"add\">\r\n");
      out.write("          <span class=\"add_tit\">用户名 ：</span>\r\n");
      out.write("          <span class=\"add_text\"><input type=\"text\" name=\"name1\" id=\"name2\" value=");
      out.print(user3.getUname());
      out.write(" /></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"add\">\r\n");
      out.write("          <span class=\"add_tit\">邮箱 ：</span>\r\n");
      out.write("          <span class=\"add_text\"><input type=\"text\" name=\"email2\" id=\"email2\" value=");
      out.print(user3.getEmail());
      out.write(" /></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"add\">\r\n");
      out.write("          <span class=\"add_tit\">手机 ：</span>\r\n");
      out.write("          <span class=\"add_text\"><input type=\"text\" name=\"phone2\" id=\"phone2\" value=");
      out.print(user3.getPhone());
      out.write(" /></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"add\">\r\n");
      out.write("          <span class=\"add_tit\">密码 ：</span>\r\n");
      out.write("          <span class=\"add_text\"><input type=\"text\" name=\"pwd2\" id=\"pwd2\" value=");
      out.print(user3.getPwd());
      out.write(" /></span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"add_sublmit\">\r\n");
      out.write("          <input type=\"submit\" value=\"保存\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"gong\" id=\"x4\">\r\n");
      out.write("  <div class=\"con\">\r\n");
      out.write("    <div class=\"tit\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li>水果</li>\r\n");
      out.write("        <li class=\"i\">&nbsp;</li>\r\n");
      out.write("        <li>规格</li>\r\n");
      out.write("        <li class=\"i\">&nbsp;</li>\r\n");
      out.write("        <li>单价</li>\r\n");
      out.write("        <li class=\"i\">&nbsp;</li>\r\n");
      out.write("        <li>操作</li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"info\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"\">陕西甜枣</a></li>\r\n");
      out.write("        <li class=\"i\">&nbsp;</li>\r\n");
      out.write("        <li><a href=\"\">一斤装</a></li>\r\n");
      out.write("        <li class=\"i\">&nbsp;</li>\r\n");
      out.write("        <li><a href=\"\">86</a></li>\r\n");
      out.write("        <li class=\"i\">&nbsp;</li>\r\n");
      out.write("        <li><a href=\"\">删除</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"gong\" id=\"x5\">\r\n");
      out.write("  <div class=\"con\">\r\n");
      out.write("    <div class=\"form\">\r\n");
      out.write("      <form action=\"\" method=\"post\">\r\n");
      out.write("        <div class=\"add\">\r\n");
      out.write("          <span class=\"add_tit\">水果 ：</span>\r\n");
      out.write("          <span class=\"add_text\"><input type=\"text\" name=\"fname\" id=\"fname1\" value=\"\" /></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"add\">\r\n");
      out.write("          <span class=\"add_tit\">规格 ：</span>\r\n");
      out.write("          <span class=\"add_text\"><input type=\"text\" name=\"spec\" id=\"spec1\" value=\"\" /></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"add\">\r\n");
      out.write("          <span class=\"add_tit\">单价 ：</span>\r\n");
      out.write("          <span class=\"add_text\"><input type=\"text\" name=\"up\" id=\"up1\" value=\"\" /></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"add\">\r\n");
      out.write("          <span class=\"add_tit\">商品简介 ：</span>\r\n");
      out.write("          <span class=\"add_text\"><input type=\"text\" name=\"t1\" id=\"t11\" value=\"\" /></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"add\">\r\n");
      out.write("          <span class=\"add_tit\">温馨提示 ：</span>\r\n");
      out.write("          <span class=\"add_text\"><input type=\"text\" name=\"t2\" id=\"t21\" value=\"\" /></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"add\">\r\n");
      out.write("          <span class=\"add_tit\">图片个数 ：</span>\r\n");
      out.write("          <span class=\"add_text\"><input type=\"text\" name=\"inum\" id=\"inum1\" value=\"\" /></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"add_sublmit\">\r\n");
      out.write("          <input type=\"submit\" value=\"添加\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"gong\" id=\"x6\">\r\n");
      out.write("  <div class=\"con\">\r\n");
      out.write("    <div class=\"form\">\r\n");
      out.write("      <form action=\"\" method=\"post\">\r\n");
      out.write("        <div class=\"add\">\r\n");
      out.write("          <span class=\"add_tit\">水果 ：</span>\r\n");
      out.write("          <span class=\"add_text\"><input type=\"text\" name=\"fname\" id=\"fname2\" value=\"\" /></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"add\">\r\n");
      out.write("          <span class=\"add_tit\">规格 ：</span>\r\n");
      out.write("          <span class=\"add_text\"><input type=\"text\" name=\"spec\" id=\"spec2\" value=\"\" /></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"add\">\r\n");
      out.write("          <span class=\"add_tit\">单价 ：</span>\r\n");
      out.write("          <span class=\"add_text\"><input type=\"text\" name=\"up\" id=\"up2\" value=\"\" /></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"add\">\r\n");
      out.write("          <span class=\"add_tit\">商品简介 ：</span>\r\n");
      out.write("          <span class=\"add_text\"><input type=\"text\" name=\"t1\" id=\"t12\" value=\"\" /></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"add\">\r\n");
      out.write("          <span class=\"add_tit\">温馨提示 ：</span>\r\n");
      out.write("          <span class=\"add_text\"><input type=\"text\" name=\"t2\" id=\"t22\" value=\"\" /></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"add\">\r\n");
      out.write("          <span class=\"add_tit\">图片个数 ：</span>\r\n");
      out.write("          <span class=\"add_text\"><input type=\"text\" name=\"inum\" id=\"inum2\" value=\"\" /></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"add_sublmit\">\r\n");
      out.write("          <input type=\"submit\" value=\"保存\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"gong\" id=\"x0\" >\r\n");
      out.write("  <div class=\"con\">\r\n");
      out.write("    <div class=\"hello\">\r\n");
      out.write("      <h1>欢迎进入天天果园后台管理系统</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
