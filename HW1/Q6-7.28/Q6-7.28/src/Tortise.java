/**
 * The Tortise class represents the tortoise in the tortoise and hare race simulation. 
 * The tortoise moves across the race course based on specific movement rules determined by a random number generator.
 * 
 * Attributes:
 * - RNG: A SecureRandom object used to generate random numbers for movement decisions (SecureRandom).
 * - startingSquare: The starting position of the tortoise on the race track (constant, int). This value is 1.
 * - endingSquare: The position that signifies the finish line (constant, int). This value is 70.
 * - currentSquare: The current position of the tortoise on the race track (int).
 * 
 * Methods:
 * - Tortise(int currentSquare): Constructor that initializes the tortoise's position with a given starting square.
 * - Tortise(): Constructor that initializes the tortoise's position to the starting square (1).
 * - setCurrentSquare(int currentSquare): Sets the current position of the tortoise on the race track.
 * - getCurrentSquare(): Returns the current position of the tortoise on the race track.
 * - moveSpace(): Moves the tortoise based on a random number between 1 and 10, following the movement rules defined for the tortoise.
 *      - 1-5: The tortoise makes a fast plod, moving 3 squares forward.
 *      - 6-7: The tortoise slips, moving 6 squares backward (but not past the starting square).
 *      - 8-10: The tortoise makes a slow plod, moving 1 square forward.
 * - winCond(): Checks if the tortoise has reached or passed the finishing line (square 70) and returns true if it has.
 */

import java.security.SecureRandom;

public class Tortise {
	//Private attribute
	private static SecureRandom RNG = new SecureRandom();
	private static final int startingSquare = 1;
	private static final int endingSquare = 70;
	private int currentSquare;
	
	//Constructor
	public Tortise(int currentSquare) {
		this.currentSquare = currentSquare;
	}
	public Tortise() {
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
	
	//Move Space
	public void moveSpace() {
		int P = (1+RNG.nextInt(10));
		
		if(P<=5 && P >=1) {
			currentSquare +=3;     //Fast plod
		}
		else if(P>5 && P < 8) {
			if(currentSquare-6 > 0) {
				currentSquare-=6;  //Slip
			}
			else {
				currentSquare = 1;
			}
		}
		else {
			currentSquare+=1;      //Slow plod
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
