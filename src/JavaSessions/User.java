package JavaSessions;

public class User {
	
	//class vars:
	String name;
	int age;
	int userid;
	char gender;
	boolean isActive;
	static int wheels;
	
	//constructor: default and param 
	
	public User(){//default or 0 param const...
		System.out.println("default or 0 param const....");
	}
	
	public User(int i){ //1 param const...
		System.out.println("1 param const..." + i);
	}
	
	public User(int i, String p){ //2 params const...
		System.out.println("2 params const... "+ i + p);
	}
	
	//const.. with all class vars:
	public User(String name, int age, int userid, char gender, boolean isActive) {
		this.name = name;
		this.age = age;
		this.userid = userid;
		this.gender = gender;
		this.isActive = isActive;
	}
	
	public User(String name, int age, int userid, int wheels) {
		this.name = name;
		this.age = age;
		this.userid = userid;
		this.wheels = wheels;
	}

	public static void main(String[] args) {
		User u1 = new User();		
		User u2 = new User(10);
		User u3 = new User(100, "Naveen");
		
		User us1 = new User("Nadeem", 25, 101, 'm', true);
		User us2 = new User("Gulnaz", 26, 102, 'm', true);
		User us3 = new User("Sucheta", 27, 103, 'f', false);
		User us4 = new User("Sandeep", 32, 104, 'm', false);

		System.out.println(us1.name + " "+ us1.isActive);
		System.out.println(us4.name + " " + us4.userid + " " + us4.isActive);
		
		User us5 = new User("Tom", 23, 1008, 4);
		System.out.println(us5.name);
		System.out.println(us5.wheels);
		
		
	}

	

}
