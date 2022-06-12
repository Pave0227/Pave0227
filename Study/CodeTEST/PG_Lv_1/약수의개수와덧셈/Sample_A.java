package PG_Lv_1.약수의개수와덧셈;

public class Sample_A
{

    public static void main(String[] arg)
    {
        Sample_A Pavel = new Sample_A();
        Pavel.Sample_A();
    }

    private void Sample_A()
    {
        final int left = 13;
        final int right = 17;

        // ! ----------------------------------------------------------------------

        int result = 0;

        for (int x = left; x <= right; x++)
        {
            int temp_count = 0;

            for (int y = 1; y <= x; y++)
            {
                if (x % y == 0)
                {
                    ++temp_count;
                }
            }

            if (temp_count % 2 == 0)
            {
                result += x;
            }
            else
            {
                result -= x;
            }
        }

        System.out.print(result);
    }

    private void Sample_B()
    {
        final int left = 13;
        final int right = 17;

        // !
        // ----------------------------------------------------------------------------
        int result = 0;

        for (int x = left; x <= right; x++)
        {
            if (x % Math.sqrt(x) == 0)
            {
                result -= x;
            }
            else
            {
                result += x;
            }
        }
    }
}
