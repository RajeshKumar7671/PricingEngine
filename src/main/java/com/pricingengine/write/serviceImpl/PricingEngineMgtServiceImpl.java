package com.pricingengine.write.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pricingengine.model.CyclePrice;
import com.pricingengine.write.dao.IPricingEngineMgtDao;
import com.pricingengine.write.service.IPricingEngineMgtService;

public class PricingEngineMgtServiceImpl implements IPricingEngineMgtService{

	@Autowired
	private IPricingEngineMgtDao dao;
	@Override
	public void updateCycleComponentPrice(CyclePrice cyclPrice) {
		
		try {
			System.out.println(new ObjectMapper().writeValueAsString(cyclPrice));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		dao.updateCycleComponentPrice(cyclPrice);
		
	}

}
