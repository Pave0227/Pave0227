package PG_Lv_1.음양더하기;

import java.util.Arrays;

public class Sample_A
{
    public static void main(String[] arg)
    {
        Sample_A Pavel = new Sample_A();
        Pavel.Sample_A();
    }

    private void Sample_A()
    {
        int[] absolutes =
        { 4, 7, 12 };
        boolean[] signs =
        { true, false, true };

        for (int i = 0; i < signs.length; i++)
        {
            if (!signs[i])
            {
                absolutes[i] *= -1;
            }
        }

        System.out.print(Arrays.stream(absolutes).sum());
    }
}
