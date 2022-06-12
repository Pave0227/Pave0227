package PG_Lv_1.같은숫자는싫어;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

// ! 효율성 테스트 실패 
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
        { 1, 1, 1, 3, 3, 0, 1, 1 };

        ArrayList<Integer> arr_int = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());

        // ! ---------------------------------------------------

        // return Arrays.stream(arr).distinct().toArray();

        int x = 1;
        while (x < arr_int.size())
        {
            if (arr_int.get(x - 1) == arr_int.get(x) && x < arr_int.size())
            {
                arr_int.remove(x - 1);
                continue;
            }
            ++x;
        }

        // ? Test ----------------------------------------------


        //return arr_int.stream().mapToInt(Integer::valueOf).toArray();
        
        arr_int.forEach(System.out::println);

        System.out.println("================================================");
    }
}
