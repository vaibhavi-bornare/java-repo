package Inheritance;

public class Animal1 {
 
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Cat1 extends Animal1 {

    public void eat() {
        System.out.println("Cat is eating");
    }

    public void show() {
        eat();        // Child class method
        super.eat();  // Parent class method
    }

    public static void main(String[] args) {

        Cat1 c = new Cat1();

        c.show();
    }
}

