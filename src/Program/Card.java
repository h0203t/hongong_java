package Program;

import java.util.Scanner;

public class Card {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		int cardMoney = 0;
		int money;
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.충전 | 2.사용 | 3.잔액조회 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			
			int SelectNum = sc.nextInt();
			
			switch(SelectNum) {
				case 1:
					System.out.println("충전 금액을 입력해주세요> ");
					money = sc.nextInt();
					cardMoney += money;
					break;
				case 2:
					System.out.println("사용금액 : ");
					money = sc.nextInt();
					if(cardMoney < money) {
						System.out.println("잔액이 부족합니다.");
						System.out.println("사용 가능액 : " + cardMoney);
					} else cardMoney -= money;
					break;
				case 3:
					System.out.println("현재 잔액 : " + cardMoney);
					break;
				case 4:
					run = false;
					System.out.println("저희 카드를 이용해 주셔서 감사합니다!");
			}
		}
		sc.close();
	}

}
