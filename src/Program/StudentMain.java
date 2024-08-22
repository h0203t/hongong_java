package Program;

import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentData data = new StudentData();
		List<Student> list = null;
		double avgScore = 0.0;
		double sum = 0.0;
		Student maxScore;
		Student minScore;

		Scanner sc = new Scanner(System.in);
		int studentCount = 0;
		
		boolean run = true;
		
		while(run) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("1.학생수 입력   2.학생정보 등록   3.학생정보 전체조회   4.학생정보 분석   5.종료");
			System.out.println("---------------------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNum = sc.nextInt();
			
			switch(selectNum) {
				case 1:
					System.out.print("학생 수 > ");
					studentCount = sc.nextInt();
					break;
				case 2:
					list = data.students(studentCount);
					break;
				case 3:
					for(int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i).getNumber() + " 학번 점수 : " + list.get(i).getScore() +"점");
					}
					break;
				case 4:
					maxScore = list.get(0);
					minScore = list.get(0);
					for (Student student : list) {
			            if (student.getScore() > maxScore.getScore()) {
			            	maxScore = student;
			            }
			            if (student.getScore() < maxScore.getScore()) {
			            	minScore = student;
			            }
			            avgScore += student.getScore();
			            
			        }
					avgScore = avgScore / studentCount;
					
			        avgScore = Math.round(avgScore * 100.0) / 100.0;
			        					
					System.out.println("최고점수 : " + maxScore.getScore() + "점");
					System.out.println("최소점수 : " + minScore.getScore() + "점");
					System.out.println("평균점수 : " + avgScore + "점 입니다.");
					break;
				case 5:
					System.out.print("프로그램 종료");
					run = false;
			}
			
		}
	}

}
