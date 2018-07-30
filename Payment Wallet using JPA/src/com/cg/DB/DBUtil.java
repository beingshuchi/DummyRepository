package com.cg.DB;





import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.exception.AccountException;

public class DBUtil {
	
	public static EntityManager getConnection() throws AccountException{
		
		
			EntityManagerFactory fact= Persistence.createEntityManagerFactory("JPA-PU");
			return fact.createEntityManager();
			
		
	}
	
}
