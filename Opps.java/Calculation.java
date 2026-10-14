


public class Calculation {
	
	static int Count=10;
	
	public static void add() {
		System.out.println("addition is " + (Count+5));
	}
	public static void sub() {
		System.out.println("substraction is " + (Count-5));
	}
	public static void mult() {
		System.out.println("multiplication is " + (Count*5));
	}
	
	public static void div() {
		System.out.println("division is " + (Count/5));
	}
	
	public static void main(String[] args) {
		Calculation.add();
		Calculation.sub();
		Calculation.mult();
		Calculation.div();
	}	
	

}
