package com.bhargavi;
import java.util.Date;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  
  
 
public class DemoClass {
	
	public static void main(String[] args) {  
	      
	    //creating configuration object  
		
	    Configuration cfg = new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	      
	    SessionFactory factory = cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction transaction = session.beginTransaction();  
	          
	    UserDetails userDetails = new UserDetails();  
	    
	    Date date = new Date();
	    userDetails.setUserName("Bhargavi");  
	    userDetails.setJoinDate("2015-8-25");
	    userDetails.setAddress("Manjalpur");
	    userDetails.setDescription("computer science");
	    
	      
	    session.persist(userDetails);//persisting the object  
	      
	    transaction.commit();//transaction is committed  
	    session.close();  
	      
	    System.out.println("Data successfully inserted.");  
	      
	}  
	
}

