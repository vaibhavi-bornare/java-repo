import java.util.Scanner;



public class Square {
    public static void main(String[] args) {
        int length;
        int width;

        Scanner sc =new Scanner(System.in);
        System.out.println("enter length of square");
        length=sc.nextInt();

        System.out.println("enter width for square");
        width=sc.nextInt();

        int Area=length*width;
        System.out.println(Area);

    }
}
