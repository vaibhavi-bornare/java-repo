package Inheritance;

class Vehicle{
    String name;
     Vehicle(String name){
        this.name=name;
     }
     void start(){
        System.out.println(name +" vehical started");
     }
}
class Bike extends Vehicle{

    Bike(String name){
        super(name);
    }

}
class Car extends Vehicle{
    Car(String name){
        super(name);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Bike b=new Bike("Hunter");
        b.start();

        Car c=new Car("KIA");
        c.start();

    }
}
