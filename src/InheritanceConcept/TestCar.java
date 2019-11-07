package InheritanceConcept;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.autoAirSuspension();
		b.engine();
		
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();

		//Top Casting:
		Car c1 = new BMW();//child class object can be referred by parent class ref variable
		c1.start();		
		c1.stop();
		c1.refuel();
		
		Vehicle v1 = new Car();
		Vehicle v2 = new BMW();
		
		//down casting:
	//	BMW b1 = (BMW) new Car();//ClassCastException
		
		
		
	}

}
