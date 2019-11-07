package JavaSessions;

public class IncrementAndDecrement {

	public static void main(String[] args) {

		
		//++ -- 
		int i = 1;
		int j = i++; //post increment
		
		System.out.println(i);//2
		System.out.println(j);//1
		
		int p = 99;
		int q = p++;
		
		System.out.println(p);//100
		System.out.println(q);//99
		
		
		int m = 1;
		int n = ++m; //pre increment
		System.out.println(m);//2
		System.out.println(n);//2
		
		
		int h = 2;
		int g = h--; //post decrement
		System.out.println(h);//1
		System.out.println(g);//2
		
		
		int c = 2;
		int d = --c;//pre decrement
		System.out.println(d);//1
		System.out.println(c);//1
		
		int v = 1;
		//v = v+2;
		 v+=2;
		 System.out.println(v);
		 
		 
		 int s = -1;
		 int z = ++s;
		 System.out.println(s);
		 System.out.println(z);
		 
	}

}
