package com.BookManage.service;

import com.BookManage.dao.BookDao;
import com.BookManage.pojo.Category;
import com.BookManage.pojo.booksUser;

import com.BookManage.dao.booksUserDao;

public class adminService {
    private booksUserDao booksUserDao = new booksUserDao();
    private BookDao bookDao = new BookDao();

    public booksUser findUserByIdAndPwd(String userId,String userPwd){
        return booksUserDao.findUserByIdAndPwd(userId,userPwd);
    }

    public Category findCategoryByName(String categoryName){
        return bookDao.findCategoryByName(categoryName);
    }
}
