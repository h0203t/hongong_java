package chap07;

public class Singleton {
	
	private static Singleton st = new Singleton();
	
	String name = "홍길동";
	
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		return st;
	}
}
