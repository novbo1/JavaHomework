/*
 * - Private attributes:
 *   - FirstHand: an array of 5 `Card` objects representing the first player's hand.
 *   - SecondHand: an array of 5 `Card` objects representing the second player's hand.
 *   - deck: an instance of the `DeckOfCard` class, representing the deck of cards used to deal hands.
 *
 * - Constructor:
 *   - Poker(): Shuffles the deck and deals 5 cards to each of the two hands (FirstHand and SecondHand).
 *
 * - Methods:
 *   - printHands(): Prints the cards in the two hands, formatted in a readable manner.
 *   - compareHands(): Compares the two hands based on their evaluation score and returns a result indicating which hand wins or if it's a tie.
 *   - evaluateHand(): Evaluates the hand and returns a score based on the strength of the hand (e.g., straight flush, full house).
 *   - isStraightFlush(), isFourOfAKind(), isFullHouse(), isFlush(), isStraight(), isThreeOfAKind(), isTwoPair(), isOnePair(): 
 *     Helper methods to check specific poker hand combinations and return a boolean indicating whether the hand matches that combination.
 *   - getRank(): Converts a card's face to a numeric value used for comparisons.
 */
public class Poker {
	private Card[] FirstHand = new Card[5];
	private Card[] SecondHand = new Card[5];
	private DeckOfCard deck = new DeckOfCard();
	
	//Constructor
	public Poker() {
		deck.shuffle();
		for(int i = 0; i < 5 ; i++) {
			FirstHand[i] = deck.dealCards();
			SecondHand[i] = deck.dealCards();
		}
	}
	
	//Functions 
	public void printHands() {
	    System.out.printf("First Hand Cards   Second Hand Cards%n");
	    for (int i = 0; i < 5; i++) {
	        System.out.printf("%-19s%-19s%n", FirstHand[i].toString(), SecondHand[i].toString());
	    }
	}
	//Compare Firsthand and Secondhand
    public String compareHands() {
        int firstHandScore = evaluateHand(FirstHand);
        int secondHandScore = evaluateHand(SecondHand);

        if (firstHandScore > secondHandScore) {
            return "First Hand wins!";
        } else if (secondHandScore > firstHandScore) {
            return "Second Hand wins!";
        } else {
            return ("It's a tie");
        }
    }
    
    //The rule of poker, highest rank returns highest point
    private int evaluateHand(Card[] hand) {
        if (isStraightFlush(hand)) return 9;
        if (isFourOfAKind(hand)) return 8;
        if (isFullHouse(hand)) return 7;
        if (isFlush(hand)) return 6;
        if (isStraight(hand)) return 5;
        if (isThreeOfAKind(hand)) return 4;
        if (isTwoPair(hand)) return 3;
        if (isOnePair(hand)) return 2;
        return 1; // High Card
    }
    
    public boolean isStraightFlush(Card[] hand) {
    	if(isFlush(hand) && isStraight(hand)) {
    		return true;
    	}
    	return false;
    }
    
