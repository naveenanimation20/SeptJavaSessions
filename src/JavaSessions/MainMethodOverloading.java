package JavaSessions;

public class MainMethodOverloading {

	public static void main(String arg[]) {

		main(10);

	}

	public static void main(int a) {
		System.out.println(a);
		main(20, 30);

	}

	public static void main(int a, int b) {
		System.out.println(a + b);
	}

	public void login() {

	}

	public static void login(int otp) {

	}

}
