package ExceptionHandling;

import java.io.IOException;

public class TryCatchConcept {
	String name = "Tom";

	public static void main(String[] args) {
		TryCatchConcept obj = new TryCatchConcept();

		System.out.println("A");

		System.out.println("B");

		// JVM will throw an exception withthe help of :
		// 1. it will create the object of Exception class
		// 2. it will print the exception info with the help of stack trace and
		// exception handler

		try {
			// obj=null;
			System.out.println(obj.name);
			int i = 9 / 0;

		} catch (ArithmeticException e) {
			System.out.println("some exception occurred....");
			e.printStackTrace();
			System.out.println(e.getMessage() + " exception got occurred...");
		} catch (NullPointerException e1) {
			e1.printStackTrace();
		}

		System.out.println("C");
		System.out.println("C");
		System.out.println("C");
		System.out.println("C");

		try {
			int p = 9 / 0;
		} catch (Throwable e) {
			e.printStackTrace();
		}

	}

}
