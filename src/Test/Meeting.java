package Test;

public class Meeting {

	public int id;
	private String password;
	int studentCount = 100;
	protected boolean isRecorded = true;

	public Meeting() {

	}

	public Meeting(int id, String password) {
		this.id = id;
		this.password = password;
	}

	public void start() {
		System.out.println("meeting start");
	}

	private void chat() {
		System.out.println("meeting chat");
	}

	public static void main(String a[]) {

		Meeting m = new Meeting(123, "test123");

		System.out.println(m.id);
		System.out.println(m.password);

		m.start();
		m.chat();

		System.out.println(m.studentCount);
		System.out.println(m.isRecorded);

	}

}
