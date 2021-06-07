package com.hiber.examples;

import java.util.List;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  

import javax.persistence.Query;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = HibernateUtil.getSessionFactory(); 
    	Session session = factory.openSession();  
    	Transaction t = session.beginTransaction(); 
    	
    	Icaurushub u=new Icaurushub();
    	u.setName("noida");
    	Trainer s=new Trainer();
    	s.setName("juno");
    	s.setDept("devops");
    	s.setFees(60000);
    	SeniorEmployee st=new SeniorEmployee();
    	st.setName("VP");
    	st.setAge(30);
    	st.setSalary(70000);
    	
   
   	session.persist(u);
    	session.persist(s);
    	session.persist(st);
    	
    	
    	t.commit();  
    	factory.close();  
        session.close();  

	}

}
