package chap06;

public class CarMain {

	public static void main(String[] args) {
		//외부에서 필드 사용
		//객체 생성
		Car myCar = new Car();
		Car myCar2 = new Car("자가용");
		
		
		//객체가 가지고 있는 필드, 메소드 사용
		System.out.println(myCar.company);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		
		//필드값 수정
		myCar.speed = 60;
		System.out.println(myCar.speed);

	}

}
