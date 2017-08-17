<%@ page import="java.util.List" %>
<%@ page import="com.fruitDayDB.vo.Fruit" %>
<%@ page import="com.fruitDayDB.vo.User" %>
<%--
  Created by IntelliJ IDEA.
  User: xi
  Date: 2015/10/3
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8" />
  <title>天天果园-水果网购首选品牌，水果，我们只挑有来头的！</title>
  <link rel="stylesheet" type="text/css" href="css/main.css"/>
  <link rel="stylesheet" type="text/css" href="css/index.css"/>
  <script src="js/imgs.js" type="text/javascript" charset="utf-8"></script>
    <jsp:include page="/FruitServlet?key=hot"></jsp:include>
    <jsp:include page="head/head.jsp"></jsp:include>

</head>
<body onload="fimg()" >

<%
    List<Fruit> hotFruits=(List<Fruit>)request.getAttribute("fruits");
   int id=0;
    if(session.getAttribute("user")!=null) {
        User user = (User) session.getAttribute("user");
        id= user.getId();
    }
%>
<div class="imgs">
  <div class="con">
    <div id="p0" class="show"><a  target="_blank" href="http://huodong.fruitday.com/sale/zhongqiu0906/pcsh.html"><img src="img/index/h0.jpg" alt="" /></a></div>
    <div id="p1" class="non"><a  target="_blank" href="http://huodong.fruitday.com/sale/midautumn/pc.html"><img src="img/index/h1.jpg" alt="" /></a></div>
    <div id="p2" class="non"><a  target="_blank" href="http://huodong.fruitday.com/sale/912_oh/pc.html"><img src="img/index/h2.jpg" alt="" /></a></div>
    <div id="p3" class="non"><a  target="_blank" href="http://subject.fruitday.com/sale/pg/pg.html"><img src="img/index/h3.jpg" alt="" /></a></div>
    <div id="p4" class="non"><a  target="_blank" href="http://huodong.fruitday.com/sale/Zespri_0901/PC.html"><img src="img/index/h4.jpg" alt="" /></a></div>

    <ul class="imgul">
      <li id="l0"  onmouseover="simg(this.innerHTML)" onmouseout="fimg()">1</li>
      <li id="l1"  onmouseover="simg(this.innerHTML)" onmouseout="fimg()">2</li>
      <li id="l2"  onmouseover="simg(this.innerHTML)" onmouseout="fimg()">3</li>
      <li id="l3"  onmouseover="simg(this.innerHTML)" onmouseout="fimg()">4</li>
      <li id="l4"  onmouseover="simg(this.innerHTML)" onmouseout="fimg()">5</li>
    </ul>
  </div>
</div>

<div class="fruitboxs">

  <div class="con">
    <div class="fhead">
      <div class="fhr"></div>
      <div class="ser_more">
        <div class="fser">热卖专区</div>
        <div class="fmore"><a href="">查看更多 ></a></div>
      </div>
    </div>

<%
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
%>

  </div>
</div>

<jsp:include page="footer/footer.jsp"></jsp:include>
</body>
</html>

<!--<script language="javascript">
function getData() {
window.location.href = "getDataServlet";
}
</script>
<BODY onload="getData()">-->

