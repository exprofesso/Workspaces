package by.htp.les02.main;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		long t;
		
		Scanner time = new Scanner (System.in);
		System.out.println("Введите кол-во секунд");
		t = time.nextLong();
		long hour = t / 3600;
		long min = t / 60%60;
		long sec = t / 1%60;
		System.out.print (t+" секунд равно ");
		System.out.printf("%02d:%02d:%02d", hour, min, sec);
		System.out.print(" часов, минут и секунд:");
		
	}

	
    }