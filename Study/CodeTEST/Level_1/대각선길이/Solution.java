package Level_1.대각선길이;

import java.util.Scanner;

// 직각삼각형의 밑변이 x, 높이가 y일 때 남은 변(대각선)의 길이를 구하는 함수를 만들어주세요.

// ps. 요즘 대각선계산기 어플이 인기가 있는 걸 보고 한번 직접 만들어보는 것도 좋다고 생각해서 문제를 만들어 올립니다.

public class Solution
{

    public static void main(String[] arg)
    {
        Solution Pavel = new Solution();
        Pavel.Solution1();
    }

    void Solution1()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        double ab = Math.pow(a, 2) + Math.pow(b, 2);

        double c = Math.sqrt(ab);

        System.out.println("a는" + a + " b는" + b + "c는 " + c);

    }
}
