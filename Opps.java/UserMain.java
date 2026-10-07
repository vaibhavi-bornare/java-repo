import java.util.Scanner;
 
class User{
    String name;
    int Age;
    String city;
    Double Marks;
}


public class UserMain {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     User u=new User();
           

      System.out.println("enter name");
      u.name=sc.next();

     System.out.println("enter age");
     u.Age=sc.nextInt();

     System.out.println("enter city");
     u.city=sc.next();

     System.out.println("enter marks");
     u.Marks=sc.nextDouble();

     System.out.println("name "+ "= "+ u.name);
     System.out.println("age "+"= "+ u.Age);
     System.out.println("city "+"= "+ u.city);
     System.out.println("marks "+"= "+ u.Marks);
        


    }
}
