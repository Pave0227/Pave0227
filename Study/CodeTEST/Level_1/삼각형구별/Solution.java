package Level_1.삼각형구별;

import java.util.Arrays;

// [60, 60, 60] = 예각삼각형
// [30, 60, 90] = 직각삼각형
// [20, 40, 120] = 둔각삼각형
// [0, 90, 90] = 삼각형이 아니다
// [60, 70, 80] = 삼각형이 아니다
// [40, 40, 50, 50] = 삼각형이 아니다

// 예각삼각형 : 3개의 각이 모두 예각인 삼각형
// 직각삼각형 : 1개의 각이 직각인 삼각형
// 둔각삼각형 : 1개의 각이 둔각인 삼각형
// ① 각이 3개가 아닐 경우 삼각형이 아니다.
// ② 3개의 각의 합이 180°가 아닐 경우 삼각형이 아니다.
public class Solution {
    public static void main(String[] arg) {
        Solution Pavel = new Solution();
        Pavel.Solution1();
        Pavel.Case1();
    }

    private void Solution1() {
        int[] tri_arr = { 60, 50, 70 };

        Arrays.stream(tri_arr).forEach(System.out::print);

        if (Arrays.stream(tri_arr).sum() != 180 || tri_arr.length != 3) {
            System.out.println("삼각형이 아닙니다");
            System.exit(0);
        }

        for (int i : tri_arr) {
            if (i > 90) {
                System.out.println("둔각 삼각형입니다");
            }

            if (i == 90) {
                System.out.println("직각 삼각형입니다");
            }
        }

        System.out.println("예각 삼각형입니다");
    }

    private void Case1() {
        int[] tri_arr = { 60, 50, 70 };

        Arrays.stream(tri_arr).forEach(System.out::print);

        Arrays.sort(tri_arr);

        int Max = tri_arr[tri_arr.length - 1];

        if (Arrays.stream(tri_arr).sum() == 180 || tri_arr.length == 3)
            System.out.println(Max > 90 ? "둔각" : (Max < 90 ? "예각" : "직각") + " 삼각형 입니다");

        else
            System.out.println("삼각형이 아닙니다");

    }

}
