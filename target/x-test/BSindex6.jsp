<%@ page import="com.fruitDayDB.vo.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.fruitDayDB.vo.Fruit" %>
<%--
  Created by IntelliJ IDEA.
  User: xi
  Date: 2015/10/18
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>

  <meta charset="utf-8" />
  <title></title>
  <link rel="stylesheet" type="text/css" href="css/BSindex.css"/>
  <link rel="stylesheet" type="text/css" href="css/main.css"/>
  <script src="js/BSindex.js" type="text/javascript" charset="utf-8"></script>
  <%
    String show="x0";
    if(request.getAttribute("sky")!=null)
      show=(String)request.getAttribute("sky");
  %>
</head>
<body >
<div class="mean">
  <div class="logo">
    <a href="index.jsp"><img src="img/alogo.png" alt="" /></a>
  </div>


  <div class="mean_ul">
    <div class="mean_li" onclick="sss('u')">用户管理</div>
    <div class="user_list" id="user_list">
      <div class="mm"><a href="/x-test/BSServlet?key=alluser">全部用户</a></div>
      <div class="mm"><a href="BSindex2.jsp">添加用户</a></div>
    </div>
    <div class="mean_li" onclick="sss('f')">商品管理</div>
    <div class="fruit_list" id="fruit_list">
      <div class="mm"><a href="/x-test/BSServlet?key=allfruit">库存水果</a></div>
      <div class="mm"><a href="/x-test/BSServlet?key=hotfruit">热卖水果</a></div>
      <div class="mm"><a href="BSindex5.jsp">水果入库</a></div>
    </div>
  </div>

</div>
<%
  Fruit fruit=new Fruit("","",0,"","",0);
  if(request.getAttribute("fruit")!=null)
    fruit=(Fruit)request.getAttribute("fruit");
%>
<div class="gong" id="x6">
  <div class="con">
    <div class="form">
      <form action=/x-test/BSServlet?key=upfruit&fid=<%=fruit.getFid()%> method="post">
        <div class="add">
          <span class="add_tit">水果 ：</span>
          <span class="add_text"><input type="text" name="fname" id="fname2" value=<%=fruit.getFname()%> /></span>
        </div>

        <div class="add">
          <span class="add_tit">规格 ：</span>
          <span class="add_text"><input type="text" name="spec" id="spec2" value=<%=fruit.getSpec()%> /></span>
        </div>

        <div class="add">
          <span class="add_tit">单价 ：</span>
          <span class="add_text"><input type="text" name="up" id="up2" value=<%=fruit.getUp()%> /></span>
        </div>

        <div class="add">
          <span class="add_tit">商品简介 ：</span>
          <span class="add_text"><input type="text" class="long" name="t1" id="t12" value=<%=fruit.getT1()%> /></span>
        </div>

        <div class="add">
          <span class="add_tit">温馨提示 ：</span>
          <span class="add_text"><input type="text" class="long" name="t2" id="t22" value=<%=fruit.getT2()%> class="long"/></span>
        </div>

        <div class="add">
          <span class="add_tit">图片个数 ：</span>
          <span class="add_text"><input type="text" name="inum" id="inum2" value=<%=fruit.getInum()%> /></span>
        </div>

        <div class="add_sublmit">
          <input type="submit" value="保存"/>
        </div>
      </form>
    </div>
  </div>
</div>




</body>
</html>

