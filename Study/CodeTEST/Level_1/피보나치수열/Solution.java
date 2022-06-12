package Level_1.피보나치수열;

import java.util.*;

// 피보나치 수열이란, 첫 번째 항의 값이 0이고 두 번째 항의 값이 1일 때, 이후의 항들은 이전의 두 항을 더한 값으로 이루어지는 수열을 말한다.

// 예) 0, 1, 1, 2, 3, 5, 8, 13

// 인풋을 정수 n으로 받았을때, n 이하까지의 피보나치 수열을 출력하는 프로그램을 작성하세요
public class Solution {
    static Scanner Main_Scan = new Scanner(System.in);

    public static void main(String[] arg) {

        Solution Pavel = new Solution();
        Pavel.Solution_1();

    }

    public void Solution_1() {

        int n = 50;
        ArrayList<Integer> n_list = new ArrayList<>();

        n_list.add(0);
        n_list.add(1);
        for (int i = 0; i < i + 1; i++) {

            if (n_list.get(i) + n_list.get(i + 1) >= n) {
                break;
            }

            n_list.add(n_list.get(i) + n_list.get(i + 1));

        }

        n_list.forEach(System.out::println);

    }

}
