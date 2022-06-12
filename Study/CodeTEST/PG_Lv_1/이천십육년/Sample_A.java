package PG_Lv_1.이천십육년;

import java.util.Arrays;

public class Sample_A
{

    public static void main(String[] arg)
    {
        Sample_A Pavel = new Sample_A();
        Pavel.Sample();
    }

    private void Sample()
    {
        // 1월 1일 금요일
        final int a = 5;
        final int b = 24;

        // ! ---------------------------------

        int check_day = 0;

        int[] three_one =
        { 1, 3, 5, 7, 8, 10, 12 };
        int[] three_zero =
        { 4, 6, 9, 11 };

        for (int x = 1; x < a; x++)
        {
            if (Arrays.binarySearch(three_one, x) >= 0)
            {
                check_day += 31;
            }
            else if (Arrays.binarySearch(three_zero, x) >= 0)
            {
                check_day += 30;
            }
            else if (x == 2)
            {
                check_day += 29;
            }
        }

        System.out.print(Result_Day(check_day + b));

    }

    private String Result_Day(int n)
    {
        String result = "";

        switch (n % 7)
        {
        case 0:
            result = "THU";
            break;
        case 1:
            result = "FRI";
            break;
        case 2:
            result = "SAT";
            break;
        case 3:
            result = "SUN";
            break;
        case 4:
            result = "MON";
            break;
        case 5:
            result = "TUE";
            break;
        case 6:
            result = "WED";
            break;

        }
        return result;
    }
}
