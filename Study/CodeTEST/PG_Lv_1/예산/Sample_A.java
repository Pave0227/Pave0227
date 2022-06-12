package PG_Lv_1.예산;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sample_A
{

    // ? 클래스 변수
    public static void main(String[] arg)
    {
        Sample_A Pavel = new Sample_A();
        Pavel.Sample();
    }

    private void Sample()
    {
        int[] d =
        { 1, 2, 3, 4, 5, 6, 7 };
        int budget = 14;

        // ! ---------------------------------------------------

        Arrays.sort(d);

        int max = 0; // 예상 최대 지원 가능 부서의 수
        int test_bud = budget;

        // 지원가능한 예상 부서 수
        for (int test : d)
        {
            test_bud -= test;

            if (test_bud == 0)
            {
                ++max;
                // return max;
                break;
            }

            else if (test_bud < 0)
            {
                break;
            }

            ++max;
        }

        // return max;
    }

}
