package Algorithm.최대공약수;

import java.util.stream.IntStream;

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

        // ! ---------------------------------------------------

    }

    private int GCD(int a, int b)
    {
        if (b > a)
        {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a % b == 0)
        {
            return b;
        }

        return GCD(b, a % b);
    }

    private int LCM(int a, int b)
    {

        if (b > a)
        {
            int temp = a;
            a = b;
            b = temp;
        }

        return (a * b) / GCD(a, b);
    }
}
