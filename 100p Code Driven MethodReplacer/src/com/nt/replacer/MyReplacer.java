package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;
@Component("replacer")
public class MyReplacer implements MethodReplacer{

	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		float pAmt;
		float rate;
		float time;
		pAmt=(float) arg2[0];
		rate=(float) arg2[1];
		time=(float) arg2[2];
		
		
		return (pAmt*rate*time)/100.0f;
	}
	
	
	
	

}
