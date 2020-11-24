package com.BookManage.dao;

import java.sql.*;
import com.BookManage.pojo.booksUser;
import com.BookManage.tools.baseTools;

public class booksUserDao {

    public booksUser findUserByIdAndPwd(String userId,String userPwd) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        booksUser user = null;
        try {
            conn = baseTools.getConn();
            String sql = "select * from books_users where userId=? and userPwd=?";
            ps = conn.prepareStatement(sql);
            rs = baseTools.query(ps, userId,userPwd);
            if(rs.next()) {
                user = new booksUser(userId, userPwd, rs.getString("userName"));
            }
        } catch (Exception e) {e.printStackTrace();
        } finally {
            baseTools.close(conn, ps, rs);
        }
        return user;
    }

}
