package com.youtube.evilnerd;

public class Fry {
	private String name;
	private Rick bd;
	
	
	public Fry(String n,  Rick bday) {
		name = n;
		bd = bday;
	}
	public String toString() {
		return String.format("My name is %s, I was born - %s@!!!", name, bd);
	}

}
