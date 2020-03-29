package by.htp.les02.main;

import java.util.Scanner;

public class Task3 {
	
	public static void main(String[] args) {
		double x;
		double y;
		double z;	
		
		//𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦 ∗ 𝑡𝑔 𝑥𝑦 
		//𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦
		x = angle ("Введите значение X");
		y = angle ( "Введите значение Y");
		z = (Math.sin(x)+Math.cos(y) / (Math.cos(x) - Math.sin(y))) * (Math.tan(x) * Math.tan(y));
		System.out.printf("%.4f\n",z);
	}
	
	
	public static int angle (String Message) {
		Scanner sc = new Scanner (System.in);
		System.out.println(Message);
		while (sc.hasNextInt() == false) {
			sc.next ();
			System.out.println(Message);
		}	
		int w;
		w = sc.nextInt();
		return w;
	}
}
