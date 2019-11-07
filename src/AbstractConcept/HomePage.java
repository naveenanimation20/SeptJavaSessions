package AbstractConcept;

public class HomePage extends Page {
	
	public HomePage(){
		System.out.println("HP -- Const...");
	}

	@Override
	public void header() {
		System.out.println("HP -- header");
	}

	@Override
	public void title() {
		System.out.println("HP -- title");

	}

	public void userDetails() {
		System.out.println("HP -- user details");
	}

}
