package chap09;

public class AMain {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		
		System.out.println(b.field1);
		b.method1();
		System.out.println(b.field2);
		A.B.method2();
	}

}
