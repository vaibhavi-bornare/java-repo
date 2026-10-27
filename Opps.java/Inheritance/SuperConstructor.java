package Inheritance;
class Employees{
   String name;
   double salary;

   Employees(String name,double salary){
    this.name=name;
    this.salary=salary;
   }
   public void display(){
System.out.println("name is "+ name);
System.out.println("salary is "+ salary);   }
}
class Managers extends Employees{
    String name="Ram";

    Managers(String name,double salary) {
        super(name,salary);
    }
    public void show(){
        System.out.println("this is from manager class");
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        Managers m=new Managers("ayush",4500.00);
        m.display();
        m.show();
    }
}
