package JavaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

//		int i = 9;
//		int j = 0/0;
//		System.out.println(j);
		
		int num = 10;
		
		switch (num) {
		
		case 10:
			System.out.println(10);
			break;
			
		case 20:
			System.out.println(20);
			break;
			
		default:
			System.out.println("number not found");
			break;
		}
		
		
		if(num==10){
			System.out.println(10);
		}
		 if(num==20){
			System.out.println(10);
		}
		else{
			System.out.println("number not found");
		}
		
		
	}

}
