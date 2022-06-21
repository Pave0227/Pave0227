package PG_Lv_2.멀쩡한사각형_005;

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
        int w = 8;
        int h = 12;

        int result = 0;

        // ! ---------------------------------------------------

        result = w * h - (w + h - GCD(w, h));

        System.out.println(result);

    }

    private int GCD(int a, int b)
    {
        if (a < b)
        {
            int temp = b;
            b = a;
            a = temp;
        }
        if (a % b == 0)
        {
            return b;
        }

        return GCD(b, a % b);
    }
}
