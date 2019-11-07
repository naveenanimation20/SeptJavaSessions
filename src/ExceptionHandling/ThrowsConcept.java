package ExceptionHandling;

public class ThrowsConcept {

	public static void main(String[] args) {
		ThrowsConcept obj = new ThrowsConcept();

		try {
			obj.m1();
		}
		catch(Exception e){
			e.printStackTrace();
			//screenshot method
		}

		System.out.println("ABC");

	}

	public void m1() throws Exception {
		m2();
	}

	public void m2() throws Exception {
		int i = 9 / 0;
	}

}
