package com.hiber.examples;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;





public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = HibernateUtil.getSessionFactory(); 
    	Session session = factory.openSession();  
    	Transaction t = session.beginTransaction(); 
    	
    	product st=new product(103,"rogphone5","god",79000);
    	Integer i=(Integer) session.save(st);
    	System.out.println(i);

          Query q1=session.createQuery("update product set price=:n where id=:i");
         q1.setParameter("n", "90000");
          q1.setParameter("i", 101);
          int status=q1.executeUpdate();
          
 
 
          Query q3=session.createQuery("select max(price) from product");
          List<Integer>list=q3.getResultList();
          System.out.println(list);
          
        /*  //max
          Query q4=session.createQuery("select sum(marks) from Student");
          List<Integer>list1=q4.getResultList();
          System.out.println(list1);
          
          
          */
          
    	
    	 t.commit();  
    	factory.close();  
        session.close();  

	}

}
