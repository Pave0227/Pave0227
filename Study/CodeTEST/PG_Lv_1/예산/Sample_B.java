package PG_Lv_1.예산;

import java.util.Arrays;

public class Sample_B
{

    public static void main(String[] arg)
    {
        Sample_B Pavel = new Sample_B();
        Pavel.Sample();
    }

    private void Sample()
    {
        int[] d =
        { 1, 2, 3, 4, 5, 6, 7 };
        int budget = 14;

        int answer = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++)
        {
            budget -= d[i];

            if (budget < 0)
                break;

            answer++;
        }

        // return answer;
    }
}
