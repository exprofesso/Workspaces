package com.youtube.evilnerd;

public class Lisa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double vklad = 1000;
		double procent = 0.04;
		for (int year = 1; year <=1; year++) {
			vklad += vklad * procent;
			System.out.println("За " + year + " лет Ваш вклад составит " + vklad + " долларов");
			
			System.out.println(av(23,54,3876,-432,-543,43,3));
			
		}
	}
// метод с переменным колличеством аргументов
	public static int av (int...num) {
		int sum = 0;
		for(int i:num) {
			sum+=i;
		}
		return sum/num.length;
	}
}
