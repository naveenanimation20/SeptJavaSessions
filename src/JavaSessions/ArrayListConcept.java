package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList<Object> ar = new ArrayList<Object>();
		System.out.println(ar.size());
				
		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size());
		
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size());
		
		ar.add(500);//4
		
		ar.add(600);//5
		
		ar.add("test");
		ar.add(12.33);
		
		ar.add("anusha");
		ar.add("xyz");
		ar.add(47383.88);
		ar.add(45);
		
		ar.remove(4);
		ar.removeAll(ar);
		ar.clear();
		System.out.println("hii"+ ar.size());

//		System.out.println(ar.get(0));
//		System.out.println(ar.get(4));
//		
//		//System.out.println(ar.get(6));//IndexOutOfBoundsException
//		
//		for(int i=0; i<ar.size(); i++){
//			System.out.println(ar.get(i));
//		}
		

		ArrayList<String> names = new ArrayList<String>();
		names.add("Rakesh");//0
		names.add("Harshad");//1
		names.add("Anusha");//2
		
		System.out.println(names.size());
		
		ArrayList<Integer> EmpAge = new ArrayList<Integer>();
		EmpAge.add(20);//0
		EmpAge.add(24);//1
		EmpAge.add(30);//2
		
		System.out.println(names.get(0) + " " + EmpAge.get(0));
		
		for(int i=0; i<names.size(); i++){
			System.out.println(names.get(i) + " "+ EmpAge.get(i));
		}
		
		
		for(String n : names){
			System.out.println(n);
		}
		
		EmpAge.forEach((a)->System.out.println(a));
		
		ArrayList<Double> heightLists = new ArrayList<Double>();
		heightLists.add(12.33);
		heightLists.add(100.00);
		
		heightLists.forEach((p)->System.out.println(p));

		
		//00 01 02 03 04 05 06 07 08 09
		//10 11 12 12 14 15
		
		for(int i=0; i<=5; i++){
			for(int j=0; j<=5; j++){
				System.out.print(i+""+j+" ");
				//00 01 02 03 04 05
				//10 11 12 13 14 15
				//20 21 22 23 24 25
			}
			System.out.println();
		}
		
		
		
	}

}
