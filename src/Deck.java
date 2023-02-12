import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//Instantiates the suits array list that will be used to describe the card
	private List<String> suits = new ArrayList<String>();
	//This is the ArrayList that will be used to store the Card class
	private List<Card> card = new ArrayList<Card>();
	
	public Deck() {
		//Sets the values of all the suits within a deck
		suits.add("Clubs");
		suits.add("Spades");
		suits.add("Diamonds");
		suits.add("Hearts");
		
		//cycles though the suits array list and creates 13 cards for each suit
		for (int i = 0; i < 4; i++) {
			for (int value = 2; value <= 14; value++) {
				card.add(new Card(value, suits.get(i)));
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(card);
	}
	
	public Card draw() {
		//Returns the value of the first card within the deck and removes it
		Card drawnCard = card.get(0);
		card.remove(0);
		return drawnCard;
		
	}
}
