package Home_Work.합평균로또;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Solution
{
    public static void main(String[] arg)
    {

        Solution Pavel = new Solution();
        Pavel.solution();
    }

    private void solution()
    {
        // ? 합과 평균을 구하는 ============================================

        // int[] arr =
        // { 1, 2, 3, 4, 5, 6, 7, 8 };

        // System.out.println(Arrays.stream(arr).sum());
        // System.out.println(Arrays.stream(arr).average());

        // ? 로또 번호을 만드는 =========================================
        IntStream arr_stream = new Random().ints(6, 1, 45).distinct();

        while (arr_stream.count() != 6)
        {
            arr_stream = new Random().ints(6, 1, 45).distinct();
        }

        // =========================================================
        int[] lotto = new int[6];

        for (int x = 0; x < lotto.length; x++)
        {
            while (true)
            {
                int temp = (int) (Math.random() * 45) + 1;

                if (Arrays.binarySearch(lotto, temp) > 0)
                {
                    continue;
                }
                else
                {
                    lotto[x] = temp;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(lotto));

        // ? 수의 개수을 구하는 =========================================================
        int[] arr_1 = new int[100];

        for (int x = 0; x < arr_1.length; x++)
        {
            arr_1[x] = (int) (Math.random() * 10) + 1;
        }

        for (int y = 1; y <= 10; y++)
        {
            int abc = y;
            System.out.println(y + "의 갯수는 " + Arrays.stream(arr_1).filter(a -> a == abc).count() + "개 이다.");
        }
    }
}
