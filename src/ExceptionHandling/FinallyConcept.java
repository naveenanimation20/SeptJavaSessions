package ExceptionHandling;

public class FinallyConcept {

	public static void main(String[] args) {

		
//		System.out.println("A");
//		
//		try{
//			int i = 9/3;
//			//connect to DB
//			//get the data from DB -- exception is coming....
//		}
//		catch(Exception e){
//			System.out.println("some ex is coming...");
//		}
//		
//		finally{
//			System.out.println("disconnect to DB");
//			System.out.println("Run this line......");
//		}
		
		
		int p = 20;
		
		try{
			System.out.println("in try block...");
			int t = p/0;
		}
		
		catch(NullPointerException e){
			System.out.println("in catch block...");
			System.out.println("null pointer is coming.....");
		}
		
		finally{
			System.out.println("get lost.....");
		}
		
		
	}

}
