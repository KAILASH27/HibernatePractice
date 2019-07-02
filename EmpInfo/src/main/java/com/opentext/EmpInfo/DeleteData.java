package com.opentext.EmpInfo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opentext.EmpInfo.dto.EmployeeInfo;


public class DeleteData {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(EmployeeInfo.class);//in place of giving mapping in cfg.xml
        System.out.println("tyuil");
        
        SessionFactory factory=cfg.buildSessionFactory();
        Session s=factory.openSession();
        
        Transaction t=s.beginTransaction();
          EmployeeInfo ei=  (EmployeeInfo) s.get(EmployeeInfo.class, 462);
        s.delete(ei);
        t.commit();
        
        s.close();

	}

}
