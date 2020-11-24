package com.BookManage.controller;

import com.BookManage.pojo.booksUser;
import com.BookManage.service.adminService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin_login_action")
public class adminLoginServlet extends HttpServlet {
    private adminService userService = new adminService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String userId = request.getParameter("userId");
        String userPwd = request.getParameter("userPwd");
        if (null == userId || null == userPwd || userId.length() < 1 || userPwd.length() < 1) {
            request.setAttribute("error", "账户或者密码为空");
            request.getRequestDispatcher("admin_login.jsp").forward(request, response);
        }

        booksUser user = userService.findUserByIdAndPwd(userId, userPwd);
        if(null == user) {	// 登录失败
            request.setAttribute("error", "账户或密码错误！");
            request.getRequestDispatcher("admin_login.jsp").forward(request, response);
        }
        request.getSession().setAttribute("loginer", user);
        request.getRequestDispatcher("WEB-INF/admin_home.jsp").forward(request, response);
    }
}
