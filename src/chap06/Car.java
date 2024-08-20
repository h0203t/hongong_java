package chap06;

public class Car {
	
	//필드 : 객체의 속성(데이터)
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	//생성자 : 객체를 생성, 객체의 필드값을 초기화
	Car(){
	}
	Car(String model){
		this(model, "은색", 250);
	}
	Car(String model, String color){
		this(model, color, 250);
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	//생략하면 컴파일러가 기본 생성자 만들어줌
	
	//메소드 : 객체의 동작

}
