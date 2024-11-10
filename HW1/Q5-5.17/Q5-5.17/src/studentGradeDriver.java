
public class studentGradeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create 5 student objects
		 studentGrade[] students = new studentGrade[5];

	    // Initialize the students with sample data
		 students[0] = new studentGrade("Student1", 'A');
	     students[1] = new studentGrade("Student2", 'C');
	     students[2] = new studentGrade("Student3", 'B');
	     students[3] = new studentGrade("Student4", 'A');
	     students[4] = new studentGrade("Student5", 'B');
	     
	    // Call getChart to display the grade distribution
	     studentGrade.printChart(students);
	}

}
