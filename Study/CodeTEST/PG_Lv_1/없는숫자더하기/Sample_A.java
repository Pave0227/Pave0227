package PG_Lv_1.없는숫자더하기;

import java.util.Arrays;

public class Sample_A
{

    public static void main(String[] arg)
    {
        Sample_A Pavel = new Sample_A();
        Pavel.Sample_A();
    }

    private void Sample_A()
    {
        int[] numbers =
        { 5, 8, 4, 0, 6, 7, 9 };

        int result = 0;

        Arrays.sort(numbers);

        for (int i = 0; i <= 9; i++)
        {
            if (Arrays.binarySearch(numbers, i) < 0)
            {
                result += i;
            }
            System.out.println(Arrays.binarySearch(numbers, i));
        }

        System.out.print(result);
    }
}
