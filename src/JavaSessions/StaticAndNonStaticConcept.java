package JavaSessions;

public class StaticAndNonStaticConcept {
	
	String name;
	static int age;

	public static void main(String[] args) {

		//1. how to call static stuff:
		//a. use them directly:
		age = 25;
		System.out.println(age);
		getName();

		//b. call by class name:
		StaticAndNonStaticConcept.age = 30;
		System.out.println(StaticAndNonStaticConcept.age);
		StaticAndNonStaticConcept.getName();
		
		
		//2. how to call non static stuff: create the object:
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.name = "Tom";
		System.out.println(obj.name);
		
		obj.search();
		
		obj.getName();
		System.out.println(obj.age);
		
		
	}
	
	
	public void search(){
		System.out.println("search method");
	}
	
	public static void getName(){
		System.out.println("get name method");
	}
	
	
	
	
	
	
	
	

}
