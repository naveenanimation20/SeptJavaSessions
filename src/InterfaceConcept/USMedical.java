package InterfaceConcept;

public interface USMedical extends WHO{

	int min_fee = 10;

	public void orthopedicServices();

	public void dentalServices();

	public void nueroServices();

	public void ambulanceServices();
	
	//private void test(); //not allowed

	// no method body -- 100% abstraction
	// only method declaration/ method prototype
	// no static methods in Interface for prototype methods
	// but interface vars static and final in nature by default
	// can not create the object of interface

	// After JDL 1.8:
	// 1. can have method body: with default method
	default void Services_911() {
		System.out.println("US -- 911 services");
	}
	
	//2. can have static methods in Interface
	public static void billing(){
		System.out.println("US - Billing");
	}

}
