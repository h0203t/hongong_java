package Program;

import java.util.Scanner;

public class OnDo {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // 메뉴 출력
            System.out.println("온도 변환 프로그램");
            System.out.println("1. 화씨 -> 섭씨");
            System.out.println("2. 섭씨 -> 화씨");
            System.out.println("3. 종료");
            System.out.print("선택: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // 화씨 -> 섭씨 변환
                    System.out.print("화씨 온도 입력: ");
                    double fahrenheit = sc.nextDouble();
                    double celsius = 5.0 / 9.0 * (fahrenheit - 32);
                    System.out.println("섭씨 온도: " + celsius);
                    break;
                case 2:
                    // 섭씨 -> 화씨 변환
                    System.out.print("섭씨 온도 입력: ");
                    celsius = sc.nextDouble();
                    fahrenheit = 9.0 / 5.0 * celsius + 32;
                    System.out.println("화씨 온도: " + fahrenheit);
                    break;
                case 3:
                    // 종료
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    // 유효하지 않은 선택
                    System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
            }
            System.out.println(); // 줄바꿈
        } while (choice != 3);

        sc.close();
    }
}