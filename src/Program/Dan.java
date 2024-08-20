package Program;

public class Dan {

	public static void main(String[] args) {
        // 단 번호 출력
        for (int j = 2; j <= 9; j++) {
            System.out.print(j + "단\t\t");
        }
        System.out.println();

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
            }
            System.out.println();
        }
    }
}