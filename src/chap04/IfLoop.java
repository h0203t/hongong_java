package chap04;

import java.util.Scanner;

public class IfLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A");	
		} else if (score >=80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
		int time = (int)(Math.random() * 4) + 8;
		
	}

}
