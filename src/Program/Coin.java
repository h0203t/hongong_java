package Program;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("## 교환할 금액 :");
		int money = sc.nextInt();
		int remainder = money / 500 * 500 + (money % 500) / 100 * 100 + (money % 100) / 50 * 50 + (money % 50) / 10 * 10;
		
		System.out.println("500원 짜리 " + money / 500 + "개");
		System.out.println("100원 짜리" + (money % 500) / 100 + "개");
		System.out.println("50원 짜리" + (money % 100) / 50 + "개");
		System.out.println("10원 짜리" + (money % 50) / 10 + "개");
		System.out.println(money - remainder);
	}

}
