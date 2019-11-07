package AbstractConcept;

public class LoginPage extends Page{
	
	public LoginPage(){
		System.out.println("LP -- const....");
	}

	@Override
	public void header() {
		System.out.println("LP - Header");
	}

	@Override
	public void title() {
		System.out.println("LP - title");
	}
	
//	public void logout() {
//		System.out.println("user logged out");
//	}
	
	public static void signUp(){
		System.out.println("page -- sign up");
	}

	
	
	public HomePage login(String un, String pwd){
		System.out.println("LP - login");
		System.out.println("login with "+ un + " and "+ pwd);
		
		return new HomePage();
	}
	
	
	
	
	
	
}
