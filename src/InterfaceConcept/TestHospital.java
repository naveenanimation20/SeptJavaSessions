package InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fs = new FortisHospital();
		fs.ambulanceServices();
		fs.cardioServices();
		fs.dentalServices();
		fs.emergencyServices();
		fs.ENTServices();
		fs.medicalInsurance();
		fs.nueroServices();
		fs.orthopedicServices();
		fs.OPTServices();
		fs.pathologyServices();
		fs.physioServices();
		fs.Services_911();
		fs.doctor();
				
		//Top Casting:
		USMedical us = new FortisHospital();//child class object can be referred by parent interface ref var
		us.ambulanceServices();
		us.orthopedicServices();
		us.dentalServices();
		us.nueroServices();
		us.Services_911();
		System.out.println(USMedical.min_fee);
		System.out.println(fs.min_fee);
		
		USMedical.billing();
		
		
		System.out.println( us.getClass().getSimpleName());
	}

}
