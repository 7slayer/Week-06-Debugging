import java.util.HashMap;
import java.util.Map;

public class Card {
	
	private int value;
	private StringBuilder name = new StringBuilder();
	private String suit;
	private Map<Integer, String> valueName = new HashMap<Integer, String>();
	
	public Card(int value, String suit) {
		
		valueName.put(2, "Two"); 

		valueName.put(3, "Three"); 

		valueName.put(4, "Four"); 

		valueName.put(5, "Five"); 

		valueName.put(6, "Six"); 

		valueName.put(7, "Seven"); 

		valueName.put(8, "Eight"); 

		valueName.put(9, "Nine"); 

		valueName.put(10, "Ten"); 

		valueName.put(11, "Jack"); 

		valueName.put(12, "Queen"); 

		valueName.put(13, "King"); 

		valueName.put(14, "Ace"); 
		
		setValue(value);
		setSuit(suit);
		setName();
		
	}
	
	public int getValue() {
		return value;
	}
	private void setValue(int value) {
		this.value = value;
	}
	public StringBuilder getName() {
		return name;
	}
	private void setName() {
		name.append(valueName.get(getValue()) + " of " + suit);
	}
	public String getSuit() {
		return suit;
	}
	private void setSuit(String suit) {
		this.suit = suit;
	}
	
	public void describe() {
		System.out.println(getName().toString());
	}
	
}
