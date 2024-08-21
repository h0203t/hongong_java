package chap09;

public class Anony {

	Person field = new Person() {
		void work() {
			System.out.println("출근 합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}

	};

	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}

			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		// 로컬 변수 사용
		localVar.wake();

	}
	// 익명객체가 매개변수 값으로 전달
	void method2(Person person) {
		person.wake();
	}
}
