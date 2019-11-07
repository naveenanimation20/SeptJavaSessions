package ConstructorChaining;

public class RealState extends Business {

	public RealState(String type, int revenue, String branches) {
		super(type, revenue, branches);
	}

	private RealState() {
		super();
		System.out.println("Real State---default const....");

	}

	public static void main(String[] args) {
		RealState rs = new RealState("realstate", 10000, "Bangalore");
		System.out.println(rs.type);
		
		RealState rs1 = new RealState();
		
		
	}

}
