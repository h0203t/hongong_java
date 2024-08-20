package chap03;

public class Operator {

	public static void main(String[] args) {

		//연산자
		//부호연산 -> 연산
		byte su = 10;
		byte su2 = -10;
		System.out.println(su2);

		int v1 = 5;
		int v2 = 2;
		
		System.out.println(v1 /v2);
		System.out.println(v1 % v2);
		System.out.println((double)v1 / v2);
		System.out.println((double)(v1 / v2));
		
		//복합연산자
		System.out.println(2 ^ 1); // 베타적 논리합 다르면 1, 같으면 0
		System.out.println(2 % 1); // 논리곱 둘다 1이면 1, 0이 하나라도 있으면 0
		System.out.println(2 | 1); // 논리합 둘다 0이면, 1이 하나라도 있으면 1
		
	}

}
