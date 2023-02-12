import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	public Player(String name) {
		
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
	
	public void draw(Deck deckToDraw) {
		hand.add(deckToDraw.draw());
	}
	
	public Card flip() {
		Card cardInHand = hand.get(0);
		hand.remove(0);
		return cardInHand;
	}
	
	public void incrementScore() {
		setScore(getScore() + 1);
	}
}
