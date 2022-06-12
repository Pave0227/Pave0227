package PG_Lv_1.나누어떨어지는숫자배열;

import java.util.Arrays;

public class Sample_C
{

    public static void main(String[] arg)
    {
        long start_time = System.currentTimeMillis();
        // todo -----------------------------------------------

        Sample_C Pavel = new Sample_C();
        int[] array =
        { 5, 9, 7, 10 };
        System.out.println(Arrays.toString(Pavel.Sample(array, 5)));

        // todo -----------------------------------------------
        long end_time = System.currentTimeMillis();

        System.out.println("------------------------------------------------");
        System.out.printf("%s%f%s", "수행시간 ", (float) (end_time - start_time) / 1000, "초");
    }

    private int[] Sample(int[] array, int divisor)
    {

        // ! ---------------------------------------------------

        return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();

        // ? Test ----------------------------------------------

    }
}
