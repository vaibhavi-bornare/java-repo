package PolymorphishmAndType;
/*
run time =>it is aslo called method overiding
in this use inheritance concepts
upcastinng =>it means craete parent class object this
parent class refrence through call the child object
*/
class Vehicle{
    public void start(){
        System.out.println("vehicle started");
    }
}
class Car extends Vehicle{
    @Override 
    public void start(){
        System.out.println("car started");
    }
}

public class RunTime {
    public static void main(String[] args) {
        Vehicle v=new Car();
        v.start();
    }
}
