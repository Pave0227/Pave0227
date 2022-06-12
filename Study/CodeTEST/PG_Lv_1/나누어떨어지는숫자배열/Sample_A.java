package PG_Lv_1.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Comparator;

public class Sample_A
{

    public static void main(String[] arg)
    {
        long start_time = System.currentTimeMillis();
        // todo -----------------------------------------------

        Sample_A Pavel = new Sample_A();
        Pavel.Sample();

        // todo -----------------------------------------------
        long end_time = System.currentTimeMillis();

        System.out.println("------------------------------------------------");
        System.out.printf("%s%f%s", "수행시간 ", (float) (end_time - start_time) / 1000, "초");

    }

    private void Sample()
    {

        final int[] arr =
        { 5, 9, 7, 10 };

        final int divisor = 5;

        ArrayList<Integer> arr_int = new ArrayList<>();

        // ! ---------------------------------------------------

        for (int ar : arr)
        {
            if (ar % divisor == 0)
            {
                arr_int.add(ar);
            }
        }

        if (arr_int.size() == 0)
        {
            arr_int.add(-1);
        }

        arr_int.sort(new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                // TODO Auto-generated method stub
                return Integer.compare(o1, o2);
            }
        });
        // ? Test ----------------------------------------------

        // return arr_int.stream().mapToInt(Integer::valueOf).toArray();

        System.out.println("================================================");
    }
}
