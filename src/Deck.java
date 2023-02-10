import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<String> suits = new ArrayList<String>();
	private List<Card> card = new ArrayList<Card>();
	
	public Deck() {
		
		suits.add("Clubs");
		suits.add("Spades");
		suits.add("Diamonds");
		suits.add("Hearts");
		
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
		
		Card drawnCard = card.get(0);
		card.remove(0);
		return drawnCard;
		
	}
}
