package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Flipkart {
	@Autowired(required = true)
	//@Qualifier("fly")
	//@Qualifier("flightFry")
	private Courier courier;
	
	
	public String order(String[] items,float[] prices) {
		
		float bal=0.0f;
		
		for(float f:prices) {
				bal=bal+f;
			
		}
		String msg= courier.deliver(new Random().nextInt(100000000));
		
		return "Your Selected Products are "+Arrays.toString(items)+ "Having Prices "+Arrays.toString(prices)+" Total Bill Amount is ::"+bal+" "+msg;
		
		
	}

	
}
