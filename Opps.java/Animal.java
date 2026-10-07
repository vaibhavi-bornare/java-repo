

public class Animal {
    // class is blueprint to create objects
	
	String name;  // instance / global 
	String color;
	int age;
	public static void main(String[] args) {
		
		// Objects 
		Animal a = new Animal();
		a.name = "Dog";
		a.color = "Brown";
		a.age = 5;
		
		System.out.println(a.name);
		System.out.println(a.color);
		System.out.println(a.age);
			
		Animal a1 = new Animal();
		a1.name = "Cat";
		a1.color = "white";
		a1.age = 2;
		
		
	
		System.out.println(a1.name);
		System.out.println(a1.color);
		System.out.println(a1.age);
	}
	

 
    
}
