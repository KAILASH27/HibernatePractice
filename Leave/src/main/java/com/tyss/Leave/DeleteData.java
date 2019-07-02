package com.tyss.Leave;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.Leave.dto.Leaveinfo;

public class DeleteData {

	public static void main(String[] args) {
		
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Leaveinfo.class);//in place of giving mapping in cfg.xml
        System.out.println("tyuil");
        
        SessionFactory factory=cfg.buildSessionFactory();
        Session s=factory.openSession();
        
        Transaction t=s.beginTransaction();
          Leaveinfo l=  (Leaveinfo) s.get(Leaveinfo.class, 0);
        s.delete(l);
        t.commit();
        
        s.close();

	}

}
