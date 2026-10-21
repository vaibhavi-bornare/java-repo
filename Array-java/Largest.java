

public class Largest {
	
	public static void main(String[] args) {
		
		int no[] = {40 , 77 , 80 , 90 , 23 , 105};
		
		int max = no[0];
		
		for(int i = 1; i< no.length ; i++) {
			if(no[i] > max) {
				max = no[i]; // 105	
			}
		}
		System.err.println("Largest number : "+max);
		
	}

}
