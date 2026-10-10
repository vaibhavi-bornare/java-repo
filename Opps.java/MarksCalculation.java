
import java.util.Scanner;

public class MarksCalculation {
	
	// Global 
	String name;
	double marks1;
	double marks2;
	double marks3;
	
	// to display all details
	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Marks 1: " +marks1 );
		System.out.println("Marks 2: " +marks2 );
		System.out.println("Marks 3: " +marks3 );
	} 
	
	// calculate sum
	public double calculateTotal() {
		double total = marks1 + marks2 +marks3;
		return total;
	}
	
	// calculate percentage
	public void calculatePercentage() {
		double percentage = calculateTotal()/3.0;
		System.out.println("Percentage is: " + percentage + " %");
	}
	
	
	// Entry Point
	public static void main(String[] args) {
		// creating objects
		MarksCalculation m = new MarksCalculation();
		
		// for UserInput
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		m.name = scan.next();	
		System.out.println("Enter Marks 1");
		m.marks1 = scan.nextDouble();
		System.out.println("Enter Marks 2");
		m.marks2 = scan.nextDouble();
		System.out.println("Enter Marks 3");
		m.marks3 = scan.nextDouble();
	
		m.displayDetails();
		
		// call calculateTotal
		double sum = m.calculateTotal();
		System.out.println("Summation of Marks is: " + sum);
		
		// call calculatePercentage()
		m.calculatePercentage();
	}

}

