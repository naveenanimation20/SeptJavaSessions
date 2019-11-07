package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

		// 1 to 10
		//two types of loops: 
		//1. while/for/do while
		//2. infinite loop/storage of memory loop : pitfalls loops in java
		
		//1. while:
		int i = 1;//initialization
		while(i<=10){//conditional
			System.out.println(i);//1 
			i++;//incremental/decremental
		}
		
		//2. for loop:
		for(int j=1; j<=10; j++){
			System.out.println(j);//1 2 3 ... 10 
		}
		
//		for( ; ; ){
//			System.out.println("Test");
//		}
		
		//3. do-while:
		int k = 1;
		do{
			System.out.println(k);
			k++;
		}
		while(k<=10);
		
		//10 to 1:
		for(int m=10; m >=1; m--){
			System.out.println(m);//10 9 8 7 
		}
		
	}

}
