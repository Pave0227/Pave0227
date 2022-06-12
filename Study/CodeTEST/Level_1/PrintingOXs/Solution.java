package Level_1.PrintingOXs;

import java.util.*;

// 주요사용된 메소드 Integer.toBinaryString(Int값) = 10진수을 2진수로 변환후 String 화

// input은 int n을 입력 받아 첫번째 row는 (n-1)의 O와 X, 두번째 row는 (n-2)의 O와 XX, 세번째 row는 (n-3)의 0와 

// 입력 예시: 6

// 출력 예시:

// OOOOOX

// OOOOXX

// OOOXXX

// OOXXXX

// OXXXXX

// XXXXXX

public class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] arg) {
        Solution Pavel = new Solution();
        // 이진수 고정
        final int Two = 2;
        // 정수의 갯수 설정
        System.out.println("정수의 갯수을 입력해주세요");
        int n = sc.nextInt();

        // 정수 10진수 총합 초기화
        long Binary = Pavel.All_BitControl(Two, n - 1);
        // 정수 10진수 => 2진수 String 변환후 => 1은 O로,0은 X로 변경해 출력
        Pavel.Test_Print(Binary);
    }

    // 거듭제곱 계산 i = 밑 , n = 지수
    public long BitControl(int i, long n) {

        // 지수가 0일시 값을 1 반환
        if (n == 0) {
            return 1;
        }

        // 메소드 루프
        long res = BitControl(i, n / 2);

        if (n % 2 == 0) {
            return res * res;
        } else {
            return res * res * i;
        }

    }

    // 2진수 비트값 모두 1이 들어가도록 만든 메소드
    public long All_BitControl(int i, long n) {
        int All = 0;

        for (int y = 0; y <= n; y++) {
            int temp = (int) BitControl(i, y);
            All += temp;
        }

        return All;
    }

    public void Test_Print(long i) {
        // 이진수 시각화(String)
        int iy = (int) i;
        String iy_Binary = Integer.toBinaryString(iy);
        int length_Binary = iy_Binary.length();
        // System.out.println(iy);
        // System.out.println(iy_Binary);
        System.out.println(iy_Binary.replace("1", "O").replace("0", "X"));

        // 2진수 1비트가 다 채워 진 상태에서 제일 지수 부터 0비트로 바꿔 출력
        for (int y = 0; y < length_Binary - 1; y++) {
            int temp = (int) BitControl(2, y);
            iy -= temp;

            String iy2_Binary = Integer.toBinaryString(iy);
            // System.out.println(iy2_Binary);
            System.out.println(iy2_Binary.replace("1", "O").replace("0", "X"));
        }

        // 테스팅 라인

        // String으로 작성된 2진수을 10진수 int형으로 변환
        // String test = "1111";
        // int Binary = Integer.parseInt(test,2);

        // System.out.println(Binary);
        // System.out.println(test.replace("1","O").replace("0","X"));

    }
}
