package com.pricingengine.wirte.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.pricingengine.model.CyclePrice;
import com.pricingengine.write.dao.IPricingEngineMgtDao;

@Repository
@Transactional
public class PricingEngineMgtDaoImpl implements IPricingEngineMgtDao{
	
	  
//      InCase of Hibernate Configuration
	    @Autowired
	    private SessionFactory sessionFactory;
	    
	    
        // An EntityManager will be automatically injected from entityManagerFactory
	    // setup on DatabaseConfig class.
	    
	    @PersistenceContext
	    private EntityManager entityManager;
	    
	    

	    private Session getSession() {
	        return sessionFactory.getCurrentSession();
	    }
	    
	public String updateCycleComponentPrice(CyclePrice cyclPrice) {
		
		Long isSuccess = (Long)getSession().save(cyclPrice);
        if(isSuccess >= 1){
            return "Success";
        }else{
            return "Error while Saving Person";
        }	
	}
}
