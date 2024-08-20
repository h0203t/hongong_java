package chap07;

public class People {
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public void print() {
		System.out.println("부모클래스 출력");
	}
}
