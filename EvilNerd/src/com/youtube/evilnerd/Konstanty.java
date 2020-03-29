package com.youtube.evilnerd;
public enum Konstanty {
	Any ("марсианка", "секси"),
	Fry("тупой","ленивый"),
	Rick ("алкоголик", "гений");

	private final String desc1;
	 private final String desc2;
	
	 
	Konstanty(String d1, String d2){
		desc1 = d1;
		desc2 = d2;
	}
	public String getDeck1 () {
		return desc1;
	}
	public String getDeck2 () {
		return desc2;
	}
}
