<%--
  Created by IntelliJ IDEA.
  User: 86182
  Date: 2020/11/23
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>智远图书网</title>
    <link type="text/css" rel="stylesheet" href="statics/css/styles.css"/>
</head>
<body>
<div id="container">
    <jsp:include page="user_nav.jsp"></jsp:include>
    <div id="main">
        <div class="box" id="register">
            <div class="title">用户登录</div>
            <form action="User_login_servlet" method="post" style="margin: 10px;">
                <table class="no-border">
                    <tr>
                        <td style="text-align: right;">登录账号：</td>
                        <td><input type="text" name="loginId" class="txt" value=""/></td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">登录密码：</td>
                        <td><input type="password" name="loginPwd" class="txt" value=""/></td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td><input type="submit" value=" 登  录 " class="btn"/>&nbsp;&nbsp;</td>
                        <td>${error}</td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
    <jsp:include page="user_footer.jsp"></jsp:include>
</div>
</body>
</html>
