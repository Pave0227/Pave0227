package PG_Lv_1.최소직사각형;

import java.util.Arrays;

public class Sample_B
{

    public static void main(String[] arg)
    {
        Sample_B Pavel = new Sample_B();
        Pavel.Sample();
    }

    private void Sample()
    {
        int[][] sizes =
        {
                { 14, 4 },
                { 19, 6 },
                { 6, 16 },
                { 18, 7 },
                { 7, 11 } };

        long start_time = System.currentTimeMillis();
        // ! -----------------------------------------------

        Arrays.stream(sizes).reduce((a, b) -> new int[]
        { Math.max(Math.max(a[0], a[1]), Math.max(b[0], b[1])), Math.max(Math.min(a[0], a[1]), Math.min(b[0], b[1])) })
                .map(it -> it[0] * it[1]).get();

        // ! ----------------------------------------------
        long end_time = System.currentTimeMillis();

        System.out.printf("%s%f%s", "수행시간 ", (float) (end_time - start_time) / 1000, "초");
    }
}
