package com.tyss.jdbctest;

import java.sql.*;
import com.mysql.jdbc.Driver;
public class JDBCProgram {
	public static void main(String[] args) {

		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;


		try {
			Driver ref=new Driver();
			DriverManager.registerDriver(ref);


			con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/opentext","j2ee","1234");

			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from emp_info");

			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  

		}
		catch(Exception e){

			System.out.println(e);
		}
		finally {
			try {

				if(con!=null) {
					con.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}


	}
}
