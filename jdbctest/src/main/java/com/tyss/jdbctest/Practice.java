package com.tyss.jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class Practice {

	public static void main(String[]args)
	{
		Connection con=null;
		PreparedStatement pstmt=null;

		Scanner sc=new Scanner(System.in);
		System.out.println("enter  department id:");
		int deptid=sc.nextInt();
		System.out.println("enter department name:");
		String name=sc.next();
		System.out.println("enter the department location:");
		String loc=sc.next();
		sc.close();


		try {
			Driver ref=new Driver();
			DriverManager.registerDriver(ref);

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306","j2ee","1234");
			pstmt=con.prepareStatement("insert into opentext.department_info values(?,?,?)");
			pstmt.setInt(1, deptid);
			pstmt.setString(2, name);
			pstmt.setString(3, loc);

			int m=pstmt.executeUpdate();

			System.out.println(m);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {

			try {
				if(con!=null)
					con.close();
				if(pstmt!=null)
					pstmt.close();


			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
