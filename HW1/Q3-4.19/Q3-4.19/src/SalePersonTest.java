
public class SalePersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Values of items sold from Fig. 4.33
        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;
        
        // Calculate the total sales amount
        double totalSales = item1 + item2 + item3 + item4;
        
        // Create a SalePerson object using the total sales amount
        SalePerson salesperson = new SalePerson(totalSales);
        
        // Display the total sales and the earnings
        System.out.printf("Salesperson's total sales: %.2f$%n", totalSales);
        salesperson.displayEarnings();
	}

}
