package PG_Lv_1.같은숫자는싫어;

import java.util.ArrayList;

public class Sample_C
{

    public static void main(String[] arg)
    {
        long start_time = System.currentTimeMillis();
        // todo -----------------------------------------------

        Sample_C Pavel = new Sample_C();
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

        ArrayList<Integer> tempList = new ArrayList<Integer>();

        // ! ---------------------------------------------------

        int preNum = 10;

        for (int num : arr)
        {
            if (preNum != num)
            {
                tempList.add(num);
            }
            preNum = num;
        }
        // ? Test ----------------------------------------------

        System.out.println("================================================");
    }
}
