package com.nt.service;

public class BankLoanServices {
	
	public float getInterest(float pAmt,float rate,float time) {
		
		return (float) (pAmt*Math.pow((1+rate/100), time))-pAmt;
	}

}
