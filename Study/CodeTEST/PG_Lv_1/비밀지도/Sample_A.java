package PG_Lv_1.비밀지도;

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
        int n = 5;
        int[] arr1 =
        { 9, 20, 28, 18, 11 };
        int[] arr2 =
        { 30, 1, 21, 17, 28 };

        String[] result = new String[n];

        long start_time = System.currentTimeMillis();
        // ! -----------------------------------------------

        for (int x = 0; x < n; x++)
        {
            String temp = Integer.toBinaryString(arr1[x]);
            String temp2 = Integer.toBinaryString(arr2[x]);

            while (temp.length() < n)
            {
                temp = "0" + temp;
            }
            while (temp2.length() < n)
            {
                temp2 = "0" + temp2;
            }

            System.out.println(temp);
            System.out.println(temp2);

            result[x] = "";

            for (int y = 0; y < n; y++)
            {

                if (temp.charAt(y) == '1' || temp2.charAt(y) == '1')
                {
                    result[x] += "#";
                }
                else
                {
                    result[x] += " ";
                }
            }

        }

        Arrays.stream(result).forEach(System.out::println);

        // ! -----------------------------------------------
        long end_time = System.currentTimeMillis();

        System.out.printf("\n\n\n%s%f%s", "수행시간 ", (float) (end_time - start_time) / 1000, "초");
    }
}
