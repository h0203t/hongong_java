package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentData {
	
	List<Student> students = new ArrayList<Student>();
	
	Scanner sc = new Scanner(System.in);
	
	public List<Student> students(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.println(i + "번째 학생 정보 입력");
			System.out.print("학번 > ");
			int number = sc.nextInt();
			
			sc.nextLine();
			System.out.print("이름 > ");
			String name = sc.nextLine();
			
			System.out.print("점수 > ");
			int score = sc.nextInt();

			students.add(new Student(number, name, score));
		}
		return students;
	}
}
