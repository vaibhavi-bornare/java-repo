import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = sc.nextInt();
        System.out.println("enter secound number");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);

        } else if (num1 < num2) {
            System.out.println(num1 + " is smaller than " + num2);
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
