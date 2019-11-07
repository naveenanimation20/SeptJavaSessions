package Test;

public class Zoom {

	public static void main(String[] args) {

		Meeting m = new Meeting(450, "test1234");
		
		System.out.println(m.id);
		m.start();
		System.out.println(m.studentCount);
		System.out.println(m.isRecorded);
		
		
	}

}
