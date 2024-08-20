package chap06;

public class CalcMain {

	public static void main(String[] args) {
		
		Calc272 myCalc = new Calc272();

		myCalc.powerOn();
		
		int result = myCalc.plus(1, 2);
		System.out.println(result);
		
		result = myCalc.mult(10, 20);
		System.out.println(result);
	}

}
