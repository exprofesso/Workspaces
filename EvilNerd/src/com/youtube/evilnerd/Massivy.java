package com.youtube.evilnerd;

public class Massivy {
	public static void main (String[] args) {
	String heroes [] = new String [5];
	heroes[0] = "Бендер";
	heroes[1] = "Барт";
	heroes[2] = "Морти";
	heroes[3] = "Рик";
	heroes[4] = "Лиза";
	for(int x = 0; x < 5; x++) {	
	System.out.println(heroes[x]);
		}
	
	// инициализация массива
	
	int number [] = {4, 3, 5, 7, 78, 5475,22,0,7};
	int summa = 0;
	for ( int z = 0; z < number.length; z++) {
		summa += number [z];
		System.out.println(number [z]);
	}
	System.out.println(summa);

	System.out.println("Позиция\tЗначение");
	int b =1;
	String animals[] = {"еж", "лиса", "волк", "медведь", "сова", "клиент"};
	for (int i = 0; i < animals.length; i++) {
		System.out.println(b + "\t" + animals[i]);
		b++;
	}
	int Beer [] = {1, 2, 3, 5, 8, 18, 3, 2};
	int sum = 0;
	
	// расширенный цикл for
	for (int i:Beer) {
		sum+=i;
	}
	System.out.println(sum);

	String animal[] = {"еж", "лиса", "волк", "медведь", "сова", "клиент"};
	String text = "";
	for (String i:animal) {
		text+=i;
	}
	System.out.println (text);
	
// Многомерный массив
	int massiv [][] = {{1,45,23,654,1,23},{435,4356,22,6,887,2}};
	int massiv1 [][] = {{3,325,34,764,13,4},{263234589},{1,2,3,4,5,6,7,8,9}};
	System.out.println(massiv1 [2][5]);
	// вывод метода многомерного массива 
	massiv(massiv1);
	
	
	// Массивы в методах	

	title(heroes);
	for(String i: heroes) {
		System.out.println (i);	
	}
	// многомерный массив и вывод таблицы умножения
	int [][] TabUm = new int [10][10];
	
	for(int i = 0; i < 10; i++) {
		for (int z = 0; z < 10; z++) {
			TabUm [i][z] = (i+1) * (z+1);
			System.out.printf("%4d", TabUm[i][z]);			
		}
		System.out.println ();
	}
	
	}
	public static void title(String t[]) {
	for (int i = 0; i < t.length; i++) {
		t[i] += " - тот еще герой";
	}
	}
	// метод для многомерного массива
	public static void massiv (int m[][]) {
		for(int i = 0; i < m.length; i++){
			for(int x = 0; x < m[i].length; x++) {
				System.out.print(m[i][x] + "\t");
			}
			System.out.println();
		}
	}
	
}

