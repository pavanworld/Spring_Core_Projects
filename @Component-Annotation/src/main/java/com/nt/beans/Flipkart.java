package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component()
public class Flipkart {
	@Autowired()
	@Qualifier("DTDC")
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart 0-param");
	}
	public String order(String[] items,float[] prices) {
		
		float bal=0.0f;
		
		for(float f:prices) {
				bal=bal+f;
			
		}
		String msg= courier.deliver(new Random().nextInt(100000000));
		
		return "Your Selected Products are "+Arrays.toString(items)+ "Having Prices "+Arrays.toString(prices)+" Total Bill Amount is ::"+bal+" "+msg;
		
		
	}

	
}
