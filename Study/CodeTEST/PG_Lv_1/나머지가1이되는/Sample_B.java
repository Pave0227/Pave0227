package PG_Lv_1.나머지가1이되는;

public class Sample_B
{

    public static void main(String[] arg)
    {
        Sample_B Pavel = new Sample_B();
        Pavel.Sample();
    }

    private void Sample()
    {
        long start_time = System.currentTimeMillis();
        // ! -----------------------------------------------

        // ! -----------------------------------------------
        long end_time = System.currentTimeMillis();

        System.out.printf("%s%f%s", "수행시간 ", (float) (end_time - start_time) / 1000, "초");
    }
}
