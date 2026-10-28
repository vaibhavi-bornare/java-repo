package Inheritance;
/*Multilevel inheritance is a type of inheritance 
in which one class inherits from another class, 
and a third class inherits from the second class. 
*/
class Animal{
    String name;
    Animal(String name){
        this.name=name;
    }

 }
class Dog extends Animal{

    Dog(String name){
        super(name);
    }
   public void eat(){
        System.out.println(name+" eat bone");
    }
}
class Puppy extends Dog{
      Puppy(String name){
        super(name);
    
    }
     public void run(){
     eat();
        System.out.println(name+ " is running");
     }
}




public class MultiLevel {
    public static void main(String[] args) {
        Puppy p=new Puppy("Tonny");
      p.run();
    }
}
