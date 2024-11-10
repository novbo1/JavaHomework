/**
 * The Clock class represents a time format with hour, minute, and second.
 * It provides methods to set and retrieve the time components, ensuring that 
 * values are within valid ranges.
 * 
 * Attributes:
 * - hour: The hour component of the time (int). Valid range: 0 to 23.
 * - minute: The minute component of the time (int). Valid range: 0 to 59.
 * - second: The second component of the time (int). Valid range: 0 to 59.
 * 
 * Methods:
 * * Constructor:
 * 
 * * Mutators:
 * - setHour(int hour): Sets the hour. If the hour is more than 23, sets hour to 0.
 * - setMinute(int minute): Sets the minute. If the minute is more than 59, sets minute to 0.
 * - setSecond(int second): Sets the second. If the second is more than 59, sets second to 0.
 *   If hour > 23, minute > 59, or second > 59, sets all to 0.
 * 
 * * Accessors:
 * - getHour(): Returns the hour component of the time.
 * - getMinute(): Returns the minute component of the time.
 * - getSecond(): Returns the second component of the time.
 * 
 * * Function:
 * - displayTime(): Displays the time in an "hh:mm:ss" format.
 */
public class Clock {
	//Private attribute
	private int hour;
	private int minute;
	private int second;
	
	//Constructor
	
	//default
	public Clock() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	//normal
	public Clock(int hour , int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//Mutator
	public void setHour(int hour) {
		if(hour > 23 || hour < 0) {
			this.hour = 0;
		}
		else {
			this.hour = hour;
		}
	}
	public void setMinute(int minute) {
		if(minute > 59 || minute < 0) {
			this.minute = 0;
		}
		else {
			this.minute = minute;
		}
	}
	public void setSecond(int second) {
		if(second > 59 || second < 0) {
			this.second = 0;
		}
		else {
			this.second = second;
		}
	}
	
	//Accessor
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	
	//Display function
	public void displayTime() {
		System.out.printf("The current time now is %2d:%2d:%2d%n",hour,minute,second);
	}
}
