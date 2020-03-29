package com.youtube.evilnerd;

public class military {
	private int hour;
	private int mimunte;
	private int second;
	 
	public void setTime(int h, int m, int s) {
		hour = 	((h > 0) && (h < 24) ? h : 0);
		mimunte = ((m > 0) && (m < 60) ? m : 0);
		second = ((s > 0) && (s < 60) ? s : 0);
	} 
	
	 public String toMilisry() {
		 return String.format("%02d:%02d:%02d", hour, mimunte, second);
	 }
	 
	 // форматированая строка
	 public String toNormal() {
		 return String.format("%d:%02d:%02d %s",((hour == 0 || hour == 12) ? 12 : hour % 12), mimunte, second, (hour < 12?"AM" : "PM"));
	 }
}
