package PG_Lv_1.부족한금액계산;

public class Sample_B
{

    public static void main(String[] arg)
    {
        Sample_B Pavel = new Sample_B();
        Pavel.Sample();
    }

    private void Sample()
    {
        long price = 3;
        long money = 20;
        long count = 4;

        long start_time = System.currentTimeMillis();
        // ! -----------------------------------------------
        
        // 등차수열의 합
        Math.max(price * (count * (count + 1) / 2) - money, 0);
        
        // ! -----------------------------------------------
        long end_time = System.currentTimeMillis();

        System.out.printf("%s%f%s", "수행시간 ", (float) (end_time - start_time) / 1000, "초");
    }
}
