package PG_Lv_1.가운데글자가져오기;

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
        final String s = "abcde";
        
        // ! ---------------------------------------------------

        String result = "";

        int temp = s.length() / 2;

        if (s.length() % 2 == 0)
        {
            result = s.substring(temp - 1, temp + 1);
        }
        else
        {
            result = s.substring(temp, temp + 1);
        }

        System.out.print(result);

    }
}
