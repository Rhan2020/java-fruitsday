<%@ page import="com.fruitDayDB.vo.Fruit" %>
<%@ page import="java.util.List" %>
<%@ page import="com.fruitDayDB.vo.User" %>
<%--
  Created by IntelliJ IDEA.
  User: xi
  Date: 2015/10/3
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8" />
  <title>水果信息</title>
  <link rel="stylesheet" type="text/css" href="css/imgs.css"/>
  <link rel="stylesheet" type="text/css" href="css/main.css"/>
  <script src="js/imgs.js" type="text/javascript" charset="utf-8"></script>
  <%
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
  %>
</head>
<body onload="show()">
<jsp:include page="head/head.jsp"></jsp:include>

<div class="fruit_info">
  <div class="img_box">
    <%
      String cname="show";
      for(int i=1;i<fruit.getInum()+1;i++)
      {
        out.println("<div id=\"p"+(i-1)+"\" class=\"" + cname + "\"><img src=\"img/fruits/" + fruit.getFid() + "/ (" + i + ").jpg\" /></div>");
        cname="non";
      }
    %>

    <div class="img_to">
      <ul >
        <%
          for(int i=1;i<fruit.getInum()+1;i++)
          {
            out.print("<li><img src=\"img/fruits/"+fruit.getFid()+"/ ("+i+").jpg\" id=\"s"+(i-1)+"\" onMouseMove=\"himg(this.id)\"/></li>");
          }
        %>
      </ul>
    </div>
  </div>

  <div class="fruit_text">
    <div class="fname"><%=fruit.getFname()%></div>
    <p>&nbsp;</p>
    <div class="spec"><input type="radio" checked="checked" name="fnum_radio" value="fnum_radio" /><%=fruit.getSpec()%></div>
    <div class="up">￥<%=fruit.getUp()%></div>
    <div class="fid">商品编号:<%=fruit.getFid()%></div>
    <hr />

    <form  method="post" id="fform">
      <div class="fform">
        <div class="fform1">
      <div class="Uaddress">配送至 :
        <select name="address" id="sel">
          <option value="上海">上海</option>
          <option value="吉林">吉林</option>
          <option value="山西">山西</option>
          <option value="北京">北京</option>
        </select>
      </div>
      <div class="Unum"><span id="numl" onclick="number(1,<%=fruit.getFid()%>)">-</span><span id="num<%=fruit.getFid()%>">1</span><span id="numr" onclick="number(0,<%=fruit.getFid()%>)">+</span></div>
      </div>
          <div class="Uadd"><input type="button" name="add" id="cart" value="<%=tit1%>" onclick="addCart(<%=user.getId()%>,<%=fruit.getFid()%>)" /></div>
          <div class="starbutton"><input type="button" name="add" id="star" value="<%=tit2%>" onclick="addStar(<%=user.getId()%>,<%=fruit.getFid()%>)"/></div>
      </div>
    </form>

    <hr />
    <div class="finfo">
      <h3>商品简介</h3>
      <p id="finfo_text"><%=fruit.getT1()%></p>
    </div>
    <hr />
    <div class="fpro">
      <h3>温馨提示</h3>
      <p id="fpro_text"><%=fruit.getT2()%></p>
    </div>
    <hr />
  </div>

  <div class="fruit_hot" >
    <div class="hf_title"><span class="ht_l">热卖商品</span><span class="ht_r"><a href="">MORE+</a></span></div>
    <%
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

    %>
  </div>
</div>

<jsp:include page="footer/footer.jsp"></jsp:include>
</body>
</html>
