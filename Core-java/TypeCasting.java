public class TypeCasting {
    public static void main(String[] args) {
  
        // there are two types of type casting 
        // 1 implicit type casting
        // 2 explicit type casting

        // 1 implicit type casting it means convert big data type into smaller data
        // type
        //2 and explicit means convert small data type into large data type but

        // implicit type casting
        // int to long 
        int a=10;
        long b=a;
        System.out.println(b);


        // explicit type casting
        long c=1000000;
		int b1=(int)c;
		System.out.println(b1);
		

        // float to int 
        float d=45.66666f;
		int c1=(int)d;
		System.out.println(c1);
    }
}
