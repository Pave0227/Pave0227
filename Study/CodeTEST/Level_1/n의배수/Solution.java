package Level_1.n의배수;

import java.util.ArrayList;
// 어떤 수 x와 n이 주어졌을때 조건에 따라 x가 n의 배수인지 판별하는 코드를 작성하라.

// x는 0 이상의 정수이며 조건에 맞지 않는 입력은 주어지지 않는다.

// 여기서 하나의 함수인지 여러 함수인지는 본인이 선택하면 된다.

// 단 절대 산술연산자 중 %와 /는 코드에 없도록 한다.

// 그리고 divmod() 함수를 쓰는것도 금지한다

// 코드는 창의적으로 하는 것을 목적으로 한다. 속도는 크게 중점을 두지 않는다.

// n의 종류는 2,3,5,7,11,13이다.

// 원하는 n만 선택해서 풀 수도 있다.

// 입력
// 입력으로 주어질 자연수의 종류를 입력받고 차례로 그 수만큼 정수를 입력받는다.

//제약조건 %,/,Math함수 사용금지
public class Solution {
    public static void main(String[] arg) {
        Solution Pavel = new Solution();
        Pavel.Solution1();
    }

    public void Solution1() {
        String target = "4233";
        int target_int = Integer.parseInt(target);
        int[] n = { 3, 5 };

        ArrayList<Integer> final_list = new ArrayList<>();

        for (int temp : n) {
            final_list.add(temp);
        }

        // n 정수 리스트 반복
        for (int y = 0; y < final_list.size(); y++) {
            int temp_int = target_int;
            // 10의 x승 반복문
            for (int x = target.length(); x >= 0; x--) {
                // 설정 정수 < 10의 x승 * 나눌정수값 * z
                for (int z = 1; z <= z + 1; z++) {

                    if (temp_int < Math.pow(10, x) * final_list.get(y) * z) {
                        temp_int -= Math.pow(10, x) * final_list.get(y) * (z - 1);
                        break;
                    }
                }
            }

            if (temp_int == 0) {
                System.out.println(target_int + "은 " + final_list.get(y) + "으로 나눠집니다.");
            } else {
                System.out.println(target_int + "은 " + final_list.get(y) + "으로 나눠지지않습니다.");
            }

        }

    }
}
