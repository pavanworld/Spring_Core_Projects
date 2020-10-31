package com.nt.comp;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("flightFry")
@Lazy()
public class Flightfry implements Courier {
	public Flightfry() {
		System.out.println("FlightFry 0-param");
	}
@Override
public String deliver(int id) {
	return " Flight Fry will deliver your product and the id is::"+id;
}
}
