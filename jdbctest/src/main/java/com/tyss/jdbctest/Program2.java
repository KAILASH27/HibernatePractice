package com.tyss.jdbctest;
import java.sql.*;


public class Program2 {

	public static void main(String[] args) {

		Connection con=null;
		Statement stmt=null;

		try {
			Driver ref=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(ref);

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opentext","j2ee","1234");

			stmt=con.createStatement();
			int m=stmt.executeUpdate("insert into department_info values(50,'technical support','Bangalore')");
			System.out.println(m);

		}  
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try
			{
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
