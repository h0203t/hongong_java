package Program;

public class Student {

	// 필드
	private int number;
	private String name;
	private int score;

	// 생성자
	public Student(int number, String name, int score) {
		this.number = number;
		this.name = name;
		this.score = score;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

}
