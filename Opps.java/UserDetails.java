


class User {

	int userId;
	String name;

	User(int userId, String name) {
		this.name = name;
		this.userId = userId;
	}

	void show() {
		System.out.println(userId);
		System.out.println(name);
	}
	
	@Override
	protected void finalize() {
		System.out.println("finalize called");
	}
}

public class UserDetails {

	public static void main(String[] args) {
		User u1 = new User(101, "John");
		u1.show();
		
		u1 = null;
		
		System.gc();
    // gc automatically call when we create fianlizemethod
		
		User u2 = new User(102, "Rohan");
		u2.show();
		
		
	}

}


