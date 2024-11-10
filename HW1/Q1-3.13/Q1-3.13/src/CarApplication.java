/**
 * The CarApplication class serves as a driver to test the functionality of the Car class.
 **/

public class CarApplication{
	
	public static void main(String[] args) {
		//Create car object
		Car car1 = new Car("First car" , "1980" , 500);
		Car car2 = new Car("Second car" , "1990" , 1000);
		
		//Original display
		System.out.println("The Car's description before discount: ");
		car1.printDescription();
		car2.printDescription();
		
		//Discount
		car1.setPrice(car1.getPrice()*1.05);
		car2.setPrice(car1.getPrice()*1.07);
		
		//Discount display
		System.out.println("The Car's description after discount: ");
		car1.printDescription();
		car2.printDescription();
	}
}