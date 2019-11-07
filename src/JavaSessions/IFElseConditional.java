package JavaSessions;

public class IFElseConditional {

	public static void main(String[] args) {

		int a = 30;
		int b = 20;

		if (b > a) {
			System.out.println("b is greater than a");
		}

		else {
			System.out.println("a is greater than b");
		}

		int num = 25;
		if (num < 20) {
			System.out.println("PASS");
		}

		if (num < 15) {
			System.out.println("Bye");
			if (num < 10) {
				System.out.println("Fail");
				if (num < 2) {
					System.out.println("Repeat");
				} else {

				}
			} else {

			}
		}

		else {

		}

		int p = 100;
		int q = 200;
		if (p == q) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		// < <= >= == !=

		if (p != q) {
			System.out.println("Bye");
		}

		String s1 = "Hello";
		String s2 = "Hello";

		if (s1.equals(s2)) {
			System.out.println("PASS");
		}

		// IF ElseIF ladder
		int number = 20;
		if (number == 10) {
			System.out.println("num is 10");
		}

		else if (number == 15) {
			System.out.println("num is 15");
		}

		else if (number == 20) {
			System.out.println("num is 20");
		}

		String browser = "test";
		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		} else if (browser.equals("ff")) {
			System.out.println("launch ff");
		}

		else {
			System.out.println("wrong browser, please pass the correct browser name...");
		}

		// dead code:
		if (true) {
			System.out.println("PASSSSS");
		} else {
			System.out.println("FAILLLLLLLL");
		}

		boolean t = false;
		if (!t) {
			System.out.println("testtttt");
		} else {
			System.out.println("heyyyyy");
		}

	}

}
