package Inheritance;

public class Fileds {
   
    String name = "Animal";
    int age = 10;
}
class Monkey extends Fileds {

    String name = "Cat";
    int age = 5;

    public void show() {

        System.out.println("Child name: " + name);
        System.out.println("Child age: " + age);

        System.out.println("Parent name: " + super.name);
        System.out.println("Parent age: " + super.age);
    }

    public static void main(String[] args) {

        Monkey c = new Monkey();

        c.show();
    }
}

