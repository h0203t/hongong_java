package chap05;

public class ArrayMain {

	public static void main(String[] args) {
		
		int[] scores = {1,2,3}; // 배열 초기화
		System.out.println(scores.length);
		
		//배열 변수 선언 -> 배열생성
		int[] scores2;
		scores2 = new int[] {90,95,100};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("배열의 합 : " + sum);
		
		//배열의 평균 구하기
		int avg = sum / scores.length;
		System.out.println("배열의 평균 : " + avg);
		
		//배열의 최대값, 최소값 구하기
		int max = scores[0];
		int min = scores[0];
		for(int i=0; i<scores.length; i++) {
			//최대값 구하기
			if(max < scores[i]) max = scores[i];
			
			//최소값 구하기
			if(min > scores[i]) min = scores[i];
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		//다차원 배열
		int[][] arr2 = {
				{1,2}, // 1행 2열
				{3,4,5,6} // 2행 4열
		};
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(i+1 + "행");
			for(int j=0; j<arr2[i].length; j++) {
				System.out.println("\t" + (j+1) + "열" + (arr2[i][j]));
			}
		}
		
	}

}
