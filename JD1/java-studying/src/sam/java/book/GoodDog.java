package sam.java.book;

public class GoodDog {
	public int size;
	public void setSize(int s) {
		size = s;
	}
	public int getSize () {
		return size;
	}
	
	public void bike () {
		if(size > 70) {
			System.out.println("Gav Gav");
		}
		else if (size > 20) {
			System.out.println("Wuf Wuf");
		}
		else {
			System.out.println("Miau Miau");
		}
	}
	
	
	
}
