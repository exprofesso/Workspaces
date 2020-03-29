package by.htp.les02.main;

import java.util.Scanner;

public class Task6 {
public static void main (String [] args) {
	
	Scanner sc = new Scanner (System.in);
System.out.println("Enter two numbers");
	int x;
	int y;
	x=sc.nextInt();
	y=sc.nextInt();
	while ((x > 2 || y > 4) || (x > 4 || y < -3)|| (x > 4 || y < -3)||(x<-4||y<-3)||(x<-2||y>4)){
System.out.println ("Need again ");
x=sc.nextInt();
y=sc.nextInt();
	}
	System.out.println("Very good");
}
}