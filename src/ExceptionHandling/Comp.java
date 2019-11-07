package ExceptionHandling;

public class Comp {

	public static void main(String[] args) {

		int s = revenue();
		System.out.println(s);

	}

	public static int revenue() {
		try {
			int p = 100;
			int T = p + 200;
			int total = T/10;
			return total;
		} catch (Exception e) {
			System.out.println("some exception....");
		}
		
		finally{
			return 0;
		}

	}

}
