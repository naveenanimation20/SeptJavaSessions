package JavaSessions;

public class CompanyTest {

	public static void main(String[] args) {

		Company obj = new Company();
		
		obj.setName("IBM");
		obj.setTotalEmp(5000);
		obj.setBudget(10000);
		obj.setProjects("AI - ROBOTICS");
		
		System.out.println(obj.getName());
		System.out.println(obj.getProjects());
		System.out.println(obj.getBudget());
		System.out.println(obj.getTotalEmp());
		
		
		
		
		
		
	}

}
