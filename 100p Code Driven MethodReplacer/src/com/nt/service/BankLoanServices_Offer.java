package com.nt.service;

public class BankLoanServices_Offer extends BankLoanServices{
	
	public float getInterest(float pAmt,float rate,float time) {
		
		return (float) pAmt*time*rate/100.0f+200;
	}

}
