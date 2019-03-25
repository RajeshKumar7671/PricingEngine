package com.pricingengne.write.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.pricingengine.model.CyclePrice;
import com.pricingengine.write.serviceImpl.PricingEngineMgtServiceImpl;

@RestController
public class PricingEngineMgtController {
	
    Gson gson=new Gson();
	
//	===============================Update Cycle Component Price==========================================
	@RequestMapping(value="/cycle/component/price", method=RequestMethod.POST)
	
	public ResponseEntity<?> updateCycleComponentPrice(@RequestBody CyclePrice payload, BindingResult bindingResult)throws Exception{
		
	     System.out.println("=========updateCycleComponetPrice============");
		
		ResponseEntity<String> responseResult = new ResponseEntity<String>("Good", HttpStatus.OK);
		
		if(bindingResult.hasErrors()) {
			responseResult=new ResponseEntity<String>("Oops Binding Issues",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		else {
			System.out.println(new ObjectMapper().writeValueAsString(payload));	
			
			PricingEngineMgtServiceImpl serImpl=new PricingEngineMgtServiceImpl();
			
			serImpl.updateCycleComponentPrice(payload);
		 }
		return responseResult;
	  }
	
}
