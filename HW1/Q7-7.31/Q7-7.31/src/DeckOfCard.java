/*
 * - Private attributes:
 *   - RNG: a SecureRandom instance used to generate random numbers for shuffling the deck.
 *   - TOTAL_NUMBER_OF_CARDS: a constant representing the total number of cards in a standard deck (52).
 *   - deck: an array of Card objects to store the deck of 52 cards.
 *   - currentCard: an integer to keep track of the current card being dealt from the deck.
 *
 * - Constructor:
 *   - DeckOfCard(): Initializes the deck by populating the `deck` array with 52 unique cards.
 *                 The faces of the cards are represented by the `faces` array, and suits are represented by the `suit` array.
 *                 It loops through the deck and assigns each card by combining faces and suits.
 *
 * - Methods:
 *   - shuffle(): Shuffles the deck by randomly swapping cards using the RNG instance.
 *   - dealCards(): Deals the top card from the deck and increments the `currentCard` index to simulate drawing a card.
 */

import java.security.SecureRandom;

public class DeckOfCard {
	private static final SecureRandom RNG = new SecureRandom();
	private static final int TOTAL_NUMBER_OF_CARDS = 52;
	private Card[] deck = new Card[TOTAL_NUMBER_OF_CARDS];
	private int currentCard = 0;
	
	//Constructor to get 52 cards in a deck
	public DeckOfCard() {
		//Initialize constants
		String[] faces = {"Ace","Deuce","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
		String[] suit = {"Hearts","Diamonds","Spades","Clubs"};
		//fill in deck
		for(int i = 0 ; i < TOTAL_NUMBER_OF_CARDS ; i++) {
			deck[i] = new Card(faces[i%13],suit[i/13]);
		}
	}
	
	public void shuffle() {
		currentCard = 0;
		Card temp = new Card();
		
		for(int i = 0 ; i < TOTAL_NUMBER_OF_CARDS ; i++) {
			//swap current card with random card (shuffle)
			int randomCardIndex = RNG.nextInt(TOTAL_NUMBER_OF_CARDS); //0~51 index number
			
			temp = deck[i];
			deck[i] = deck[randomCardIndex];
			deck[randomCardIndex] = temp;
		}
	}
	
	public Card dealCards() {
		//deal from the top of deck to last card
		//from currentCard 0 to 51
		if(currentCard < deck.length) {
			return deck[currentCard++];
		}
		else {
			return null;
		}
	}
}
