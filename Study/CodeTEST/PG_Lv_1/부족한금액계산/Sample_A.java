package PG_Lv_1.부족한금액계산;

public class Sample_A
{

    public static void main(String[] arg)
    {
        Sample_A Pavel = new Sample_A();
        Pavel.Sample();
    }

    private void Sample()
    {
        int price = 3;
        int money = 20;
        int count = 4;

        
        long start_time = System.currentTimeMillis();
        // ! -----------------------------------------------

        long temp = money;
        
        for (int x = 1; x <= count; x++)
        {
            temp -= price * x;
        }
        
        

        // ! -----------------------------------------------
        long end_time = System.currentTimeMillis();

        System.out.printf("%s%f%s", "수행시간 ", (float) (end_time - start_time) / 1000, "초");

        // return temp < 0 ? Math.abs(temp) : 0;
    }
}
