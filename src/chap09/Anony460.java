package chap09;

public class Anony460 {
	Worker field = new Worker() {
		@Override
		void start() {
			System.out.println("디자인을 합니다.");
		}
	};
	
	void method1() {
		Worker localVar = new Worker() {
			@Override
			void start() {
				System.out.println("개발을 합니다.");
			}
		};
		localVar.start();
	}
	
	void method2(Worker worker) {
		worker.start();
	}
}
 