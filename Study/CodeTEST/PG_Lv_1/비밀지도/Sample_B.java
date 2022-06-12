package PG_Lv_1.비밀지도;

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
        int n = 5;
        int[] arr1 =
        { 9, 20, 28, 18, 11 };
        int[] arr2 =
        { 30, 1, 21, 17, 28 };

        long start_time = System.currentTimeMillis();
        // todo -----------------------------------------------

        String[] result = new String[n];

        for (int x = 0; x < n; x++)
        {
            result[x] = Integer.toBinaryString(arr1[x] | arr2[x]);
        }

        for (int i = 0; i < n; i++)
        {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        // todo -----------------------------------------------
        long end_time = System.currentTimeMillis();

        System.out.printf("%s%f%s", "수행시간 ", (float) (end_time - start_time) / 1000, "초");

        // return result;

        Arrays.stream(result).forEach(System.out::println);
    }
}
