package Level_1.가장작은수;

import java.util.ArrayList;
// 1부터 10까지의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.

// 그렇다면 1부터 20까지의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
public class Solution
{
    public static void main(String[] arg) throws Exception
    {
        Solution Pavel = new Solution();
        Pavel.Solution1();
        Pavel.Solution2();

    }

    // 단순히 지정한 숫자 배수 만큼 반복 계산하는 코드 // 시간복잡도 높음
    public void Solution1()
    {
        int n = 10;

        CheckNum: for (int i = n; i <= n + i; i += n)
        {

            for (int y = 2; y <= n; y++)
            {
                if (y == n)
                {
                    System.out.println(i);
                    break CheckNum;
                }

                if (i % y != 0)
                {
                    break;
                }

            }
        }
    }

    //
    public void Solution2()
    {
        ArrayList<Integer> Pavel = new ArrayList<>();
        Pavel.add(2);
        int n = 10;

        // 설정한 숫자이하의 소수를 구함
        for (int i = 3; i <= n; i++)
        {
            for (int y = 2; y <= i; y++)
            {
                if (i % y == 0)
                {
                    break;
                }
                if (y == i - 1)
                {
                    Pavel.add(i);
                }
            }
        }

        Pavel.forEach(System.out::println);
        int ans = 1;

        // 소수값의 설정한 숫자의 최댓값을 판단후 곱함
        for (int z = 0; z < Pavel.size(); z++)
        {
            for (int f = 1; f <= f + 1; f++)
            {

                if (Math.pow(Pavel.get(z), f + 1) > n)
                {
                    ans *= Math.pow(Pavel.get(z), f);
                    break;
                }

            }
        }

        System.out.println(ans);
    }
}
