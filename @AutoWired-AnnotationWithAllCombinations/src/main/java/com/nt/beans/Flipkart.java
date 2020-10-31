package com.nt.beans;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Flipkart {
	private Courier courier;
	private Date date;
	/*
	 * @Autowired()
	 * 
	 * @Qualifier("flightFry") private Courier courier;
	 * 
	 * @Autowired()
	 * 
	 * @Qualifier("flightFry") public void setCourier(Courier courier){
	 * System.out.println("Flipkart.setCourier()"); this.courier=courier; }
	 * 
	 * @Autowired()
	 * 
	 * @Qualifier("dtdc") public void assign(Courier courier){
	 * System.out.println("Flipkart.assign()"); this.courier=courier; }
	 * 
	 * @Autowired() public Flipkart(@Qualifier("bDart")Courier courier) {
	 * System.out.println("Flipkart.1-param()"); this.courier=courier;
	 * 
	 * }
	 */
	@Autowired(required=false) 
	public Flipkart(@Qualifier("bDart")Courier courier) 
	{
		System.out.println("Flipkart Courier 1-param()"); 
		this.courier=courier;
		
	}
	
	@Autowired(required=false) 
	public Flipkart(Date date) 
	{
		System.out.println("Flipkart Date 1-param()"); 
		
		this.date=date;
	}
	
	@Autowired(required=false) 
	public Flipkart() 
	{
		System.out.println("Flipkart.0-param()"); 
		
	}
	
	
	public String order(String[] items,float[] prices) {
		
		float bal=0.0f;
		
		for(float f:prices) {
				bal=bal+f;
			
		}
		String msg= courier.deliver(new Random().nextInt(100000000));
		System.out.println(date);
		return "Your Selected Products are "+Arrays.toString(items)+ "Having Prices "+Arrays.toString(prices)+" Total Bill Amount is ::"+bal+" "+msg;
		
		
	}

	
}
