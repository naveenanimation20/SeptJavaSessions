package JavaSessions;

public class Login {

	String username;
	String password;
	String emailId;
	int otp;
	long mobileNumber;
	String facebookId;

	public Login(String username, String password, String emailId, int otp, long mobileNumber, String facebookId) {
		this.username = username;
		this.password = password;
		this.emailId = emailId;
		this.otp = otp;
		this.mobileNumber = mobileNumber;
		this.facebookId = facebookId;
	}

	public Login(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Login(String emailId, int otp) {
		this.emailId = emailId;
		this.otp = otp;
	}

	public Login() {
		
	}
	
	public void doLogin(){
		System.out.println("login with: "+ emailId + " " + otp);
	}

	public static void main(String[] args) {

		Login l1 = new Login("naveen@gmail.com", 1234);
		l1.doLogin();
		
		int fact = 1;
		for(int i = 1; i<=6; i++){
			fact = fact * i;
		}
		
		System.out.println(fact);
		
	}

}
