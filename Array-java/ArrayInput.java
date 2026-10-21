
import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("----------Welcome To Student DashBoard--------");

		System.out.println("Enter total Subjects");
		int size = scan.nextInt();

		int marks[] = new int[size];

		System.out.println("Enter Your " + size + " subjects Marks..");

		// to initialize array
		for (int i = 0; i < marks.length; i++) {
			marks[i] = scan.nextInt();
		}

		System.out.println("\n Your Marks is : ");
		// to iterate array
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		int sum = 0;
		// to initialize array
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}

		System.out.println("Addition Of All Marks is: " + sum);

		scan.close();

	}

}
