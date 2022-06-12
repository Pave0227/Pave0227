package Level_1.게시판페이징;

import java.util.stream.IntStream;

// A씨는 게시판 프로그램을 작성하고 있다.

// A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주었을 때 총 페이지수를 리턴하는 프로그램이 필요하다고 한다.

// 입력 : 총 게시물수(m), 한페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n >= 1)
// 출력 : 총페이지수

// A씨가 필요한 프로그램을 작성하시오.

public class Solution {

    public static void main(String[] arg) {
        int Total_Number = 34; // 총 게시물 수
        int OnePage_Number = 11; // 한 페이지에 보여줄 게시물 수
        int Result = 0; // 총 페이지수

        Solution Pavel = new Solution();

        Result = Pavel.Page_Number(Total_Number, OnePage_Number);
        Pavel.Int_Print_Test(Result);

    }

    public int Page_Number(int m, int n) {
        int result = 0;

        if (m < n && m != 0) // 총 게시물수가 한 페이지에 보여줄 게시물 수보다 적고, 값이 0이 아니면. 총페이지수는 항상 1이다
        {
            result = 1;
        } else if (m > n && m % n != 0) // 총 게시물 수가 한 페이지에 보여줄 게시물 수 보다 크고, 나눴을때 나머지값이 남지않으면 @ 총 페이지 수는 둘을 나눈 값에 +1이다.
        {
            result = (m / n) + 1;
        } else // 그외 결과 m/n 나눈 값
        {
            result = m / n;
        }

        return result;
    }

    public int Page_Number2(int m, int n) {
        int result = m / n;

        result = m % n > 0 ? ++result : result;

        return result;
    }

    public void Int_Print_Test(int i) {
        System.out.println(i);
    }
}
