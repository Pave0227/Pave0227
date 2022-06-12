package Level_1.홀수짝수;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.stream.Collectors;

// 홀수와 짝수의 개수를 구하는 프로그램을 만들어라.
public class Solution {
    public static void main(String[] arg) {
        Solution Pavel = new Solution();
        Pavel.Solution1();
    }

    private void Solution1() {
        int[] int_arr = { 12, 57, 21, 3123, 45, 532 };

        int odd = 0;
        int even = 0;

        ArrayList<Integer> Num_list = (ArrayList<Integer>) Arrays.stream(int_arr).boxed().collect(Collectors.toList());

        for (int i = 0; i < Num_list.size(); i++) {
            if (Num_list.get(i) % 2 == 0) {
                ++even;
            } else {
                ++odd;
            }
        }

        System.out.printf("홀수는 %d개, 짝수는 %d개", odd, even);

    }

}
