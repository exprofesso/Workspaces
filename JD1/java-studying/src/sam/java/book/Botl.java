package sam.java.book;

public class Botl {

	public static void main(String[] args) {
		int beerNum = 99;
		String word = "бутылок";
		
		while (beerNum > 0) {
			
			if (beerNum == 1) {
				word = "бутылка";
			}
			
			System.out.println (beerNum + " " + word + " Пиво на стене");
			System.out.println ("Пусти по кругу.");
			beerNum--;
			if (beerNum > 0) {
				System.out.println (beerNum + " " + word + " Пиво на стене");	
			} else {
				System.out.println ("Нет бутылок пива на стене");
			}
		}
	}
}
