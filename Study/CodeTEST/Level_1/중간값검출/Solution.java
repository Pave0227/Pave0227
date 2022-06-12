package Level_1.중간값검출;

import java.util.Arrays;

// 3개의 숫자를 입력으로 받고 3개의 숫자 중에 중간값을 가지는 숫자를 출력하세요. ex1) 2, 5, 3 => 3 ex2) 4, 6, 4 => 4
public class Solution {
    public static void main(String[] arg) {
        Solution Pavel = new Solution();
        Pavel.Solution1();
    }

    public void Solution1() {
        int[] Temp = { 6, 3, 5, 7, 1, 4 };

        Arrays.sort(Temp);

        if (Temp.length % 2 == 0) {
            int temp = Temp[(Temp.length / 2) - 1] + Temp[Temp.length / 2];
            System.out.println(temp / 2);
        } else
            System.out.println(Temp[Temp.length / 2]);

    }

}
