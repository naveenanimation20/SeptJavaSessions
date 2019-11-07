package JavaSessions;

public class Search {

	public static void main(String[] args) {

		Search s = new Search();
		s.search("Apple Mac Book");
		
		int finalPrice = s.search("Apple Mac Book", 50000);
		System.out.println("final price is: "+ finalPrice);
	}
	
	
	public void search(String name){
		System.out.println("search is done by "+ name);
		
	}
	
	public int search(String name, int price){
		System.out.println("search is done by "+ name);
		System.out.println("search is done by "+ price);
		
		int totalPrice = price-100;
		return totalPrice;

	}
	
	
	
	
	

}
