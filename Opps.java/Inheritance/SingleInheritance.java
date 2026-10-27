package Inheritance;
/* 
inheritance is the inherit the properties of parent class to child class
it helps us to achieve code reusability and reduces duplictes code
super keyword is use to acees the parent class constructor,variables,methods
*/

class Employee{
    String name;
    double salary;

    public void display(){
        System.out.println("name is " + name);
        System.out.println("salary is " +salary);
    }

}
class manager extends Employee{
    public void show(){
        display();
        System.out.println("this is from manager");
    }
}


public class SingleInheritance {
 public static void main(String[] args) {
    manager m=new manager();
    m.name="vaibhavi";
    m.salary=6700.00;
    m.show();
    m.display();
 }   
}
