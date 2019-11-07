package JavaSessions;

public class TwoDimArray {

	public static void main(String[] args) {

		// 10 20 30
		// 31 40 50
		// 41 50 60
		
		int data[][] = { {10,20,30}, {40, 50, 60}, {70,80,90} };

		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
