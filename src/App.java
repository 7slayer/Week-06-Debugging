import java.util.Scanner;

public class App {

	public static void main(String args[]) {
		
		//creating the deck and prompting input for the player names
		Deck playDeck = new Deck();
		Scanner in = new Scanner(System.in);
		Card player1Flip;
		Card player2Flip;
		
		System.out.print("Player 1's name: ");
		Player player1 = new Player(in.next());
		System.out.print("Player 2's name: ");
		Player player2 = new Player(in.next());
		//Shuffling the play deck
		playDeck.shuffle();
		
		//drawing all cards form the playDeck going back and forth between the two players
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(playDeck);
			} else {
				player2.draw(playDeck);
			}
		}
		/*
		 * Code I made but then changed to the for loop above
		for(int i = 0; i <= 26; i++) {
			player1.draw(playDeck);
		}
		
		for(int i = 0; i <= 26; i++) {
			player2.draw(playDeck);
		}
		*/
		//cycles through all the cards in a players hand and compares the value of the fliped cards
		for (int i = 0; i < 26; i++) {
			
			player1Flip = player1.flip();
			System.out.print(player1.getName() + " has drawn: ");
			player1Flip.describe();
			
			player2Flip = player2.flip();
			System.out.print(player2.getName() + " has drawn: ");
			player2Flip.describe();
			
			
			if (player1Flip.getValue() > player2Flip.getValue()) {
				player1.incrementScore();
				System.out.println(player1.getName() + " Wins this round");
			} else {
				player2.incrementScore();
				System.out.println(player2.getName() + " Wins this round");
			}
			
			System.out.println(player1.getName() + " score is " + player1.getScore());
			System.out.println(player2.getName() + " score is " + player2.getScore());
			
			System.out.println();
			
		}
		//Displays the final scores of each player
		System.out.println(player1.getName() + " has a score of: " + player1.getScore());
		System.out.println(player2.getName() + " has a score of: " + player2.getScore());
		
		//Displays a messaged based on the final score
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " wins this game");
		} else if(player1.getScore() < player2.getScore()) {
			System.out.println(player2.getName() + " wins this game");
		} else {
			System.out.println("Draw");
		}
		in.close();
	}
}
