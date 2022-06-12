package PG_Lv_1.최소직사각형;

import java.util.Arrays;

public class Sample_A
{

    public static void main(String[] arg)
    {
        Sample_A Pavel = new Sample_A();
        Pavel.Sample();
    }

    private void Sample()
    {
        long start_time = System.currentTimeMillis();

        int[][] sizes =
        {
                { 14, 4 },
                { 19, 6 },
                { 6, 16 },
                { 18, 7 },
                { 7, 11 } };

        int a = 0;
        int b = 0;

        for (int[] siz : sizes)
        {
            Arrays.sort(siz);

            if (siz[0] > a)
            {
                a = siz[0];
            }
            if (siz[1] > b)
            {
                b = siz[1];
            }
        }

        // System.out.println(a * b);

        long end_time = System.currentTimeMillis();

        System.out.println(end_time - start_time);

    }
}
