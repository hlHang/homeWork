<%--
  Created by IntelliJ IDEA.
  User: 86182
  Date: 2020/11/23
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="info">${loginer.userName}，您好！&nbsp;&nbsp;<a href="admin_loginOut_Servlet">登出</a></div>
<div class="menu">
    <ul>
        <li><a href="admin_Home_Access">首页</a></li>
        <li><a href="Admin_Category_Access">图书分类管理</a></li>
        <li><a href="book-mgr.html">图书管理</a></li>
        <li><a href="#">购书订单管理</a></li>
    </ul>
</div>
