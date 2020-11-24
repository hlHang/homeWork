package com.BookManage.dao;

import com.BookManage.pojo.Category;
import com.BookManage.pojo.booksUser;
import com.BookManage.tools.baseTools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookDao {

    public Category findCategoryByName(String CategoryName) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Category category = null;
        try {
            conn = baseTools.getConn();
            String sql = "select * from books_category where categoryName=?";
            ps = conn.prepareStatement(sql);
            rs = baseTools.query(ps, CategoryName);
            if(rs.next()) {
                category = new Category(CategoryName);
            }
        } catch (Exception e) {e.printStackTrace();
        } finally {
            baseTools.close(conn, ps, rs);
        }
        return category;
    }
}
