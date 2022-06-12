package PG_Lv_1.내적;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sample_A
{

    public static void main(String[] arg)
    {
        Sample_A Pavel = new Sample_A();
        Pavel.Sample_A();
    }

    private void Sample_A()
    {
        int[] a =
        { 1, 2, 3, 4 };
        int[] b =
        { -3, -1, 0, 2 };

        for (int i = 0; i < a.length; i++)
        {
            a[i] *= b[i];
        }

        Arrays.stream(a).sum();

        IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
    }
}
