public class ArraySum{
    public static void main(String[] args) {
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