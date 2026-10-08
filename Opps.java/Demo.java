

public class Demo {
	
	public void greet() {
		System.out.println("hello from greet message");
	}
	
	public void main() {
		System.out.println("hello from main method");
	}
	// method with parameter
	public void add(int i,int j) {
	  System.out.println(i+j);
	}
	
	// method with return keyword
	String display() {
		return "hi java";
	}
	
	public static void main(String[] args) {
		
	// to call method
		Demo d=new Demo();
		d.greet();
		d.main();
		d.add(10, 10);
		String msg=d.display();
		System.out.println(msg);
	}

}
