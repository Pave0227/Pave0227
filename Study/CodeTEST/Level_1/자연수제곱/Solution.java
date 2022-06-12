package Level_1.자연수제곱;

import java.util.Scanner;

// 1부터 10까지 자연수를 각각 제곱해 더하면 다음과 같습니다 (제곱의 합). 1^2 + 2^2 + ... + 10^2 = 385 1부터 10을 먼저 더한 다음에 그 결과를 제곱하면 다음과 같습니다 (합의 제곱). (1 + 2 + ... + 10)^2 = 55^2 = 3025 따라서 1부터 10까지 자연수에 대해 "합의 제곱"과 "제곱의 합" 의 차이는 3025 - 385 = 2640 이 됩니다. 그러면 1부터 100까지 자연수에 대해 "합의 제곱"과 "제곱의 합"의 차이는 얼마입니까?
public class Solution {
    public static void main(String[] arg) {
        Solution Pavel = new Solution();
        Pavel.Solution_1();
    }

    public void Solution_1() {
        System.out.println("최대값을 입력하세요 ");
        Scanner sc = new Scanner(System.in);
        int Sum_pow = 0;
        int Pow_sum = 0;
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            Sum_pow += Math.pow(i, 2);
            Pow_sum += i;
        }

        Pow_sum = (int) Math.pow(Pow_sum, 2);

        System.out.println(Pow_sum - Sum_pow);

        sc.close();
    }
}
