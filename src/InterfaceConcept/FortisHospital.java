package InterfaceConcept;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {

	// USMedical I
	@Override
	public void orthopedicServices() {
		System.out.println("FortisHospital -- orthopedicServices");
	}

	@Override
	public void dentalServices() {
		System.out.println("FortisHospital -- dentalServices");
	}

	@Override
	public void nueroServices() {
		System.out.println("FortisHospital -- nueroServices");
	}

	@Override
	public void ambulanceServices() {
		System.out.println("FortisHospital -- ambulanceServices");
	}

	// UK Medical I
	@Override
	public void physioServices() {
		System.out.println("FortisHospital -- physioServices");

	}

	@Override
	public void ENTServices() {
		System.out.println("FortisHospital -- ENTServices");

	}

	@Override
	public void pediatricServices() {
		System.out.println("FortisHospital -- pediatricServices");
	}

	// IndianMedical I
	@Override
	public void emergencyServices() {
		System.out.println("FortisHospital -- emergencyServices");
	}

	@Override
	public void cardioServices() {
		System.out.println("FortisHospital -- cardioServices");
	}

	@Override
	public void OPTServices() {
		System.out.println("FortisHospital -- OPTServices");
	}

	// non overridden methods:
	public void medicalInsurance() {
		System.out.println("FortisHospital -- medicalInsurance");
	}
	
	public void pathologyServices(){
		System.out.println("FortisHospital -- pathologyServices");
	}

	@Override
	public void polioServices() {
		
	}
	
	
	

}
