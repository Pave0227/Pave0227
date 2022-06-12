package Level_1.사칙연산;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] data1 = { 1, 2, 3, 4, 5 };
        Calculator cal1 = new Calculator(data1);
        System.out.println(cal1.sum()); // 15 출력
        System.out.println(cal1.avg()); // 3.0 출력

        int[] data2 = { 6, 7, 8, 9, 10 };
        Calculator cal2 = new Calculator(data2);
        System.out.println(cal2.sum()); // 40 출력
        System.out.println(cal2.avg()); // 8.0 출력
    }
}

class Calculator {

    int[] int_arr;

    // ? 생성자
    Calculator(int[] i) {
        this.int_arr = i;
    }

    // !

    int sum() {
        return Arrays.stream(int_arr).sum();
    }

    float avg() {
        return Arrays.stream(int_arr).sum() / int_arr.length;
    }

}