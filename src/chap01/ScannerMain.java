package chap01;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("나이를 입력해주세요.");
		int age = sc.nextInt();
		System.out.println(age);
		
		sc.close();

		System.out.printf("이름은:%s, 나이는:%d", name, age);
	}

}
