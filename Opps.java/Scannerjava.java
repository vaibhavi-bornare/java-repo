import java.util.Scanner;;
public class Scannerjava {
    
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner sc =new Scanner(System.in);

        System.out.println("enter first number");
        num1=sc.nextInt();

        System.out.println("enter secound number");
        num2=sc.nextInt();


         
        int sum=num1+num2;
         System.out.println("Addition of "+ num1 + " + " + num2 + "= " + sum);
         
      


         
    }
}
