public class ArrayDemo {
 public static void main(String[] args) {
	// array 
	// we can store multiple values of same type
	//homogeneous(same type)
	// size of array is fixed
	// it based on index
	
	// declaration of array
	// data type variable_name[]=new Data type size of array
	
	int rollNo[]=new int [4];
	
	// initializing array
	
	rollNo[0]=101;
	rollNo[1]=102;
	rollNo[2]=103;
	rollNo[3]=104;
	System.out.println(rollNo.length);
	System.out.println(rollNo);
	
	 for (int i = 0; i < rollNo.length; i++) {
         System.out.println(rollNo[i]);
     }
	 
	 int num[]= {10,20,30,40};
	 for(int i=0;i<num.length;i++) {
		 System.out.println(num[i]);
	 }
	 
	 // declare one array marks
	 //80.23,60.3,99.0,77.5
	 // display all marks
	 // find total of marks
	 
	 double marks[]= {80.23,56.00,67.0,78.9};
	 for(int i=0;i<marks.length;i++) {
		 System.out.println(marks[i]);
	 }
	 
	 double total = 0;

     for (int i = 0; i < marks.length; i++) {
         total += marks[i];
     }

     System.out.println("Total Marks  " + total);
     
 }
}
	 
	   

