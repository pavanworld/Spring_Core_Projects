package com.nt.beans;

public class Flightfry implements Courier {
@Override
public String deliver(int id) {
	return " Flight Fry will deliver your product and the id is::"+id;
}
}
