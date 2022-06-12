package PG_Lv_1.삼진법뒤집기;

public class Sample_B
{

    public static void main(String[] arg)
    {
        Sample_B Pavel = new Sample_B();
        Pavel.Sample();
    }

    private void Sample()
    {
        int n = 126;
        String a = "";

        while (n > 0)
        {
            a = (n % 3) + a;
            n /= 3;
        }

        a = new StringBuilder(a).reverse().toString();

        System.out.print(Integer.parseInt(a, 3));
    }
}
