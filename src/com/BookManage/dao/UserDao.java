package com.BookManage.dao;

import com.BookManage.pojo.NewUsers;
import com.BookManage.pojo.booksUser;
import com.BookManage.tools.baseTools;

import java.sql.*;

public class UserDao {
    public int addGoods(NewUsers newUsers) {
        Connection conn = null;
        PreparedStatement ps = null;
        int count = 0;
        try {
            conn = baseTools.getConn();
            String sql = "insert into regist_user(loginId,loginPwd,userName) values(?,?,?)";
            ps = conn.prepareStatement(sql);
            count = baseTools.update(ps, newUsers.getUserId(), newUsers.getUserPwd(), newUsers.getUserName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            baseTools.close(conn, ps, null);
        }
        return count;
    }

    public booksUser login(String userId, String userPwd) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        booksUser user = null;
        try {
            conn = baseTools.getConn();
            String sql = "select * from regist_user where loginId=? and loginPwd=?";
            ps = conn.prepareStatement(sql);
            rs = baseTools.query(ps, userId, userPwd);
            if (rs.next()) {
                 user = new booksUser(userId, userPwd, rs.getString("userName"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            baseTools.close(conn, ps, rs);
        }
        return user;
    }
}

