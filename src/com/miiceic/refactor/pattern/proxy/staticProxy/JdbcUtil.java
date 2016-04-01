package com.miiceic.refactor.pattern.proxy.staticProxy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
	private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
	public static Connection getCon(){
		
		Connection con = tl.get();
		if(con==null){
			//¶¯Ì¬¼ÓÔØÇý¶¯
			try {
				con = DriverManager.getConnection("","","");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			tl.set(con);
		}
		return con;
	}
}
