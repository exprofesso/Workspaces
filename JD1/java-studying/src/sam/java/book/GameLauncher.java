package sam.java.book;

public class GameLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GuessGame game = new GuessGame ();
			game.startGame();
		
		Player ser = new Player ();
		
		ser.guess();
		
		
	}

}
