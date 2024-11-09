/**
 * The Car class represents a car with a model, year, and price.
 * It provides methods to set and retrieve the car's attributes.
 * 
 * Attributes:
 * - model: The model of the car (String).
 * - year: The manufacturing year of the car (String).
 * - price: The price of the car (double). Must be non-negative.
 * 
 * Methods:
 * * Constructor
 * - Car(String model, String year, double price): Initialize the car's attributes.
 * 
 * * Mutator: 
 * - setCar(String model, String year, double price): Sets the car's model, year, and price, ensuring price is non-negative.
 * 
 * * Accessor: 
 * - getModel(): Returns the model of the car.
 * - getYear(): Returns the year of the car.
 * - getPrice(): Returns the price of the car if it's positive; otherwise, returns -1.
 **/

public class Car {
	//Private attribute
	private String model;
	private String year;
	private double price;
	
	//Constructor
	public Car(String model, String year , double price) {
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	//Mutator
	public void setCar(String model,String year,double price) {
		this.model = model;
		this.year = year;
		this.price = (price>0) ? price : -1;  //if price isn't postive, return -1
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	//Accessor
	public String getModel() {
		return model;
	}
	
	public String getYear() {
		return year;
	}
	
	public double getPrice() {
		return price;
	}
	
	//Function
	public void printDescription() {
		System.out.println("------The Description------");
		System.out.printf("The model: %s%n",model);
		System.out.printf("The year: %s%n",year);
		System.out.printf("The price: %.2f%n",price);
		System.out.println();
	}

}