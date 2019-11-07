package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {

		//limitation of array:
		//1. size is fixed: static array: to solve this problem, we use dynamic array : ArrayList
		//2. can store only similar types of values: to solve this problem, we can use static object array
		
		//1. int array:
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		System.out.println(i[0]+i[2]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		//System.out.println(i[-1]);
		
		System.out.println(i.length);
		
		//print all the values from an array: for loop:
		for(int k=0; k<=i.length-1; k++){
			System.out.println(i[k]);//10 20 30 40 
		}
		
		
		//2. double array:
		double d[] = new double[2];
		System.out.println(d.length);
		d[0] = 12.33;
		d[1] = 100;
		
		System.out.println(d[0]+ "test" + d[1]);
		
		//3. String array:
		String names[] = new String[3];
		names[0]="Nikhil";
		names[1]="Godo";
		names[2]="Anusha";
		
		System.out.println(names[2]);
		
		for(int n=0; n<names.length; n++){
			System.out.println(names[n]);
		}
		
		for(String n: names){
			System.out.println(n);
		}
		
		//4. Object Array:
		Object emp[] = new Object[5];
		emp[0]="Godo";
		emp[1]=21;
		emp[2]='m';
		emp[3]=true;
		emp[4]=5.5;
		
		System.out.println(emp[4]);
		for(int count=0; count<emp.length; count++){
			System.out.println(emp[count]);
		}
		
		
				
	}

}
