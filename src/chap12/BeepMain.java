package chap12;

public class BeepMain {
	public static void main(String[] args) {
		Runnable beepTest = new BeepTest();
		Thread thread = new Thread(beepTest);
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("8");
			try {
				Thread.sleep(500);
				
			} catch (Exception e) {
				System.out.println("인터럽트 발생");
			}
		}
	}
}
