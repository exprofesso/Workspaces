package com.youtube.evilnerd;

import java.util.Random;

public class MathSimple {

	public static void main(String[] args) {
		
		double max1 = 6.453;
		double max2 = 6.45226;
		Random roulette = new Random ();
		
		System.out.println(Math.ceil(2.1)); // увеличивает к максимальному числу
		System.out.println(Math.floor(2.9)); // округляет в меньшую сторону
		System.out.println (Math.max(max1, max2)); // выбирает максимальное число
		System.out.println(Math.min(max1, max2)); // выбирает минимальное число
		System.out.println(Math.pow(max1, max2)); // возвредение в степень 
		for (int x = 1; x <= 10; x++) {
			System.out.println(roulette.nextInt(32)); // рондомная руллетка от 0 до 32
		}
		int massiv [] = new int[33];
		for (int x = 0; x < 1000; x++) {
			++massiv[roulette.nextInt(33)];
		}
		System.out.println("Номер\tЧисло");
		for (int x = 0; x < massiv.length; x++) {
		System.out.println(x + "\t" + massiv[x]);
		}
		System.out.print("Отличный результат за сегодня!");
	}

}
