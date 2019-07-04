package com.tyss.jdbctest;

import java.sql.*;
import java.util.Scanner;


public class UserEntry {

	public static void main(String[] args)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;

		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee id");
		int id=sc.nextInt();
		System.out.println("enter employee name");
		String name=sc.next();
		sc.close();
		try {
			Driver ref=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(ref);

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opentext","j2ee","1234");
			pstmt=con.prepareStatement("select * from emp_info where id=? and name=? ");
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
			}
			else
			{
				System.out.println("invalid id or name");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {

				if(con!=null)
					con.close();
				if(pstmt!=null)
					pstmt.close();
				if(rs!=null)
					rs.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
}
