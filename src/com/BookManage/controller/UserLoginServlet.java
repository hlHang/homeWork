package com.BookManage.controller;

import com.BookManage.pojo.booksUser;
import com.BookManage.service.UsersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/User_login_servlet")
public class UserLoginServlet extends HttpServlet {
    private UsersService usersService = new UsersService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String userId = request.getParameter("loginId");
        String userPwd = request.getParameter("loginPwd");
        if (null == userId || null == userPwd || userId.length() < 1 || userPwd.length() < 1) {
            request.setAttribute("error", "账户或者密码为空");
            request.getRequestDispatcher("user_login.jsp").forward(request, response);
        }

        booksUser user = usersService.login(userId, userPwd);
        if(null == user) {	// 登录失败
            request.setAttribute("error", "账户或密码错误！");
            request.getRequestDispatcher("user_login.jsp").forward(request, response);
        }
        request.getSession().setAttribute("loginers", user);
        request.getRequestDispatcher("WEB-INF/user_index.jsp").forward(request, response);
    }
}
