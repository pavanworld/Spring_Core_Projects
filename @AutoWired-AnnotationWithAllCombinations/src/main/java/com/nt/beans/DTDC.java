package com.nt.beans;

public class DTDC implements Courier {
@Override
public String deliver(int id) {
	System.out.println("DTDC.deliver()");
	return " DTDC will deliver your product and the id is::"+id;
}
}
