package PG_Lv_1.체육복;

import java.util.Arrays;
import java.util.HashMap;

public class Sample_A
{
    public static void main(String[] arg)
    {
        Sample_A Pavel = new Sample_A();
        Pavel.Sample_A();
    }

    private void Sample_A()
    {
        int n = 5;
        int[] lost =
        { 1, 2, 4 };
        int[] reserve =
        { 2, 4, 5 };

        Arrays.sort(lost);
        Arrays.sort(reserve);

        int count = 0;

        HashMap<Integer, int[]> map = new HashMap<>();

        // 체육복을 빌려줄수 있는 사람만 맵으로 생성
        for (int res : reserve)
        {
            
            if (Arrays.binarySearch(lost, res) < 0)
            {
                int[] temp =
                { res - 1, res + 1 };

                map.put(res, temp);
            }
        }

        // map.entrySet().forEach(i -> System.out.println(i.getKey()));

        for (int lo : lost)
        {
            // 여벌이 있는 인원 스킵
            if (Arrays.binarySearch(reserve, lo) >= 0)
            {
                continue;
            }

            //
            boolean counter = false;
            for (HashMap.Entry<Integer, int[]> entry : map.entrySet())
            {
                if (Arrays.binarySearch(entry.getValue(), lo) >= 0)
                {
                    counter = true;
                    map.remove(entry.getKey());
                    break;
                }
            }
            if (!counter)
                ++count;
        }

        System.out.print(n - count);

        // return n - count;
    }
}
