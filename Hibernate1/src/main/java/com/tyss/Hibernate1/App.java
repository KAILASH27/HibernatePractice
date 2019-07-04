package com.tyss.Hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.Hibernate1.dto.Departmentinfo;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		
	
    Departmentinfo d=new Departmentinfo();
    d.setDept_id(60);
    d.setD_name("nontech");
    d.setLocation("Mumbai");
    
    Configuration cfg=new Configuration();
    cfg.configure("hibernate.cfg.xml");
    System.out.println("tyuil");
    
    SessionFactory factory=cfg.buildSessionFactory();
    Session s=factory.openSession();
    
    Transaction t=s.beginTransaction();
    s.save(d);
    t.commit();
    
    s.close();
}
}
