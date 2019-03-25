package com.pricingengine.read.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pricingengine.model.CyclePrice;
import com.pricingengine.model.CyclePriceResp;
import com.pricingengine.read.service.IPricingEngineReadService;
import com.pricingengine.read.serviceImpl.PricingEngineReadServiceImpl;

@RestController
public class PricingEngineReadController {
	
	  @Autowired
	 private IPricingEngineReadService service;

//	===============================Calculated Cycle  Price==========================================
	@RequestMapping(value="/cal/cycle/price", method=RequestMethod.POST)
	
	public ResponseEntity<CyclePriceResp> calCyclePrice(@RequestBody CyclePrice payload)throws Exception{
		
		CyclePriceResp cylPrice=new CyclePriceResp();
		
	     System.out.println("=========ClculateCyclePrice============");
		 
	     List<String> pricingEngineError = new ArrayList<String>();
	     
		   if(payload.getCycleId()==0){
			   
			   pricingEngineError.add("Cycle ID is empty");	
		   }
		   
		   try { 
				  
				 if(pricingEngineError.isEmpty()) {
					 
					 System.out.println(new ObjectMapper().writeValueAsString(payload));	
					PricingEngineReadServiceImpl serImpl=new PricingEngineReadServiceImpl();
						
					cylPrice.setCyclePrice(serImpl.calCyclePrice(payload));
				   }
				 else {
						Iterator<String> errorIter = pricingEngineError.iterator();
						System.out.println("Error faced while submitting please correct , then try again");
						
						while(errorIter.hasNext()){
							System.out.println("*"+errorIter.next());}	
				     }
				 
				 return new ResponseEntity<CyclePriceResp>(cylPrice, HttpStatus.OK);
				 
			   } catch (Exception x) {
				  x.printStackTrace();
				  System.out.println("print stack trace running..");
				  return new ResponseEntity<CyclePriceResp>(HttpStatus.INTERNAL_SERVER_ERROR);
				}
		  
	  }	
	
//	===============================Read Cycle component Price==========================================
	@RequestMapping(value="/read/cycle/component/price", method=RequestMethod.POST)
	
	public ResponseEntity<?> readCyclePrice()throws Exception{
		
		 
             try {
					
            	List<?> listCyclCompPrice =service.readCyclePrice();
            	 
					return new ResponseEntity<>(listCyclCompPrice,HttpStatus.OK);
				 
			   } catch (Exception x) {
				  x.printStackTrace();
				  System.out.println("print stack trace running..");
				  return new ResponseEntity<CyclePrice>(HttpStatus.INTERNAL_SERVER_ERROR);
				}
		  
	  }	
	
}
