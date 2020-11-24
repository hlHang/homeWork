package com.BookManage.service;

import com.BookManage.dao.UserDao;
import com.BookManage.pojo.NewUsers;
import com.BookManage.pojo.booksUser;

public class UsersService {
    private UserDao UserDao = new UserDao();

    public int addUsers(NewUsers newUsers) {
        return UserDao.addGoods(newUsers);
    }

    public booksUser login(String userId, String userPwd){
            return UserDao.login(userId,userPwd);
    }
}
