
public class Counter {

	int count;
    // if we use static variable they shows only one copy it means output should
    // be 1,2,3
	Counter(){
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		Counter c1=new Counter();
		Counter c2=new Counter();

		Counter c3=new Counter();

		
	}
}
