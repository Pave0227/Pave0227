package Level_1.거듭제곱;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt(); // 밑
		long b = sc.nextInt(); // 지수

		System.out.println(pow(a, b));
		sc.close();
	}

	private static long pow(long a, long b) 
    {
		// 지수가 0인 경우(종료 조건).
		if (b == 0) 
        {
			return 1;
		} 
  
		// 반으로 나눈 거듭제곱 계산.
		long res = pow(a, b / 2);

		// 지수가 짝수인 경우.
		if (b % 2 == 0) 
        {
			return res * res;
		}
		// 지수가 홀수인 경우
		else 
        {
			return res * res * a;
		}
	}
}