<%--
  Created by IntelliJ IDEA.
  User: xi
  Date: 2015/10/3
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <title>用户登陆 - 天天果园-水果网购首选品牌，水果，我们只挑有来头的！</title>
  <link rel="stylesheet" type="text/css" href="css/main.css"/>
  <link rel="stylesheet" type="text/css" href="css/rl.css"/>
  <script src="js/reg.js"></script>
  <script>
    window.onload=function footer_img_non(){
      document.getElementById("footer_img").style.display="none";
    }
  </script>
</head>
<body>
<div class="con">
  <div class="box">
    <div class="head">
      <a href="index.jsp">
        <img src="img/logo_login.png" alt="" />
      </a>
    </div>

    <div class="text">
      <div class="text_head">
        <span class="h01">注册会员</span>
        <span class="h02">赠时令鲜果1份</span>
        <div class="xhr"></div>
      </div>
      <form action=<%=request.getContextPath()%>/UserServlet?key=add method="post" id="regForm">
              <div class="text_box">
                  <div class="main"><div class="name">邮箱：</div>
                  <input type="text" name="email" id="email" value="" onblur="isEmail()"/>
                  <div id="isEmail" class="iss"></div>
                  </div>
                  <div class="main"><div class="name">手机号码：</div>
                  <input type="text" name="phone" id="phone" value="" onblur="isPhone()"/>
                  <div id="isPhone" class="iss"></div>
                  </div>
                  <div class="main"><div class="name">密码：</div>
                  <input type="password" name="pwd1" id="pwd1" value="" onblur="isPwd1()"/>
                  <div id="isPwd1" class="iss"></div>
                  </div>
                  <div class="main"><div class="name">确定密码：</div>
                  <input type="password" name="pwd2" id="pwd2" value="" onblur="isPwd2()"/>
                  <div id="isPwd2" class="iss"></div>
                  </div>
                  <div class="xbutton">
                  <input type="button" name="reg" id="reg" value="注册" onclick="isReg()"/>
                  </div>
              </div>
      	</form>
    </div>

    <div class="jmp">
      <div class="jmpp">
        已经是天天果园会员?
      </div>
      <div class="jmpa">
        <a href="login.jsp">立即登陆&nbsp;></a>
      </div>
    </div>
  </div>
  <jsp:include page="footer/footer.jsp"></jsp:include>
</div>
</body>
</html>
