package JavaSessions;

public class EmployeeTest {

	public static void main(String[] args) {

		
		EmployeeData e1 = new EmployeeData("Steve", 2, 25, "Admin", 2000);
		
		System.out.println(e1.name);

		e1.getEmployeeName();

		e1.setSalary(5000);
		System.out.println(e1.getSalary());
		
		
		
	}

}
