package com.BookManage.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Admin_Category_Access")
public class AdminCategoryAccess extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String categoryName = request.getParameter("tname");
        if (null == categoryName || categoryName.length()<1){
            request.setAttribute("error","分类不能为空！");

        }

        request.getRequestDispatcher("WEB-INF/admin_mgr.jsp").forward(request, response);
    }
}
