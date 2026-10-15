
// block is type of entity which we can binds the logic
class Block {
	// Constructor 
	Block(){
		System.out.println("Constructor");
	}
	
	// 3 types of blocks 
	//1.  IIB (Instance Initialization Block)	
	
	{
		System.out.println("Instance 1");
	}
	
	{
		System.out.println("Instance 2");
	}
	
	//2. Static Block 
	// this block called first in starting point after main method called
	static{
		System.out.println("static 1");
	}
	
	
	static{
		System.out.println("static 2");
	}
	
}

public class BlockMain {

	public static void main(String[] args) {
		Block b = new Block();
		
		Block b1 = new Block();

		//3 .local Block 
		// this block called after main method
		{
			System.out.println("I am local block");
		}
	}
}








