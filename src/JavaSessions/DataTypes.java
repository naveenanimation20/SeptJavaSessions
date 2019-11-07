package JavaSessions;

/**
 * 
 * @author NaveenKhunteta
 *
 */

//hi this is my first java code
/*hi this is
my java code
and im so happy*/

public class DataTypes {

	public static void main(String[] args) {

		//primitive data types: byte, short, int, long, char, double, float, boolean
		//data types:
		//numeric data types: 
		//byte, short, int, long -- Integer Family
		
		//size: 1 byte: 8 bits
		//range: -128 to 127
		byte b = 120;
		byte b1 = -1;
		System.out.println(b);
		
		byte t = 10;
		 t = 20;
		t = 30;
		System.out.println(t);
		
		//short:
		//size: 2 bytes: 16 bits
		//Range: -32768 to 32767
		short s = 20;
		
		//int:
		//size:4 bytes : 32 bits
		//Range: 
		int i = 100;
		int i1 = -100;
		int j = 0;
		
		System.out.println(j);
		
		//long:
		//size:8 bytes : 64 bits
		//range:
		long l = 12000009999999l;
		System.out.println(l);
		long distance = 100000;
		
		//Double: 8 bytes: 64 bits
		double d1 = 12.33;
		//4 bytes: 32 bits
		float f1 = 12.34f;
		float f2 = (float) 4.55;
		System.out.println(f1);
		//char: 2 bytes
		char c1 = 'a';
		char c2 = '1';
		char c3 = '$';
		System.out.println(c3);
		
		//boolean: ~1 bit
		boolean b11 = true;
		boolean b2 = false;
		
		//String: its a class in java
		String st = "hello world";
		String st1 = "hi this is my java code";
		String st2 = "1000";
		String st3 = "12.33";
		
		System.out.println(st1);
		
		System.out.println("hello selenium");
		System.out.println(1000);
		System.out.println(100+200);
		
		System.out.println(st);
		System.out.println("Hello World");
		
		
		for(int ss=0; ss<=9; ss++){
			for(int x=0; x<=9; x++){
				System.out.print(ss+""+x+" ");
			}
			System.out.println();
		}
		
	}

}
