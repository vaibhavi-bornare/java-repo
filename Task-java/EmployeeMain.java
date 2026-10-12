

class Employee{
	int empId;
	String empName;
	int age;
	String Department;
	double Salary = 25000.50;
	
	
	Employee(){
		System.out.println("hii...");
	}
	
	Employee(int empId,String empName,int age,String Department,double Salary){
	   this();
		this.empId=empId;
		this.empName=empName;
		this.age=age;
		this.Department=Department;
		this.Salary=Salary;
	}
	
	public void display() {
		this.show();
		System.out.println("empid is "+ this.empId);
		System.out.println("empname is "+ this.empName);
		System.out.println("empage is "+ this.age);
		System.out.println("empDepartment is "+this.Department);
		System.out.println("empsalary is "+this.Salary);
	}
	
	
	public void show(){
		System.out.println("this is from show method");
	}
	
	
}


public class EmployeeMain {
	
	public static void main(String[] args) {
		 Employee e1 = new Employee();
		 
	Employee e2 = new Employee(101, "Raj", 22, "IT", 25000.50);
	Employee e3=new Employee(102,"Nikita",23,"IT",25000.50);
	
	 e2.display();
	 e3.display();
	 
	
	
	}
}


// create one EmployeeMain class
// create Employee class
// create simple constructor and write ant message
// use empId,empName,age,department,salary
// initialize fields using constructor
// create method to display all details with proper message
// create one more method write some message and call this method 
// using this