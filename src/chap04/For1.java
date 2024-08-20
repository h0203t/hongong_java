package chap04;

public class For1 {

	public static void main(String[] args) {
//		
//		for(int i=2; i<=5; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i + "*" + j + "=" + i * j);
//			}
//			System.out.println();
//		}
		
		int i = 0;
		int sum = 0;
		while(sum<200) {
			i++;
			sum += i;
		}
		System.out.println("1에서 " + i + "까지 합 = " + sum);
	}

}
