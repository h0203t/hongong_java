package chap04;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		//1~50 난수 발생
		int number = (int)(Math.random() * 50) + 1;

		Scanner sc = new Scanner(System.in);
		
		int count=0;
		
		//반목문
		while(true) {
			
			int myNumber = sc.nextInt();
			
			count++;
			
			if(number == myNumber) {
				System.out.println("축하합니다~" + count);
				break;
			} else if(number < myNumber) {
				System.out.println("다운 하세요.");
			} else {
				System.out.println("업 하세요.");
			}
		}
		System.out.println("게임 오버ㅜ-ㅜ");
		
		sc.close();
	}


}
