package by.htp.les02.main;

import java.util.Scanner;

public class Task2 {
	
	
	public static void main(String[] args) {
		
		// 𝑏+√𝑏2 +4𝑎𝑐−𝑎3𝑐+𝑏−2 
		//  2𝑎
		int a;
		//double a2;
		int b;
		int c;
		//double b2;
		//double b3;
		//double b4;
		//double d;
		//double g;
		double z;
		
		/*b2 = Math.pow(b, 2); //𝑏2
		d = 4 * a * c; // 4𝑎𝑐
		b2 = b2 + d; //𝑏2 +4𝑎𝑐
		b3 = Math.sqrt(b2) + b; // sqrt + b
		g = b3 / (2*a);
		a2 = Math.pow(a, 3) * c;
		b4 = Math.pow(b, -2);
		z = g - a2 + b4; */
		System.out.println("𝑏+√𝑏2 +4𝑎𝑐−𝑎3𝑐+𝑏−2");
		a = calculat ("Введите число А");
		b = calculat ("Введите число В");
		c = calculat ("Введите число С");
		z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - (Math.pow(a, 3)*c) + (Math.pow(b, -2));
			
		System.out.printf("%.3f", z);
	
	}
	
	public static int calculat(String Message) {
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
