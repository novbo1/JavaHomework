/**
 * The studentGrade class represents a student with a name and a grade.
 * It provides methods to set and retrieve the student's attributes (name and grade).
 * Additionally, it includes a static method to print a grade distribution chart 
 * based on an array of student objects.
 * 
 * Attributes:
 * - name: The name of the student (String).
 * - grade: The grade assigned to the student (char).
 * 
 * Methods:
 * 
 * Constructor:
 * - studentGrade(): Initializes the name to "Null" and grade to 'N'.
 * - studentGrade(String name, char grade): Initializes the student with the specified name and grade.
 * 
 * Mutators:
 * - setName(String name): Sets the student's name.
 * - setGrade(char grade): Sets the student's grade.
 * 
 * Accessors:
 * - getName(): Returns the student's name.
 * - getGrade(): Returns the student's grade.
 * 
 * Function:
 * - printChart(studentGrade[] students): 
 *   - Takes an array of studentGrade objects as input.
 *   - Loops through the array to count the occurrences of each grade ('A', 'B', 'C', 'D').
 *   - Displays the total count of each grade in a "Grade Distribution" chart.
 */
public class studentGrade {
	//Private attribute
	private String name;
	private char grade;
	
	//Constructor
	public studentGrade() {
		this.name = "Null";
		this.grade = 'N';
	}
	public studentGrade(String name,char grade) {
		this.name = name;
		this.grade = grade;
	}
	//Mutator
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	//Accessor
	public String getName() {
		return name;
	}
	public char getGrade() {
		return grade;
	}
	
	 public static void printChart(studentGrade[] students) {
	        // Count variables for each grade
	        int aCount = 0, bCount = 0, cCount = 0, dCount = 0;

	        // Loop through the students array and count each grade
	        for (studentGrade student : students) {
	            switch (student.getGrade()) {
	                case 'A':
	                    aCount++;
	                    break;
	                case 'B':
	                    bCount++;
	                    break;
	                case 'C':
	                    cCount++;
	                    break;
	                case 'D':
	                    dCount++;
	                    break;
	                default:
	                    // Handle unexpected grades if necessary
	                    break;
	            }
	        }

	        // Display the results
	        System.out.println("Grade Distribution:");
	        System.out.println("A: " + aCount);
	        System.out.println("B: " + bCount);
	        System.out.println("C: " + cCount);
	        System.out.println("D: " + dCount);
	    }
}
