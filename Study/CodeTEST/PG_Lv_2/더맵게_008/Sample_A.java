package PG_Lv_2.더맵게_008;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

// byte         8bits    -2^7 ~ 2^7-1 (-128 ~ 127)
// short       16bits    -2^15 ~ 2^15-1 (-32768 ~ 32767)
// int         32bits    -2^31 ~ 2^31-1 (-2147483648 ~ 2147483647)
// long        64bits    -2^63 ~ 2^63-1 (-9223372036854775808 ~ 9223372036854775807)
// float       32bits    0x0.000002P-126f ~ 0x1.fffffeP+127f
// double      64bits    0x0.0000000000001P-1022 ~ 0x1.fffffffffffffP+1023  
// char        16bits    \u0000 ~ \uffff (0 ~ 2^15-1) * 자바에서 unsgined로 동작하는 자료형
// boolean 1 bit true,false

public class Sample_A
{

    int try_time = 0;

    public static void main(String[] arg)
    {

        long start_time = System.currentTimeMillis();
        // todo -----------------------------------------------

        Sample_A Pavel = new Sample_A();
        Pavel.Sample();

        // todo -----------------------------------------------
        long end_time = System.currentTimeMillis();

        System.out.println("-----------------------------------------------");
        System.out.printf("%s%f%s", "수행시간 ", (float) (end_time - start_time) / 1000, "초");

    }

    private void Sample()
    {

        final int[] scoville =
        { 1, 2, 3, 9, 10, 12 };

        final int k = 7;

        ArrayList<Integer> scoville_list = (ArrayList<Integer>) Arrays.stream(scoville).boxed()
                .collect(Collectors.toList());

        // ! ---------------------------------------------------

        while (upper_k(scoville_list, k))
        {
            Collections.sort(scoville_list);

            int temp_int = scoville_list.get(0) + scoville_list.get(1) * 2;

            scoville_list.remove(0);
            scoville_list.set(0, temp_int);
            ++try_time;
        }

        scoville_list.forEach(System.out::println);
        System.out.println(try_time);

    }

    private boolean upper_k(ArrayList<Integer> arr, int k)
    {

        for (int ar : arr)
        {
            if (arr.size() == 1 && k > ar)
            {
                try_time = -1;
                return false;
            }
            if (k > ar)
            {
                return true;
            }
        }

        return false;

    }
}
