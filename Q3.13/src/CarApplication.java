/**
 * The CarApplication class serves as a driver to test the functionality of the Car class.
 **/
import java.util.Scanner;

public class CarApplication{
	
	public static void main(String[] args) {
		//Declare input
		String model,year;
		double price;
		
		
		Scanner input = new Scanner(System.in);
		
		//Initialize
		System.out.print("Enter model: ");
		model = input.nextLine();
		System.out.print("Enter year: " );
		year = input.nextLine();
		System.out.print("Enter price: ");
		price = input.nextDouble();
		
		//Test Constructor
		Car car1 = new Car(model,year,price);
		
		//Test Accessor
		System.out.printf("%nThe car's description: %n");
		System.out.printf("Model: %s%n",car1.getModel());
		System.out.printf("Year: %s%n", car1.getYear());
		System.out.printf("Price: %.2f%n",car1.getPrice());
		
		//Get new information for Car
		System.out.print("Enter model: ");
		model = input.nextLine();
		System.out.print("Enter year: " );
		year = input.nextLine();
		System.out.print("Enter price: ");
		price = input.nextDouble();
		
		Car car2 = new Car("Null","Null",0);
		
		//Test Mutator
		car2.setCar("Second Car", "1990", 25000);
	}
}