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
	
	static class C {
		int field1;
		static int field2;
		C(){
			System.out.println("C객체 생성");
		}
		
		void method1() {
			System.out.println("C 메소드 1실행");
		}
		static void method2() {
			System.out.println("C 메소드2 실행");
		}
	}
	
	class D {
		
		D() {
			System.out.println("D 객체 생성");
		}
	}
}
