package sam.java.book;

public class GuessGame {

	Player p1;
	Player p2;
	Player p3;
	
	public void startGame () {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
	
		int p1num = 0;
		int p2num = 0;
		int p3num = 0;
		
		boolean p1Rigth = false;
		boolean p2Rigth = false;
		boolean p3Rigth = false;
		int answer = (int) (Math.random() * 20+1);
		System.out.println(" Загадал число от 1 до 10 "); 
		while (true) {
			System.out.println("Правильное число " + answer);
		p1.guess();
		p2.guess();
		p3.guess();
		
		
		p1num = p1.number;
		System.out.println("Первый игрок думает, что это " + p1num);
		p2num = p2.number;
		System.out.println("Второй игрок думает, что это " + p2num);
		p3num = p3.number;
		System.out.println("Третий игрок думает, что это " + p3num);
		
		if (p1num == answer) {
			p1Rigth = true;
		}
		if (p2num == answer) {
			p2Rigth = true;
		}
		if (p3num == answer) {
			p3Rigth = true;
		}
		if (p1Rigth || p2Rigth || p3Rigth) {
			System.out.println("У нас есть победитель! ");
			System.out.println("Первый игрок угадал? " + p1Rigth);
			System.out.println("Второй  игрок угадал? " + p2Rigth);
			System.out.println("Третий  игрок угадал? " + p3Rigth);
			break;
		} else {
			System.out.print("Игроки должны попробовать еще раз ");
		}
	}
}
	
}
