package com.tyss.jdbctest;

import java.sql.*;
public class JDBCUpdate {

	public static void main(String[] args) {

		Connection con=null;
		Statement stmt=null;

		try {
			Driver ref=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(ref);

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opentext","j2ee","1234");

			stmt=con.createStatement();
			int n=stmt.executeUpdate("Update emp_info set PhoneNo=949357 where id=123");
			System.out.println(n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			try {
				if(con!=null)
					con.close();
				if(stmt!=null)
					stmt.close();


			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}

}
