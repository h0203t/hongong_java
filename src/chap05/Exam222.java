package chap05;

public class Exam222 {

	public static void main(String[] args) {
		
		int[][] array = {
				{1, 2},
				{3, 4, 5},
				{6, 7, 8, 9, 10}
		};

		
		int sum = 0;
		double avg = 0;
		int count = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = sum / (double)count;
		System.out.println("sum : " + sum);
		System.out.println("avg : " + sum / avg);
	}

}

