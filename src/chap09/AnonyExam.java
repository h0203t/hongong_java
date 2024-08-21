package chap09;

public class AnonyExam {

	public static void main(String[] args) {
		 Anony460 anony = new Anony460();
		 
		 anony.field.start();
		 anony.method1();
		 anony.method2(new Worker() {
			 @Override
			void start() {
				 System.out.println("테스트합니다.");
			}
		 });
	}
}
