package AbstractConcept;

public class TestPage {

	public static void main(String[] args) {

		Page.signUp();
		
		LoginPage lp = new LoginPage();
		
		lp.header();
		lp.title();
		HomePage hp = lp.login("admin", "admin");
		hp.header();
		hp.title();
		hp.userDetails();
		hp.logout();
		
		
		Page p = new LoginPage();
		Page p1 = new HomePage();
		p.header();
		p.title();
		p.logout();
		
			

	}

}
