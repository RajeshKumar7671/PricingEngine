package com.pricingengine.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.pricingengine" })
public class PricingEngineServer 
{
    public static void main( String[] args )
    {
    	try {
			SpringApplication.run(PricingEngineServer.class, args);		
		}catch(Exception x) {
			x.printStackTrace();
			System.out.println("Drive Server Startup Error.........");	
		}    }
}
