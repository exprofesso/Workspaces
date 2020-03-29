package by.htp.les02.main;

import java.util.Scanner;

public class Function1 {
	
	public static void main(String[] args) {
		
		//z=((a–3)*b/2)+c.
		
	int a;
	int b;
	int c;
	
	int z;
	System.out.println("z = ((a - 3) * b / 2) + c;");
	a = enterInt("Введите переменную А ");
	b = enterInt("Введите переменную В ");
	c = enterInt("Введите переменную С ");
	
	
	
	z = ((a - 3) * b / 2) + c;
	System.out.println("Z = "+z);


}
	public static int enterInt(String Message) {
	Scanner sc = new Scanner (System.in);
	System.out.println(Message);
	while (sc.hasNextInt() == false) {
		sc.next ();
		System.out.println(Message);
	}
	int v;
	v=sc.nextInt();
	return v;
	}
}
