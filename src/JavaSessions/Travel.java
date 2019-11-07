package JavaSessions;

public class Travel {

	public static void main(String[] args) {

		Travel e = new Travel();
		e = null;

		// requesting JVM to call GC:
		System.gc();
		System.out.println("processing done....");

	}

	@Override
	public void finalize() {
		System.out.println("this is my finalize method");
	}

}
