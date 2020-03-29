package com.youtube.evilnerd;

public class time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rick bd = new Rick (16,1,1944);
		
		Fry NameBD = new Fry ("Rick", bd);
		System.out.println (NameBD);
		
		for(Konstanty her: Konstanty.values())
		System.out.printf ("%s - %s and %s\n", her, her.getDeck1(), her.getDeck2());
		
		military time = new military ();
		time.setTime(23, 55, 23);
			System.out.println(time.toMilisry());
			System.out.println (time.toNormal());
			}


}

   