    public boolean isFourOfAKind(Card[] hand) {
        String[] count = new String[5];
        
        for (int i = 0; i < 5; i++) {
            count[i] = hand[i].getFace();
        }
        for (int i = 0; i < 5; i++) {
            int faceCount = 0;
            for (int j = 0; j < 5; j++) {
                if (count[i].equals(count[j])) {
                    faceCount++;
                }
            }
            if (faceCount == 4) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isFullHouse(Card[] hand) {
        String[] faces = new String[5];
        
        for (int i = 0; i < 5; i++) {
            faces[i] = hand[i].getFace();
        }
        
        int threeOfAKindCount = 0;
        int pairCount = 0;
        
        for (int i = 0; i < 5; i++) {
            int faceCount = 0;
            for (int j = 0; j < 5; j++) {
                if (faces[i].equals(faces[j])) {
                    faceCount++;
                }
            }
            if (faceCount == 3) {
                threeOfAKindCount = 3;
            }
            if (faceCount == 2) {
                pairCount = 2;
            }
        }
        return (threeOfAKindCount == 3 && pairCount == 2);
    }
    
    public boolean isFlush(Card[] hand) {
        String suit = hand[0].getSuit();
        
        for (int i = 1; i < 5; i++) {
            if (!hand[i].getSuit().equals(suit)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean isStraight(Card[] hand) {
        // Step 1: Create an array to hold the values of the cards
        int[] values = new int[5];
        
        // Step 2: Convert each card's face into a numeric value
        for (int i = 0; i < 5; i++) {
            String face = hand[i].getFace();
            
            // Convert card face to corresponding numeric value
            if (face.equals("Ace")) {
                values[i] = 14; // Ace can be the highest, use 14
            } else if (face.equals("King")) {
                values[i] = 13;
            } else if (face.equals("Queen")) {
                values[i] = 12;
            } else if (face.equals("Jack")) {
                values[i] = 11;
            } else {
                // For number cards 2-10, we can directly parse the face value to an integer
                values[i] = getRank(face);
            }
        }

        // Step 4: Check if the cards are in a sequence
        for (int i = 1; i < values.length; i++) {
            if (values[i] != values[i - 1] + 1) {
                return false; // If not consecutive, it's not a straight
            }
        }

        return true; // All cards are consecutive, so it's a straight
    }
    
    public boolean isThreeOfAKind(Card[] hand) {
        // Step 1: Initialize the count array to hold the face values of the cards in the hand
        String[] count = new String[5];

        // Step 2: Populate the count array with the face values of each card in the hand
        for (int i = 0; i < 5; i++) {
            count[i] = hand[i].getFace();
        }

        // Step 3: Check for three of a kind by comparing each card's face with the others
        for (int i = 0; i < 5; i++) {
            int faceCount = 0;  // Reset count for each face
            for (int j = 0; j < 5; j++) {
                if (count[i].equals(count[j])) {
                    faceCount++;  // Increment count if faces match
                }
            }
            // If a face appears exactly 3 times, return true (three of a kind)
            if (faceCount == 3) {
                return true;
            }
        }

        // If no three of a kind is found, return false
        return false;
    }
    
    public boolean isTwoPair(Card[] hand) {
        // Step 1: Initialize an array to count occurrences of each rank (Ace=0, Deuce=1, ..., King=12)
        int[] rankCount = new int[13]; // Array to store counts for each rank (Ace = 0, ..., King = 12)

        // Step 2: Count the occurrences of each rank in the hand
        for (int i = 0; i < 5; i++) {
            String face = hand[i].getFace();
            int rank = getRank(face); // Convert face to corresponding rank

            // Increment the count for the corresponding rank
            rankCount[rank]++;
        }

        // Step 3: Count how many ranks have exactly two occurrences (pairs)
        int pairCount = 0;
        for (int i = 0; i < 13; i++) {
            if (rankCount[i] == 2) {
                pairCount++; // Increase pairCount if a rank has exactly two cards
            }
        }

        // Step 4: Return true if there are exactly two pairs
        return pairCount == 2;
    }
    
    public boolean isOnePair(Card[] hand) {
        // Step 1: Initialize an array to count occurrences of each rank (Ace=0, Deuce=1, ..., King=12)
        int[] rankCount = new int[13]; // Array to store counts for each rank (Ace = 0, ..., King = 12)

        // Step 2: Count the occurrences of each rank in the hand
        for (int i = 0; i < hand.length; i++) {
            String face = hand[i].getFace();
            int rank = getRank(face); // Convert face to corresponding rank

            // Increment the count for the corresponding rank
            rankCount[rank]++;
        }

        // Step 3: Check if there is exactly one rank with two occurrences (pair)
        int pairCount = 0;
        for (int i = 0; i < 13; i++) {
            if (rankCount[i] == 2) {
                pairCount++; // Increase pairCount if a rank has exactly two cards
            }
        }

        // Step 4: Return true if there is exactly one pair
        return pairCount == 1;
    }
    
    private int getRank(String face) {
        switch (face) {
            case "Ace":
                return 0; // Ace
            case "Deuce":
                return 1; // Deuce (2)
            case "Three":
                return 2; // Three
            case "Four":
                return 3; // Four
            case "Five":
                return 4; // Five
            case "Six":
                return 5; // Six
            case "Seven":
                return 6; // Seven
            case "Eight":
                return 7; // Eight
            case "Nine":
                return 8; // Nine
            case "Ten":
                return 9; // Ten
            case "Jack":
                return 10; // Jack
            case "Queen":
                return 11; // Queen
            case "King":
                return 12; // King
            default:
                return -1; // Error case, should never happen
        }
    } 
}
