package chap04;

import java.util.Scanner;

public class Exam182 {

	public static void main(String[] args) {
		//2번 문제
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		//4번 문제
		
		//5번 문제
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("========");
		
		//6번 문제
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
		
		//7번 문제
        boolean run = true;
        int balance = 0;
        Scanner sc = new Scanner(System.in);
        
        while(run) {
        	System.out.println("=============================");
        	System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
        	System.out.println("=============================");
        	
        	System.out.print("선택 > ");
        	int pick = sc.nextInt();
        	
        	switch (pick) {
        		case 1:
        			System.out.print("예금액> ");
                	int inMoney = sc.nextInt();
                	balance += inMoney;
                	break;
        		case 2:
        			System.out.println("출금액> ");
        			int outMoney = sc.nextInt();
        			
        			if(balance >= outMoney) balance -= outMoney; 
        			else System.out.println("돈이 부족합니다.");
                	break;
        		case 3:
        			System.out.println("잔고 :"+balance);
                	break;
        		case 4:
        			run = false;
                	System.out.println("프로그램 종료");
			}

        }
        sc.close();
	}
}
