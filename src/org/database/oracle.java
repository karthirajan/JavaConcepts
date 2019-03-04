package org.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class oracle {
	public static void main(String[] args) throws Throwable {
		
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "admin");
		String s="select * from Details";
		PreparedStatement x = con1.prepareStatement(s);
		ResultSet x1 = x.executeQuery();
		
		while (x1.next()) {
			System.out.println(x1.getInt("Id"));
			System.out.println(x1.getLong("Phone"));
			System.out.println(x1.getString("name"));
			
		}
		
		con1.close();
		
	}
	
	
	

}
