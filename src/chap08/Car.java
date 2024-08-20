package chap08;

public class Car {

	Tire frountLeftTire = new HankookTire();
	Tire frountRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		frountLeftTire.roll();
		frountRightTire.roll();
		backLeftTire.roll();
		backLeftTire.roll();
	}

}
