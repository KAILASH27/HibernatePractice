package com.tyss.Leave;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.Leave.dto.Leaveinfo;

public class UpdateData {

	public static void main(String[] args) {
		Leaveinfo l=new Leaveinfo();
        l.setDays(1);
        l.setLeavetype(" leave");
        l.setDescription("health");
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Leaveinfo.class);//in place of giving mapping in cfg.xml
        System.out.println("tyuil");
        
        SessionFactory factory=cfg.buildSessionFactory();
        Session s=factory.openSession();
        
        Transaction t=s.beginTransaction();
       
        s.update(l);
        t.commit();
        
        s.close();

	}

}
