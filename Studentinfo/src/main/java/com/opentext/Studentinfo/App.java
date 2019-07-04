package com.opentext.Studentinfo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.opentext.Studentinfo.dto.StudentInformation;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(StudentInformation.class);
        
        //new SchemaExport(cfg).create(true,true);
        
        
        StudentInformation st=new StudentInformation();
        st.setStudentid(156);
        st.setStudentname("rajesh");
        st.setStudentemail("rajesh123@gmail.com");
        st.setStudentphno(936313);
        
        SessionFactory factory=cfg.buildSessionFactory();
        Session s=factory.openSession();
        
        Transaction t=s.beginTransaction();
       
        s.save(st);
        t.commit();
        
        s.close();
       
    }
}
