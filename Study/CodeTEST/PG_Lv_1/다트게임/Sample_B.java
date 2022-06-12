package PG_Lv_1.다트게임;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        final String dartResult = "1D2S3T*";

        List<String> dart_num = new ArrayList<>(Arrays.asList(dartResult.split("[SDT#*]")));
        List<String> dart_str = new ArrayList<>(Arrays.asList(dartResult.split("[0-9]")));

        // ! ---------------------------------------------------

        dart_num.removeAll(Arrays.asList("", null));
        dart_str.removeAll(Arrays.asList("", null));

        List<Integer> dart_int = dart_num.stream().map(Integer::parseInt).collect(Collectors.toList());

        for (int x = 0; x < dart_num.size(); x++)
        {
            if (dart_str.get(x).contains("D"))
            {
                dart_int.set(x, (int) Math.pow(dart_int.get(x), 2));
            }
            else if (dart_str.get(x).contains("T"))
            {
                dart_int.set(x, (int) Math.pow(dart_int.get(x), 3));
            }

            // -------------------------------------------------

            if (dart_str.get(x).contains("*"))
            {
                dart_int.set(x, dart_int.get(x) * 2);

                if (x - 1 >= 0)
                {
                    dart_int.set(x - 1, dart_int.get(x - 1) * 2);
                }
            }
            else if (dart_str.get(x).contains("#"))
            {
                dart_int.set(x, dart_int.get(x) * -1);
            }
        }

        // ? Test_Line -----------------------------------------

        dart_int.forEach(System.out::println);

        System.out.println("================================================");

        dart_str.forEach(System.out::println);

        System.out.println("================================================");

        System.out.println(dart_int.stream().mapToInt(a -> a).sum());

    }
}
