package sam.java.book;


public class GoodGogTestDrive extends GoodDog{

	public static void main(String[] args) {
		GoodDog one = new GoodDog ();
		GoodDog two = new GoodDog ();
		GoodDog three = new GoodDog ();
		GoodDog four = new GoodDog ();
		one.setSize(80);
		two.setSize(19);
		three.setSize(5);
		four.setSize(100);
	System.out.println ("1 ! " + one.getSize());
	System.out.println ("2 ! " + two.getSize());
	System.out.println ("3 ! " + three.getSize());
	System.out.println ("4 ! " + four.getSize());
	one.bike();
	two.bike();
	three.bike();
	four.bike();
	
	}
}