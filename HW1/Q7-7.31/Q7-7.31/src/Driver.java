/*
 * A driver class to test Poker
 */
public class Driver {
	public static void main(String[] args) {
		Poker simulation = new Poker();
		simulation.printHands();
		System.out.println(simulation.compareHands());
	}
}
