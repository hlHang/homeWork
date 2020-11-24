<%--
  Created by IntelliJ IDEA.
  User: 86182
  Date: 2020/11/23
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>智远图书网</title>
    <link type="text/css" rel="stylesheet" href="statics/css/styles.css"/>
    <script>
        function changeImg(){
            var img = document.getElementById("codeImg");
            // 当src每次的路径方式变化时，就会去重新请求一次后台
            // new Date().getTime()？它是JavaScript的Date对象的方法，此处的作用是为了避免
            //  浏览器不会去执行后台代码(因为浏览器缓存原因)
            img.src="code_img?"+new Date().getTime();
        }
    </script>
</head>
<body>
<div id="container">
    <jsp:include page="user_nav.jsp"></jsp:include>
    <div id="main">
        <div class="box" id="register">
            <div class="title">新用户注册</div>
            <form action="User_regist_action" method="post" style="margin: 10px;">
                <table cellspacing="0" class="no-border">
                    <tr>
                        <td style="text-align: right;">登录账号：</td>
                        <td><input type="text" name="loginId" class="txt" value=""/></td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">登录密码：</td>
                        <td><input type="password" name="loginPwd" class="txt" value=""/></td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">再次输入密码：</td>
                        <td><input type="password" name="reLoginPwd" class="txt" value=""/></td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">真实姓名：</td>
                        <td><input type="text" name="name" class="txt" value=""/></td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">验证码：</td>
                        <td><input type="text" name="code" class="txt"/></td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td><img style="vertical-align: middle;" id="codeImg" src="code_img" />&nbsp;&nbsp;看不清？<a href="javascript:changeImg()" style="color: #64A26F;">换张图</a></td>
                    </tr>
                    <tr>
                    <tr>
                        <td>&nbsp;;</td>
                        <td><input type="submit" value=" 注  册 " class="btn"/>&nbsp;&nbsp;</td>
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
