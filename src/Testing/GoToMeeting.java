package Testing;

import Test.Meeting;

public class GoToMeeting extends Meeting{
	
	public GoToMeeting(){
		super();
	}
	
	public GoToMeeting(int id, String password) {
		super(id, password);
	}

	public static void main(String[] args) {

		Meeting m = new Meeting(3433, "test1234");
		
		System.out.println(m.id);
		m.start();

		GoToMeeting go = new GoToMeeting(4555, "test123456");
		System.out.println(go.isRecorded);
		
		
	}

}
