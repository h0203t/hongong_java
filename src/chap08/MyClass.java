package chap08;

public class MyClass {
	//인터페이스 사용
	//필드
	RemoteControl rc = new Tv();
	//생성자
	MyClass(){};
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.turnOff();
	}
	//메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
	}
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
