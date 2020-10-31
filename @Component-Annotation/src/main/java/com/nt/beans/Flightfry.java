package com.nt.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component()
//@Primary
public class Flightfry implements Courier {
	public Flightfry() {
		System.out.println("Flightfry 0-param");
	}
@Override
public String deliver(int id) {
	return " Flight Fry will deliver your product and the id is::"+id;
}
}
