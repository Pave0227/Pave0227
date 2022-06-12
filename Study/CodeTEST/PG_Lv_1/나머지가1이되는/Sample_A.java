package PG_Lv_1.나머지가1이되는;

public class Sample_A
{

    public static void main(String[] arg)
    {
        Sample_A Pavel = new Sample_A();
        Pavel.Sample();
    }

    private void Sample()
    {
        final int n = 18;
        // ? -----------------------------------------------

        long start_time = System.currentTimeMillis();
        // ! -----------------------------------------------

        int temp = n - 1;
        int result = 0;

        for (int x = 2; x <= temp; x++)
        {
            if (temp % x == 0)
            {
                result = x;
                break;
            }
        }

        System.out.println(result);
        // return result;
        // ! -----------------------------------------------
        long end_time = System.currentTimeMillis();

        System.out.printf("\n\n\n%s%f%s", "수행시간 ", (float) (end_time - start_time) / 1000, "초");
    }
}
