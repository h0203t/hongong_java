package chap08;

public class RcMain {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Tv();
		rc.turnOn();
		rc.setVolume(5);
		rc.setVolume(20);
		rc.turnOff();
		
		System.out.println("=======");
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.setVolume(-20);
		rc.turnOff();
		
		System.out.println("=======");
		
		rc = new SmartTv();
		rc.turnOn();
		rc.setVolume(5);
		rc.setVolume(-20);
		rc.turnOff();
		
		System.out.println("=======");
		
		Searchable sr;
		sr = new SmartTv();
		sr.search("www.naver.com");
		
		System.out.println("=======");
		System.out.println("1.필드에 사용");
		MyClass mc = new MyClass();
		mc.rc.turnOn();
		mc.rc.setVolume(6);
		mc.rc.turnOff();
		
		System.out.println("=======");
		System.out.println("2.생성자에 사용");
		MyClass mc2 = new MyClass(new Audio());
		mc2.rc.turnOff();
		
		System.out.println("=======");
		System.out.println("3.로컬 변수에 사용");
		MyClass mc3 = new MyClass();
		mc3.methodA();
		
		System.out.println("=======");
		System.out.println("4.매개 변수에 사용");
		mc3.methodB(new Tv());
	}

}
