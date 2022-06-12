package PG_Lv_1.가운데글자가져오기;

public class Sample_B
{

    public static void main(String[] arg)
    {
        long start_time = System.currentTimeMillis();
        // todo -----------------------------------------------

        Sample_B Pavel = new Sample_B();
        Pavel.Sample();

        // todo -----------------------------------------------
        long end_time = System.currentTimeMillis();

        System.out.printf("\n\n\n%s%f%s", "수행시간 ", (float) (end_time - start_time) / 1000, "초");
    }

    private void Sample()
    {
        final String msg = "power";

        // ! ---------------------------------------------------

        String temp = msg.substring((msg.length()-1)/2 , msg.length() / 2 + 1);

        
    }
}
