package Level_1.업앤다운;

import java.util.Random;
import java.util.Scanner;

// 컴퓨터가 1~100 숫자(정수 범위) 중 하나를 랜덤으로 정합니다. (이를 알려주지 않습니다.)
// 사용자는 이 숫자를 맞추어야 합니다.
// 입력한 숫자보다 정답이 크면 → "UP" 출력,
// 입력한 숫자보다 정답이 작으면 → "DOWN" 출력.
// 정답을 맞추면 → "정답"을 출력하고, 지금까지 숫자를 입력한 횟수를 알려줍니다.
// 코딩 초보자라도 if 함수와 while함수, 랜덤 모듈 정도까지만 배워도 재미있게 풀 수 있는 문제입니다.

// (예시)
// 컴퓨터가 1~100 중 랜덤 숫자 하나를 정합니다.
// 이 숫자를 맞춰주세요.
// 1~100 숫자 입력:50
// DOWN
// 1~100 숫자 입력:25
// UP
// 1~100 숫자 입력:38
// DOWN
// 1~100 숫자 입력:32
// UP
// 1~100 숫자 입력:35
// UP
// 1~100 숫자 입력:37
// DOWN
// 1~100 숫자 입력:36
// 정답입니다! 7회 만에 맞췄어요.
public class Solution {
    public static void main(String[] arg) {
        Solution Pavel = new Solution();
        Pavel.Solution1();
    }

    private void Solution1() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int random_num = rd.nextInt(100);

        while (true) {
            System.out.print("1~100까지의 숫자 입력: ");
            int user_n = sc.nextInt();

            if (random_num == user_n) {
                System.out.println("정답입니다");
                break;
            }

            String msg = (random_num > user_n) ? "UP" : "DOWN";

            System.out.println(msg);

        }
        sc.close();
    }
}
