package PG_Lv_1.로또결과;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Stream;

public class Sample
{

    public static void main(String[] arg)
    {
        Sample Pavel = new Sample();
        Pavel.Sample1();
        Pavel.Sample2();
    }

    private void Sample1()
    {
        // 0은 로또 번호중 가려져 알수 없는 숫자이다
        int[] lottos =
        { 44, 1, 0, 0, 31, 25 };
        int[] win_nums =
        { 31, 10, 45, 1, 6, 19 };
        int[] answer =
        { 0, 0 };
        int take = 0;

        HashSet<Integer> user = new HashSet<>(Arrays.asList(Arrays.stream(lottos).boxed().toArray(Integer[]::new)));

        HashSet<Integer> win = new HashSet<>(Arrays.asList(Arrays.stream(win_nums).boxed().toArray(Integer[]::new)));

        // 교집합 이용해 맞춘 로또 번호의 갯수을 유추
        HashSet<Integer> result = new HashSet<>(user);

        result.retainAll(win);

        // 유추가 안되는 번호가 있으면 take 값을 ++한다
        for (int i : lottos)
        {
            if (i == 0)
            {
                ++take;
            }
        }

        // 최고 순위 판정 확정적으로 맞춘 번호의 갯수에 , 유추가 안되는 번호가 맞았다는 가정하에 최고 순위을 판정한다
        switch (result.size() + take)
        {
        case 6:
        {
            answer[0] = 1;
            break;
        }
        case 5:
        {
            answer[0] = 2;
            break;
        }
        case 4:
        {
            answer[0] = 3;
            break;
        }
        case 3:
        {
            answer[0] = 4;
            break;
        }
        case 2:
        {
            answer[0] = 5;
            break;
        }
        default:
        {
            answer[0] = 6;
            break;
        }

        }
        // 반대로 최하 순위는 유추가 안되는 번호가 다 못맞췄다는 가정하에 판정
        answer[1] = answer[0] + take;

        // 6등이하는 있을수 없으니 6등으로 고정
        if (answer[1] >= 6)
        {
            answer[1] = 6;
        }

        Arrays.stream(answer).forEach(System.out::println);

    }

    private void Sample2()
    {

        int[] lottos =
        { 44, 1, 0, 0, 31, 25 };
        int[] win_nums =
        { 31, 10, 45, 1, 6, 19 };

        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        int zeroCount = 0;

        for (int lotto : lottos)
        {
            if (lotto == 0)
            {
                zeroCount++;
                continue;
            }
            map.put(lotto, true);
        }

        int sameCount = 0;
        for (int winNum : win_nums)
        {
            if (map.containsKey(winNum))
                sameCount++;
        }

        int maxRank = 7 - (sameCount + zeroCount);
        int minRank = 7 - sameCount;
        if (maxRank > 6)
            maxRank = 6;
        if (minRank > 6)
            minRank = 6;

        Arrays.stream(new int[]
        { maxRank, minRank }).forEach(System.out::println);

    }
}
