package PG_Lv_1.다트게임;

import java.util.ArrayList;
import java.util.Arrays;

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

        System.out.printf("\n\n\n%s%f%s", "수행시간 ", (float) (end_time - start_time) / 1000, "초");

    }

    private void Sample()
    {
        // 숫자가 9이하 일때만 작동함
        final String dartResult = "1S*2T*3S";

        // ! ---------------------------------------------------

        String[] str_arr = dartResult.replaceAll("[*#]", "").split("");

        ArrayList<Double> point_arr = new ArrayList<>();

        for (int x = 0; x < str_arr.length - 1; x += 2)
        {
            if (str_arr[x + 1].equals("D"))
            {
                point_arr.add(Math.pow(Integer.parseInt(str_arr[x]), 2));
            }
            else if (str_arr[x + 1].equals("T"))
            {
                point_arr.add(Math.pow(Integer.parseInt(str_arr[x]), 3));
            }
            else
            {
                point_arr.add((double) Integer.parseInt(str_arr[x]));
            }
        }

        point_arr.forEach(System.out::println);
        System.out.println("");

        int temp = 0;

        int[] star_idx = new int[dartResult.length() - dartResult.replace("*", "").length()];

        for (int x = 0; x < star_idx.length; x++)
        {
            star_idx[x] = (dartResult.indexOf("*", temp)) / 3;
            temp = dartResult.indexOf("*", temp) + 1;
        }

        int[] pal_idx = new int[dartResult.length() - dartResult.replace("#", "").length()];

        for (int x = 0; x < pal_idx.length; x++)
        {
            pal_idx[x] = dartResult.indexOf("#", temp) / 3;
            temp = pal_idx[x] + 1;
        }

        Arrays.stream(star_idx).forEach(System.out::println);
        Arrays.stream(pal_idx).forEach(System.out::println);
        System.out.println("");

        for (int x = 0; x < 3; x++)
        {
            if (Arrays.binarySearch(star_idx, x) >= 0)
            {
                if (x == 0)
                    point_arr.set(x, point_arr.get(x) * 2);
                else
                {
                    point_arr.set(x, point_arr.get(x) * 2);
                    point_arr.set(x - 1, point_arr.get(x - 1) * 2);
                }
            }
            else if (Arrays.binarySearch(pal_idx, x) >= 0)
            {
                point_arr.set(x, point_arr.get(x) * -1);
            }
        }

        point_arr.forEach(System.out::println);
        System.out.print(point_arr.stream().mapToDouble(a -> a).sum());
        // point_arr.stream().mapToDouble(a -> a).sum();
    }
}
