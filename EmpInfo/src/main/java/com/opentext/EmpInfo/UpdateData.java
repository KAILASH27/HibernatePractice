package com.opentext.EmpInfo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opentext.EmpInfo.dto.EmployeeInfo;

public class UpdateData {

	public static void main(String[] args) {
		EmployeeInfo ei=new EmployeeInfo();
		ei.setId(462);
		ei.setName("Rajesh");
		ei.setAge(25);
		ei.setGender("Male");
		ei.setPhoneNo(9566863);
		ei.setEmailid("rajesh@gmail.com");
		ei.setDesignation("Testing");
		ei.setSalary(23000);
		ei.setMgrid(793);
		ei.setDeptid(20);
		ei.setDob("1995-05-15");

		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeInfo.class);//in place of giving mapping in cfg.xml
		System.out.println("tyuil");

		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();

		Transaction t=s.beginTransaction();

		s.update(ei);
		t.commit();

		s.close();

	}

}
