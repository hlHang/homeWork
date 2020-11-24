<%--
  Created by IntelliJ IDEA.
  User: 86182
  Date: 2020/11/24
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>图书网后台管理系统</title>
    <link type="text/css" rel="stylesheet" href="../statics/css/mgr.css"/>
</head>
<body>
<div id="container">
   <jsp:include page="../admin_title.jsp"></jsp:include>
    <jsp:include page="../admin_nav.jsp"></jsp:include>
    <div id="main">
        <div class="section-left">
            <h2>图书分类信息</h2>
            <table class="table" cellspacing="0">
                <tr>
                    <td class="header" width="200">图书分类</td>
                    <td class="header" width="60">操作</td>
                </tr>
                <tr>
                    <td>小说</td>
                    <td><a href="#">删除</a></td>
                </tr>
                <tr>
                    <td>历史</td>
                    <td><a href="#">删除</a></td>
                </tr>
                <tr>
                    <td>玄幻</td>
                    <td><a href="#">删除</a></td>
                </tr>
            </table>
        </div>
        <div class="section-right">
            <h2>添加分类信息</h2>
            <form action="" method="post">
                <p>分类名称：<input type="text" name="tname"  /><input type="submit" value=" 保 存 "  /></p>
            </form>
        </div>
        <div class="cf"></div>
    </div>
    <jsp:include page="../admin_footer.jsp"></jsp:include>
</div>
</body>
</html>


