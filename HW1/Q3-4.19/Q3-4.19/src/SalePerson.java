/**
 * The Salesperson class represents a salesperson who earns a fixed base salary 
 * plus a ratio based on their total sales for the week.
 * 
 * Attributes:
 * - baseSalary: The fixed weekly salary for the salesperson (double). Default value is $200.
 * - commissionRate: The commission rate on total sales (double). Default value is 9% (0.09).
 * - totalSales: The total value of all items sold by the salesperson in the week (double).
 * 
 * Methods:
 * * Constructor:
 * - Salesperson(): Initializes the base salary to $200, the commission rate to 9%, and totalSales to 0.
 *
 * * Function:
 * - calculateEarnings(): Calculates and returns the total earnings for the week.
 *   This is calculated as the base salary plus 9% of the total sales.
 * - displayEarnings(): Display the total earnings of the SalePerson
 */
public class SalePerson {
	//Private attribute
	private double baseSalary;
	private double ratio;
	private double totalSell;
	
	//Constructor
	public SalePerson() {
		this.totalSell = 0;
		this.baseSalary = 200;
		this.ratio = 0.09;
	}
	
	public SalePerson(double totalSell) {
		this.totalSell = totalSell;
		this.baseSalary = 200;
		this.ratio = 0.09;
	}
	
	public SalePerson(double baseSalary,double ratio , double totalSell) {
		this.baseSalary = baseSalary;
		this.ratio = ratio;
		this.totalSell = totalSell;
	}
	
	//Mutator
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public void setRatio(double ratio) {
		this.ratio = ratio;
	}
	public void setTotalSell(double totalSell) {
		this.totalSell = totalSell;
	}
	
	//Accessor
	public double getBaseSalaary() {
		return baseSalary;
	}
	public double getRatio() {
		return ratio;
	}
	public double getTotalSell() {
		return totalSell;
	}
	
	//Function
	public double calculateEarnings() {
		return (baseSalary + (ratio+1)*totalSell);
	}
	
	public void displayEarnings() {
		System.out.printf("The total earning is: %.2f%n",this.calculateEarnings());
	}
}
