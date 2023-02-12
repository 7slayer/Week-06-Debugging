import java.util.ArrayList;
import java.util.List;

public class Player {
	//Create a list of the newly created Card class to store the players hand
	private List<Card> hand = new ArrayList<Card>();
	//Creates the score variable to keep track of player score
	private int score;
	private String name;
	
	public Player(String name) {
		//Defines the constructor of the Player class by setting the name to the passed value and the score to zero
		setName(name);
		setScore(0);
	}

	public int getScore() {
		return score;
	}

	private void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}
	//This will take a Card from the passed Deck and add it to the players hand
	public void draw(Deck deckToDraw) {
		hand.add(deckToDraw.draw());
	}
	//This will remove the card in the players hand Array List and return the removed card
	public Card flip() {
		Card cardInHand = hand.get(0);
		hand.remove(0);
		return cardInHand;
	}
	//Adds one point to the players score
	public void incrementScore() {
		setScore(getScore() + 1);
	}
}
