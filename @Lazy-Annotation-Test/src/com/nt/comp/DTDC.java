package com.nt.comp;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dtdc")
//@Lazy()
//@Scope("prototype")
public class DTDC implements Courier {
	public DTDC() {
		System.out.println("DTDC 0-param");
	}
@Override
public String deliver(int id) {
	return " DTDC will deliver your product and the id is::"+id;
}
}
