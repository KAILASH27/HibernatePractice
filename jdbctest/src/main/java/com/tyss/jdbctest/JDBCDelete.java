package com.tyss.jdbctest;

import java.sql.*;


public class JDBCDelete {

	public static void main(String[] args) {

		Connection con=null;
		Statement stmt=null;

		try {
			Driver ref=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(ref);

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opentext","j2ee","1234");

			stmt=con.createStatement();
			int n=stmt.executeUpdate("delete from department_info where dept_id=50");
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
