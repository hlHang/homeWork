package com.BookManage.tools;

import java.sql.*;
/**
 * 数据库底层工具类
 */
public class baseTools {
	public static final String URL = "jdbc:mysql://localhost:3306/system_book?useUnicode=true&characterEncoding=utf-8&useSSL=false";
	public static final String USER = "root";
	public static final String PASSWORD = "123456";
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 获取数据库连接
	 * @return 数据库连接对象
	 */
	public static Connection getConn() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
	/**
	 * 关闭数据库资源
	 * @param conn
	 * @param ps
	 * @param rs
	 */
	public static void close(Connection conn,PreparedStatement ps,ResultSet rs) {
		try {
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(conn != null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 执行查询返回结果集
	 * @param ps--执行块
	 * @param arr--参数数组
	 * @return
	 * @throws SQLException 
	 */
	public static ResultSet query(PreparedStatement ps,Object... arr) throws SQLException {
		for(int i = 0;i < arr.length;i++) {
			ps.setObject(i+1, arr[i]);
		}
		return ps.executeQuery();
	}
	/**
	 * 增删改数据库方法
	 * @param ps
	 * @param arr
	 * @return 受影响的行数
	 * @throws SQLException 
	 */
	public static int update(PreparedStatement ps,Object... arr) throws SQLException {
		for(int i = 0;i < arr.length;i++) {
			ps.setObject(i+1, arr[i]);
		}
		return ps.executeUpdate();
	}
}




