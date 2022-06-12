package PG_Lv_1.부족한금액계산;

public class Sample_C
{

    public static void main(String[] arg)
    {
        Sample_C Pavel = new Sample_C();
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
