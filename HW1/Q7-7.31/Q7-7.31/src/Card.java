/*
 * - Private attribute
 * face: the number of the card, a constant (13)
 * suit: the type of the card, a constant (4)
 * 
 * - Constructor: 
 * Card(): set both private attribute to null state
 * Card(String,String) set both private attribute to input string
 * - Accessor
 * getFace(): get face's string
 * getSuit(): get suit's string
 * - Function
 * toString(): return the string of *Face of Suit*
 */
public class Card {
	private final String face;  //ace deuce... 13
	private final String suit;  //spades hearts... 4
	
	public Card(String face, String suit) {
		this.face = face;
		this.suit = suit;
	}
	
	public Card() {
		face = "NULL";
		suit = "NULL";
	}
	
	public String getFace() {
		return face;
	}
	public String getSuit() {
		return suit;
	}
	
	public String toString() {
		return face + " of " + suit;
	}
}
