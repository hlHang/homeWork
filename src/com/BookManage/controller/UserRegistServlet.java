package com.BookManage.controller;

import com.BookManage.pojo.NewUsers;
import com.BookManage.service.UsersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/User_regist_action")
public class UserRegistServlet extends HttpServlet {
    private UsersService addUserService = new UsersService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String userId = request.getParameter("loginId");
        String userPwd = request.getParameter("loginPwd");
        String reUserPwd = request.getParameter("reLoginPwd");
        String userName = request.getParameter("name");
        String code = request.getParameter("code");
        if (null == userId || null == userPwd || reUserPwd == null || userName == null || code == null || userId.length() < 1 || userPwd.length() < 1 || userName.length() < 1 || code.length() < 1) {
            request.setAttribute("error", "账户或者密码为空");
            request.getRequestDispatcher("user_regist.jsp").forward(request, response);
        }


        // 验证验证码是否相同
        String yzm = (String) request.getSession().getAttribute("yzm");
        if (yzm.equals(code) == false) {
            request.setAttribute("error", "验证码错误！");
            request.getRequestDispatcher("user_regist.jsp").forward(request, response);
            return;
        }

        NewUsers newUsers = new NewUsers(userId, userPwd, userName);
        if (userPwd.equals(reUserPwd)) {
            addUserService.addUsers(newUsers);
            request.setAttribute("error", "注册成功！");
            request.getRequestDispatcher("user_regist.jsp").forward(request, response);
        } else {
            request.setAttribute("error", "你两次输入的密码不相同");
            request.getRequestDispatcher("user_regist.jsp").forward(request, response);
        }


    }
}
