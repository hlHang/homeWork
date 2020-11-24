<%--
  Created by IntelliJ IDEA.
  User: 86182
  Date: 2020/11/23
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="header">
    <div id="tool-bar">&nbsp;&nbsp; 欢迎光临智远图书网，
        <c:choose>
            <c:when test="${empty loginers }">
                [<a href="user_login.jsp">请登录</a>]&nbsp;
                [<a href="user_regist.jsp">免费注册</a>]
            </c:when>
            <c:otherwise>
                欢迎您[${loginers.userName }]
                [<a href="user_LoginOut_Action">登出</a>]
            </c:otherwise>
        </c:choose>
        &nbsp;<a href="index.html">首页</a>&nbsp;|&nbsp;<a href="cart.html">购物车</a>&nbsp;|&nbsp;<a href="#">我的订单</a>&nbsp;|&nbsp;<a
                href="#">帮助</a></div>
    <h1>智远图书网-<span style="font-size: 48px; font-family: Arial; font-weight: lighter;">Book</span></h1>
</div>