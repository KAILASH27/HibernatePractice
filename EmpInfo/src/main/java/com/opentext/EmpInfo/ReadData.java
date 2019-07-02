package com.opentext.EmpInfo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.opentext.EmpInfo.dto.EmployeeInfo;


public class ReadData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(EmployeeInfo.class);//in place of giving mapping in cfg.xml
        System.out.println("tyuil");
        
        SessionFactory factory=cfg.buildSessionFactory();
        Session s=factory.openSession();
        
        //Transaction t=s.beginTransaction();
       
        
        EmployeeInfo ei=(EmployeeInfo)s.load(EmployeeInfo.class,123);
        System.out.println(ei.getId());
        System.out.println(ei.getName());
        System.out.println(ei.getPhoneNo());
        System.out.println(ei.getAge());
        System.out.println(ei.getGender());
        System.out.println(ei.getEmailid());
	}

}
