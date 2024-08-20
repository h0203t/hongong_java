package chap07;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
	@Override
	public void print() {
		System.out.println("자식 클래스 출력");
	}
}