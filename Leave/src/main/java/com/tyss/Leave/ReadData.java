package com.tyss.Leave;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.tyss.Leave.dto.Leaveinfo;

public class ReadData {

	public static void main(String[] args) {
		
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Leaveinfo.class);//in place of giving mapping in cfg.xml
        System.out.println("tyuil");
        
        SessionFactory factory=cfg.buildSessionFactory();
        Session s=factory.openSession();
        
        //Transaction t=s.beginTransaction();
       
        
        Leaveinfo l=(Leaveinfo)s.load(Leaveinfo.class,12);
        System.out.println(l.getDays());
        System.out.println(l.getDescription());
        System.out.println(l.getLeavetype());
        //t.commit();
        
        s.close();

	}

}
