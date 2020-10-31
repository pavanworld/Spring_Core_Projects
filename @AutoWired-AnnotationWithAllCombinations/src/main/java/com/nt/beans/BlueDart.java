package com.nt.beans;

public class BlueDart implements Courier {
@Override
public String deliver(int id) {
	System.out.println("BlueDart.deliver()");
	return " BlueDart will deliver your product and the id is::"+id;
}
}
