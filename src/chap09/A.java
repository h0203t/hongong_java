package chap09;

public class A {
	
	A(){
		System.out.println("A객체 생성");
	}
	
	class B {
		int field1;
		static int field2;
		
		
		B(){
			System.out.println("B객체 생성");
		}
		
		void method1() {
			System.out.println("B메소드 생성");
		}
		
		static void method2() {
			System.out.println("B메소드 생성");
		}
	}
	
	
}
