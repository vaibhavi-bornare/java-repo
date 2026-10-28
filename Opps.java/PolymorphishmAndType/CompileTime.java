package PolymorphishmAndType;

import java.util.Scanner;

/*
polymorphism means one name diffrent froms
there are two types 
1.compile time=>method overloading
 in same class same method but diff types of para

*/
class Auth{
    public void login(String email,String password){
        if(email.equals("abc@gmail.com")&&password.equals("123")){
            System.out.println("login successful");

        }
        else{
            System.out.println("invalid details");
        }
    }
public void login(long phoneno,String password){
    if((phoneno==1234567890)&& password.equals("123")){
        System.out.println("login sucessful");
    }
    else{
        System.out.println("invalid details");
    }
}


}

public class CompileTime {
    public static void main(String[] args) {
        Auth a=new Auth();
        Scanner sc=new Scanner(System.in);
         System.out.println("1.login with your email");
         System.out.println("2.login with your phone");
         System.out.println("enter your choice");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:System.out.println("Enter Email");
            String email=sc.next();

            System.out.println("enter password");
            String password=sc.next();
                 a.login(email,password);
                break;

                case 2:System.out.println("Enter Email");
            long phoneno=sc.nextLong();

            System.out.println("enter password");
            String phonepassword=sc.next();
                 a.login(phoneno,phonepassword);
                break;
        
        
            default:
                System.out.println("invalid details");
                break;
        }


    }
}
