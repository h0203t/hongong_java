package chap08;

public class VehicleExam {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = (Bus)vehicle;
		
		bus.run();
		bus.checkFare();
		
	}

}
