package com.miiceic.refactor.pattern.proxy.staticProxy;

import java.sql.Connection;
import java.sql.SQLException;

public class TransactionManager {
	public static void begin(){
		Connection con = JdbcUtil.getCon();
		try {
			con.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
