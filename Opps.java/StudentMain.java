
    
class Student{
	int id;
	String name;
	String course;
	
	
	// default value:-
	// int,short,byte,long->0
	// float,double=0.0
	// String =null
	// boolean=false
	
	// constructor name is same as class name
		// we can provide modifiers also 
		// constructor does not have nay return type not even void
		// When ever we creating object of class than constructor called automatically 
		// it is use to initialize object
		
		// this();it use to refer current object 
	    // in one constructor to another constructor we use this();
	  // and inside function we use this.method_name();
	
	 
	
		// default 
		// constructor created by java
		
		// non-parametrized constructor 	
		public Student(){
			System.out.println("HII Constructor");
		}
		
		// parametrized constructor 	
		public Student(String messege) {
			System.out.println(messege);
		}
		
		// constructor to initialize object 
		// this keyword is use to refer current object
		Student(int id , String name , String course){
			this.id = id;
			this.name = name;
			this.course = course;		
		}
		
		public void display() {
			System.out.println(id);
			System.out.println(name);
			System.out.println(course);
		}
		
	}


	public class StudentMain {

		public static void main(String[] args) {
			// call non-parametrized
			Student s1 = new Student();
			
			// call parametrized
			Student s = new Student("hi ...");
			
			// call parametrized to initialize object
			Student obj1 = new Student(1 , "Rohan" , "Java");
			obj1.display();
			
			Student obj2 = new Student(2 , "Mayur" , "Python");
			obj2.display();
			
		}
	}







