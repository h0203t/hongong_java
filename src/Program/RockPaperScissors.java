package Program;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            // 메뉴 출력 및 사용자 입력
            System.out.println("가위 바위 보 게임");
            System.out.println("0. 가위  1. 바위  2. 보");
            System.out.print("선택 (2보다 큰 수 입력 시 종료): ");
            int userChoice = sc.nextInt();

            // 종료 조건
            if (userChoice > 2) {
                System.out.println("Game Over");
                break;
            }

            // 컴퓨터의 선택
            int computerChoice = random.nextInt(3);

            // 선택 결과 출력
            System.out.println("당신: " + getChoiceName(userChoice) + ", 컴퓨터: " + getChoiceName(computerChoice));

            // 승부 판단
            if (userChoice == computerChoice) {
                System.out.println("비겼습니다!");
            } else if ((userChoice == 0 && computerChoice == 2) ||
                       (userChoice == 1 && computerChoice == 0) ||
                       (userChoice == 2 && computerChoice == 1)) {
                System.out.println("당신이 이겼습니다!");
            } else {
                System.out.println("컴퓨터가 이겼습니다!");
            }
            System.out.println();
        }

        sc.close();
    }

    // 숫자를 가위, 바위, 보 문자열로 변환
    private static String getChoiceName(int choice) {
        return choice == 0 ? "가위" : choice == 1 ? "바위" : "보";
    }
}