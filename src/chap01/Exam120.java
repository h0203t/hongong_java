package chap01;

import java.util.Scanner;

public class Exam120 {

	public static void main(String[] args) {
		
		//1번 문제
		String name = "김자바";
		int age = 12;
		String tel = "123-123-123";
		
		System.out.println("이름:" + name);
		System.out.print("나이:" + age + "\n");
		System.out.printf("전화:%s\n", tel);
		
		//2번 문제
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 수:");
		String strNum1 = sc.nextLine();
		
		System.out.println("두 번째 수:");
		String strNum2 = sc.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과 : " + result);
		
		//3번 문제
		System.out.println("이름 :");
		String name2 = sc.nextLine();
		System.out.println("주민번호 앞 6자리 :");
		String jumin = sc.nextLine();
		System.out.println("전화번호 :");
		String tle2 = sc.nextLine();
		
		System.out.println("이름:" +  name2);
		System.out.println("주민번호 앞6자리:" +  jumin);
		System.out.println("전화번호:" +  tle2);
		
		sc.close();
	}

}
