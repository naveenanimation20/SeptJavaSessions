package AbstractConcept;

public abstract class Page {

	// abstract methods and non abstract methods
	// can not create the object of abstract class

	// abst class constructor can be called, but it will be called with child
	// class object creation.
	public Page() {
		System.out.println("Page Class Const....");
	}

	public abstract void header();

	public abstract void title();

	public final void logout() {
		System.out.println("user logged out");
	}
	
	public static void signUp(){
		System.out.println("page -- sign up");
	}

}
