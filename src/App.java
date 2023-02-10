import java.util.Scanner;

public class App {

	public static void main(String args[]) {
		
		Deck playDeck = new Deck();
		Scanner in = new Scanner(System.in);
		
		System.out.print("Player 1's name: ");
		Player player1 = new Player(in.next());
		System.out.println("Player 2's name: ");
		Player player2 = new Player(in.next());
		
		playDeck.shuffle();
		
		for(int i = 0; i <= 26; i++) {
			player1.draw(playDeck);
		}
		
		for(int i = 0; i <= 26; i++) {
			player2.draw(playDeck);
		}
		
		in.close();
	}
}
