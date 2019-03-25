package com.pricingengine.read.service;

import java.util.List;

import com.pricingengine.model.CyclePrice;

public interface IPricingEngineReadService {
	
	public List<?> readCyclePrice();
	
	public double calCyclePrice(CyclePrice cyclPrice);

}
