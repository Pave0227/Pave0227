package PG_Lv_1.삼진법뒤집기;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sample_A
{

    public static void main(String[] arg)
    {
        Sample_A Pavel = new Sample_A();
        Pavel.Sample();
    }

    private void Sample()
    {
        int n = 500;

        HashMap<Integer, Integer> three_map = new HashMap<>();

        //3진수 최대값 지수 만큼 map 형성
        int y=0;
        while (true)
        {
            if (n < Math.pow(3, y))
            {
                for (int z = 0; z < y; z++)
                {
                    three_map.put(z, 0);
                }
                break;
            }
            ++y;
        }
    
        // 3진수 값 형성
        for (int x = 1; x < x + 1; x++)
        {
            if (n == 0)
            {
                break;
            }

            if (n < Math.pow(3, x))
            {
                n -= Math.pow(3, x - 1);
                three_map.put(x - 1, three_map.getOrDefault(x - 1, 0) + 1);
                x = 0;
            }
        }

        // 지수 기준으로 내림차순
        List<HashMap.Entry<Integer, Integer>> three_list = new LinkedList<>(three_map.entrySet());

        three_list.sort(new Comparator<Map.Entry<Integer, Integer>>()
        {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
            {
                return Integer.compare(o2.getKey(), o1.getKey());
            }
        });

        int result = 0;
        int temp = 0;
    
        for(HashMap.Entry<Integer,Integer> thr : three_list)
        {
            if (thr.getValue() == 0)
            {
                ++temp;
                continue;
            }

            result += Math.pow(3, temp) * thr.getValue();
            ++temp;
        }

        // ! Test Line      
        three_list.forEach(a -> System.out.print(a.getKey() + " - " + a.getValue() + "\n"));

    }
}
