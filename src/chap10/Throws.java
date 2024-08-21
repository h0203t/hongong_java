package chap10;

import java.util.Iterator;

public class Throws {

	public static void main(String[] args) {
		
		try {
			findclass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지않아요");
		}
		
		// 확인문제4
		String[] strArray = { "10", "2a" };
		int value = 0;
		for(int i=0; i<=2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환 불가"); 
			} finally {
				System.out.println(value);
			}
		}
		
	}
	
	public static void findclass() throws ClassNotFoundException {
		Class class1 = Class.forName("java.lang.String2");
	}

}
