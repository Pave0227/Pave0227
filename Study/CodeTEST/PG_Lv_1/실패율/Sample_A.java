package PG_Lv_1.실패율;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
        int[] stages =
        { 3, 3, 3, 3 };
        int[] result = new int[n];

        HashMap<Integer, Float> count_map = new HashMap<>();

        for (int x = 1; x <= n; x++)
        {
            float temp_count = 0; // 해당 스테이지을 통과 못한 인원 체크
            float reach = stages.length; // 전체 인원

            for (int sta : stages)
            {
                if (sta < x) // 도착하지 못한 인원은 전체 인원에서 뺸다
                {
                    --reach;
                }
                else if (sta == x)
                {
                    ++temp_count;
                }
            }

            // System.out.print(temp_count);
            // System.out.println(" " + reach);

            // float 숫자 0.0을 나눌려고하면 nan 예외 발생
            if (temp_count == 0) // 해당 스테이지에 머무르는 인원이 없으면 실패율 0으로 처리함
            {
                count_map.put(x, (float) 0.0);
                continue;
            }
            count_map.put(x, temp_count / reach); // 해당 스테이지 @ 실패율
        }


        List<HashMap.Entry<Integer, Float>> entry_list = new LinkedList<>(count_map.entrySet());

        entry_list.sort(new Comparator<Map.Entry<Integer, Float>>()
        {
            public int compare(Map.Entry<Integer, Float> o1, Map.Entry<Integer, Float> o2)
            {
                return Float.compare(o2.getValue(), o1.getValue());
            }
        });

        for (int y = 0; y < n; y++)
        {
            result[y] = entry_list.get(y).getKey();
        }

        entry_list.forEach(a -> System.out.println(a.getValue()));
        entry_list.forEach(a -> System.out.println(a.getKey()));

    }
}
