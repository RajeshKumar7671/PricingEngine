package com.pricingengine.read.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.pricingengine.read.dao.IPricingEngineReadDao;

public class PricingEngineReadDaoImpl implements IPricingEngineReadDao {
	
	     @Autowired
	    private SessionFactory sessionFactory;

	    private Session getSession() {
	        return sessionFactory.getCurrentSession();
	    }

	   @Override
	   public List<?> readCycleComponentPrice() {
		   return getSession().createQuery("from Person").list();
	   }
		
}
