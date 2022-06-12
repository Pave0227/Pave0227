package Level_1.베스킨라빈스31;

import java.util.Scanner;

// 게임의 참여자들은 차례를 정해 1부터 31까지의 수를 순차적으로 부른다. 한번에 1~3개까지 수를 연달아 부를 수 있으며, 마지막 31을 부른 사람이 진다.

// 컴퓨터가 무조건 먼저 시작하고,1P는 무조건 2번째로 말한다.컴퓨터가 무조건 이기게 만들어라.
// LEVEL1 예상
// 힌트1:4n-2라는 공식을 사용하면 됩니다.
// 힌트2:이 게임은 31을 부르면 지는 게임이니 30을 부르면 이깁니다.
public class Solution {
    public static void main(String[] arg) {
        Solution Pavel = new Solution();
        Pavel.Solution1();
    }

    private void Solution1() {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while (num < 31) {

            Com: for (int y = 1; y <= y + 1; y++) {
                for (int i = 1; i <= 3; i++) {
                    if (4 * y - 2 == num + i) {
                        num += i;
                        break Com;
                    }
                }
            }

            User: while (num < 31) {
                System.out.println("몇개의 수을 부르시겠습니다. 현재 숫자는 " + num);
                int temp = sc.nextInt();

                if (temp < 1 || temp > 3) {
                    System.out.println("\n잘못입력했습니다 1과 3사이의 수을 입력해주세요\n");
                    continue User;
                }

                else {
                    num += temp;

                    if (num > 30) {
                        System.out.println("졌습니다 현재 숫자: " + num);
                    }
                    break User;
                }

            }
        }

        sc.close();
    }
}
