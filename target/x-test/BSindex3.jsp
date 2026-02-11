<%@ page import="com.fruitDayDB.vo.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
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


<div class="gong" id="x3">
  <div class="con">
    <%
      User user3=new User(1,"","","","");
      if(request.getAttribute("user")!=null)
        user3=(User)request.getAttribute("user");
    %>
    <div class="form">
      <form action=/x-test/BSServlet?key=upuser&id=<%=user3.getId()%> method="post">
        <div class="add">
          <span class="add_tit">用户名 ：</span>
          <span class="add_text"><input type="text" name="name1" id="name2" value=<%=user3.getUname()%> /></span>
        </div>

        <div class="add">
          <span class="add_tit">邮箱 ：</span>
          <span class="add_text"><input type="text" name="email2" id="email2" value=<%=user3.getEmail()%> /></span>
        </div>

        <div class="add">
          <span class="add_tit">手机 ：</span>
          <span class="add_text"><input type="text" name="phone2" id="phone2" value=<%=user3.getPhone()%> /></span>
        </div>

        <div class="add">
          <span class="add_tit">密码 ：</span>
          <span class="add_text"><input type="text" name="pwd2" id="pwd2" value=<%=user3.getPwd()%> /></span>
        </div>
        <div class="add_sublmit">
          <input type="submit" value="保存"/>
        </div>
      </form>
    </div>
  </div>
</div>

<div class="gong" id="x4">


</body>
</html>

