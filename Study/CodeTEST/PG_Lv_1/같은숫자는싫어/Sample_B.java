package PG_Lv_1.같은숫자는싫어;

import java.util.ArrayList;

public class Sample_B
{

    public static void main(String[] arg)
    {
        long start_time = System.currentTimeMillis();
        // todo -----------------------------------------------

        Sample_B Pavel = new Sample_B();
        Pavel.Sample();

        // todo -----------------------------------------------
        long end_time = System.currentTimeMillis();

        System.out.println("------------------------------------------------");
        System.out.printf("%s%f%s", "수행시간 ", (float) (end_time - start_time) / 1000, "초");
    }

    private void Sample()
    {

        final int[] arr =
        { 1, 1, 1, 3, 3, 0, 1, 1 };

        ArrayList<Integer> arr_int = new ArrayList<>();

        // ! ---------------------------------------------------

        for (int x = 1; x < arr.length; x++)
        {
            if (arr[x - 1] != arr[x])
            {
                arr_int.add(arr[x - 1]);
            }
        }

        arr_int.add(arr[arr.length - 1]);

        // ? Test ----------------------------------------------

        arr_int.forEach(System.out::println);
        System.out.println("================================================");
    }
}
