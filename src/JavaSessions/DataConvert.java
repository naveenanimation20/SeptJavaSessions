package JavaSessions;

public class DataConvert {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x + 20);

		int i = Integer.parseInt(x);// 100
		System.out.println(i+20);
		
		String y = "12.33";
		System.out.println(y+100);
		
		double d = Double.parseDouble(y);
		System.out.println(d+100);
		
//		String p = "100A";
//		System.out.println(p+100);
//		
//		int k = Integer.parseInt(p);//NumberFormatException
//		System.out.println(k+200);
		
		
		int m = 100;
		System.out.println(m+20);
		String n = String.valueOf(m); //"100"
		System.out.println(n+200);
		

	}

}
