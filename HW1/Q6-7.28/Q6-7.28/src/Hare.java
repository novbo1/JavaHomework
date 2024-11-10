/**
 * The Hare class represents the hare in the tortoise and hare race simulation. 
 * The hare moves across the race course, following specific movement rules determined by a random number generator.
 * 
 * Attributes:
 * - RNG: A SecureRandom object used to generate random numbers for movement decisions (SecureRandom).
 * - startingSquare: The starting position of the hare on the race track (constant, int). This value is 1.
 * - endingSquare: The position that signifies the finish line (constant, int). This value is 70.
 * - currentSquare: The current position of the hare on the race track (int).
 * 
 * Methods:
 * - Hare(int currentSquare): Constructor that initializes the hare's position with a given starting square.
 * - Hare(): Constructor that initializes the hare's position to the starting square (1).
 * - setCurrentSquare(int currentSquare): Sets the current position of the hare on the race track.
 * - getCurrentSquare(): Returns the current position of the hare on the race track.
 * - moveSpace(): Moves the hare based on a random number between 1 and 10, following the movement rules defined for the hare.
 *      - 1-2: The hare sleeps and does not move.
 *      - 3-4: The hare makes a big hop, moving 9 squares forward.
 *      - 5: The hare slips backward by 12 squares (but not past the starting square).
 *      - 6-8: The hare makes a small hop, moving 1 square forward.
 *      - 9-10: The hare slips backward by 2 squares (but not past the starting square).
 * - winCond(): Checks if the hare has reached or passed the finishing line (square 70) and returns true if it has.
 */
import java.security.SecureRandom;

public class Hare {
	//Private attribute
	private SecureRandom RNG = new SecureRandom();
	private static final int startingSquare = 1;
	private static final int endingSquare = 70;
	private int currentSquare;
	
	//Constructor
	public Hare(int currentSquare) {
		this.currentSquare = currentSquare;
	}
	public Hare() {
		currentSquare = startingSquare;
	}
	
	//Mutator & Accessor
	public void setCurrentSquare(int currentSquare) {
		this.currentSquare = currentSquare;
	}
	public int getCurrentSquare() {
		return currentSquare;
	}
	
	//Functions
	//Move space
	public void moveSpace() {
		int P = (RNG.nextInt(10)+1);
		if(P>0 && P <=2) {
			currentSquare +=0;       //Sleep
		}
		else if(P > 2 && P <=4) {
			currentSquare +=9;       //Big hop
		}
		else if(P>4 && P<=5) {
			if(currentSquare-12 > startingSquare) {
				currentSquare-=12;   //Big slip
			}
			else {
				currentSquare = startingSquare;
			}
		}
		else if(P>5 && P <=8) {
			currentSquare+=1;        //Small hop
		}
		else {
			if(currentSquare-2>startingSquare) {
				currentSquare-=2;    //Small slip
			}
			else {
				currentSquare = startingSquare;
			}
		}
	}
	
	//Check if exceeds endingSquare
	public boolean winCond() {
		if(currentSquare >= endingSquare) {
			return true;
		}
		return false;
	}
}
