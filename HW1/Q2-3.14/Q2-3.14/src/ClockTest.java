
public class ClockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock clock1 = new Clock(5,20,20);
		//Test constructor
		clock1.displayTime();
		
		//Test mutator
		clock1.setHour(25);
		clock1.setMinute(58);
		clock1.setSecond(100);
		
		clock1.displayTime();
		
		//Test Accessor
		System.out.printf("The hour: %d%nThe minute: %d%nThe second: %d%n",clock1.getHour(),clock1.getMinute(),clock1.getSecond());
	}

}
