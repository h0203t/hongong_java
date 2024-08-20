package chap08;

public class CarMain {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frountLeftTire = new HankookTire();
		myCar.frountRightTire = new KumhoTire();
		
		myCar.run();
		
		HankookTire hk = (HankookTire)myCar.frountLeftTire;
		
//		myCar.frountLeftTire.print();
		
		hk.print();

	}

}