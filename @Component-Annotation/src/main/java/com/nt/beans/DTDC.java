package com.nt.beans;

import org.springframework.stereotype.Component;

@Component()
public class DTDC implements Courier {
	public DTDC() {
		System.out.println("DTDC 0-param");
	}
@Override
public String deliver(int id) {
	return " DTDC will deliver your product and the id is::"+id;
}
}
