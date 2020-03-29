package by.htp.les02.main;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 45;
int b = 45;

if(a + b < 180) {
	System.out.println ("Треуголькие существует");
	if (a == 90 || b == 90 || a + b == 90) {
		System.out.println ("Треугольник прямоугольный");
	}
	else { 
		System.out.println ("Треугольник не прямоугольный");
		}
}
else {	System.out.println("Треугольник не сущевствует ");
}
	}

}
