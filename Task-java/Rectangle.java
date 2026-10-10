
import java.util.Scanner;
public class Rectangle
 {
    public static void main(String[] args) {
        int length;
        int width;

        Scanner sc =new Scanner(System.in);
        System.out.println("enter length");
        length=sc.nextInt();

        System.out.println("enter width ");
        width=sc.nextInt();

        int Area=length*width;
        System.out.println(Area);

    }
}
