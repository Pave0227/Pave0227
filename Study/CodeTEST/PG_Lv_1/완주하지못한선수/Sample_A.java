package PG_Lv_1.완주하지못한선수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

// todo 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다. 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

public class Sample_A
{

    public static void main(String[] arg)
    {
        Sample_A Pavel = new Sample_A();
        Pavel.Sample_A();
    }

    private void Sample_A()
    {

        String[] participant =
        { "mislav", "stanko", "mislav", "ana" };

        String[] completion =
        { "stanko", "ana", "mislav" };

        Arrays.sort(participant);
        Arrays.sort(completion);

        int x;
        for (x = 0; x < completion.length; x++)
        {
            if (!participant[x].equals(completion[x]))
            {
                break;
            }
        }

    }

    private void Sample_B()
    {

        String[] participant =
        { "mislav", "stanko", "mislav", "ana" };

        String[] completion =
        { "stanko", "ana", "mislav" };

        String answer = "";

        HashMap<String, Integer> hm = new HashMap<>();

        for (String part : participant)
            hm.put(part, hm.getOrDefault(part, 0) + 1);

        for (String comp : completion)
            hm.put(comp, hm.get(comp) - 1);

        for (HashMap.Entry<String, Integer> entry : hm.entrySet())
        {
            if (entry.getValue() != 0)
            {
                answer = entry.getKey();
                break;
            }
        }

    }
}
