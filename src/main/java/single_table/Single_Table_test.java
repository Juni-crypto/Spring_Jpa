package single_table;

import java.util.List;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  

import javax.persistence.Query;



public class Single_Table_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = HibernateUtil_singletable.getSessionFactory(); 
    	Session session = factory.openSession();  
    	Transaction t = session.beginTransaction(); 
    	
    	Makers st=new Makers();
    	//st.setId(1);
    	st.setName("Cody");
    	Sde_Team st2=new Sde_Team();
    	st2.setName("Anju");
    	st2.setNos(5);
    	st2.setSps(50);
    	Hde_Team st3=new Hde_Team();
    	st3.setName("Mono");
    	st3.setNoOfStaff(10);
    	st3.setTotalst(100);
   
    	session.persist(st);
    	session.persist(st2);
    	session.persist(st3);
    	
    	
    	t.commit();  
    	factory.close();  
        session.close();  

	}

}
