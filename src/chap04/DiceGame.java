package chap04;

public class DiceGame {

	public static void main(String[] args) {
		//주사위 게임
		int count = 0;
		//주사위를 2개 던져서 합이 5가 되면 탈출		
		//주사위 눈의 쌍을 출력 (1, 4) 나올때 마다 출력
		while(true) {
			int dice1 = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			
			count++;
			
			if(dice1 + dice2 == 5) {
				System.out.println("축하합니다. ( " + dice1 + ", " + dice2 + " )");
				System.out.println(count + "번 만에 탈출~");
				break;
			} else {
				System.out.println("다시 돌리자. ( " + dice1 + ", " + dice2 + " )");
			}
		}
		
		
		
		//몇번만에 탈출?
		
		

	}

}
