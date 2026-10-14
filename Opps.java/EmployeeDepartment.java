

class Employees {
	
	int id;
	String name;
	static String dept = "IT";
	
	
	public Employees(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
}

class Display{
	
	Employees emp = new  Employees(101,"John");
	
	public void show() {
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(Employees.dept);
	}
	
	public static void m1() {
		System.out.println("Hello");
	}
	
}

public class EmployeeDepartment {

	public static void main(String[] args) {
		
		 Display dis = new Display();
		 dis.show();
		 
		 Display.m1();// statis method called using  classname and methodname
	}
}