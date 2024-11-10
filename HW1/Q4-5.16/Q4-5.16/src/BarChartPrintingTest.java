import java.util.Scanner;

public class BarChartPrintingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare an array of numbers to hold 5 integers
		int[] number = new int[5];
		Scanner inp = new Scanner(System.in);
		
		//Hint the user to input 5 numbers
		System.out.println("Enter 5 number ranges from 1~30");
		
		//Save 5 integers into array
		for(int i = 0 ; i < 5 ; i++) {
			number[i] = inp.nextInt();
			if(number[i] <= 0 || number[i] >= 30) 
				System.exit(1);
		}
		
		//Print out the BarChartings to the respond number
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < number[i] ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
