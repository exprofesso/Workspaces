package sam.java.book;

public class XCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int orig = 42;
			XCopy x = new XCopy();
		int y = x.go(55);
			System.out.println(orig + " "+ y);
		int z = x.calcul(88, 88);
			System.out.print(z);
		}
		int go (int arg) {
			arg = arg*2;
			return arg;
		}
	
		int calcul (int her, int wid) {
			return her*wid;
		}

}
