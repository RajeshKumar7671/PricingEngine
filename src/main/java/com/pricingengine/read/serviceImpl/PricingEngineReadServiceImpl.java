package com.pricingengine.read.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricingengine.model.CyclePrice;
import com.pricingengine.read.dao.IPricingEngineReadDao;
import com.pricingengine.read.service.IPricingEngineReadService;

@Service
public class PricingEngineReadServiceImpl implements IPricingEngineReadService{

	@Autowired
	private IPricingEngineReadDao dao;

	@Override
	public double calCyclePrice(CyclePrice cyclPrice) {
		
		double cylPrice=0.0;
		double whPrice=0.0;
		 
		     whPrice=cyclPrice.wheels.getRim()+cyclPrice.wheels.getSpoke()+cyclPrice.wheels.getTube()+cyclPrice.wheels.getTyre();
	    	
  cylPrice=cyclPrice.getFrame()+cyclPrice.getHandlebar_with_break()+cyclPrice.getChain_assembly()+cyclPrice.getSeating()+whPrice*cyclPrice.getNo_of_wheels();
		
	    	return cylPrice;
	}

	@Override
	public List<?> readCyclePrice() {
		
		return dao.readCycleComponentPrice();
	}

}
