package chap09;

public class AnonyMain {

	public static void main(String[] args) {
		Anony anony = new Anony();
		
		anony.field.wake();
		anony.method1();
		anony.method2(
				new Person() {
					void study() {
						System.out.println("공부합니다.");
					}
					
					@Override
					void wake() {
						System.out.println("8시에 일어납니다.");
					}
				});
	}

}
