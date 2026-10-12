import java.util.Scanner;

public class PositveNumber {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);

    System.out.println("enter first number");
     int num=sc.nextInt();

 if(num > 0){
    System.out.println("number is postive");
 }

 else if(num < 0){
    System.out.println("number is negative");
 }

else{
    System.out.println("invalid number");
}
  





    }

}
