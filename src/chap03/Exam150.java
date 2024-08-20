package chap03;

import java.util.Scanner;

public class Exam150 {

	public static void main(String[] args) {
		//p150
		//4번
		//연필 534, 학생수 30명
		//똑같이 나눠주는 연필 수, 나머지 몇개
//		
//		int pencils = 534;
//		int students = 30;
//		
//		int pencilsPerStudent = (pencils / students);
//		System.out.println(pencilsPerStudent);
//		
//		int pencilsLeft = (pencils % students);
//		System.out.println(pencilsLeft);
//		
//		//6번
//		int value = 365;
//		value = value / 100;
//		System.out.println(value * 100);
//		
//		//9번
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("첫 번째 수: ");
//		double 첫번째 = sc.nextDouble();
//		System.out.println("두 번째 수: ");
//		double 두번째 = sc.nextDouble();
//		
//		if(두번째 == 0 || 두번째 == 0.0) System.out.println("결과 : 무한대");
//		else System.out.println(첫번째 / 두번째);
//		
		//11번
		System.out.println("아이디 :");
		String name = sc.nextLine();
		
		System.out.println("패스워드 :");
		String strPassword = sc.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패 : 아이디 존재하지 않음");
		}
		
	}

}
