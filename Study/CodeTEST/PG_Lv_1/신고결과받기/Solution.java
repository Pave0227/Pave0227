package PG_Lv_1.신고결과받기;

import java.util.*;
import java.util.stream.Collectors;

public class Solution
{
    public static void main(String[] arg)
    {
        Solution Pavel = new Solution();
        Pavel.Solution1();
    }

    private void Solution1()
    {
        String[] id_list =
        { "muzi", "frodo", "apeach", "neo" };
        String[] report =
        { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
        int k = 1;

        int[] result = new int[id_list.length]; // 유저별 보낼 메일갯수 배열
        HashMap<String, Integer> index_map = new HashMap<>(); // Key: 유저네임,Value: 인덱스값
        HashMap<String, ArrayList<Integer>> list_map = new HashMap<>(); // Key : 용의자 , Value:신고한 유저들의 인덱스값 배열

        for (int i = 0; i < id_list.length; i++)
        {
            index_map.put(id_list[i], i); // 유저네임@인덱스값 할당
        }

        for (String rep : report)
        {
            String[] temp_str = rep.split(" ");

            System.out.println();

            String report_er = temp_str[0], suspect_er = temp_str[1];

            if (!list_map.containsKey(suspect_er)) // 용의자 @ 신고자 인덱스배열
            {
                list_map.put(suspect_er, new ArrayList<>());
            }

            ArrayList<Integer> temp_list = list_map.get(suspect_er); // list 밸브값을 넣기위해 임시 리스트 할당

            if (!temp_list.contains(index_map.get(report_er))) // 신고자 정보가 없으면 리스트에 신고자 인덱스을 할당
            {
                temp_list.add(index_map.get(report_er));
            }
        }

        for (int i = 0; i < id_list.length; i++)
        {
            String id = id_list[i];
            if (list_map.containsKey(id) && list_map.get(id).size() >= k)
            {
                for (int y : list_map.get(id))
                {
                    result[y]++;
                }
            }
        }

        System.out.println(Arrays.toString(result));

    }

    public int[] Solution2(String[] id_list, String[] report, int k)
    {

        int[] ret = new int[id_list.length];
        Map<String, Integer> index = new HashMap<>();
        Map<String, List<Integer>> list = new HashMap<>();

        // 키값의 유저네임 들어감 밸브값으로 인덱스값 삽입
        for (int i = 0; i < id_list.length; i++)
        {
            index.put(id_list[i], i); // Key : 유저 닉네임 , Value : 인덱스값
        }

        // 리포트 정보 반복
        for (String rep : report)
        {
            // 신고자와 신고당한 자
            String[] ids = rep.split("");
            // fromId = 신고자 toID = 신고당한 자
            String fromId = ids[0], toId = ids[1];

            // 만약 맵 list가 신고당한자을 키값으로 가지고 있지않다면
            if (!list.containsKey(toId))
                list.put(toId, new ArrayList<>()); // Key:신고당한자 Value : 리스트객체

            // 리스트 tmp에 신고당한자의 밸브값(리스트객체) 할당
            List<Integer> temp = list.get(toId);

            // 만약 리스트 tmp가 index의 해당 유저닉넴의 밸브값(Index)을 가지고 있지 않다면d
            if (!temp.contains(index.get(fromId)))
                temp.add(index.get(fromId)); // 리스트 tmp에 인덱스값을 삽입
        }

        // 유저리스트 정보 반복
        for (int i = 0; i < id_list.length; i++)
        {
            String id = id_list[i];

            // 맵 list에 Key값이 해당 유저 네임과 일치하고 @ 대상자가 신고 당한 횟수가 k이상이면
            if (list.containsKey(id) && list.get(id).size() >= k)
            {

                // 신고자에게 해당 대상자가 정지 되었음을 알린다
                for (int idx : list.get(id))
                {
                    ret[idx]++;
                }
            }
        }

        return ret;
    }

    public int[] Solution3(String[] id_list, String[] report, int k)
    {

        // distinct로 중복제거후(같은 유저가 두번이상 같은 대상을 신고할수 없음) collect 리스트 형변환
        List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList()); // 신고 내역리스트

        HashMap<String, Integer> count = new HashMap<>(); // 용의자 @ 신고당한 횟수

        for (String s : list)
        {
            String target = s.split(" ")[1];
            count.put(target, count.getOrDefault(target, 0) + 1);
        }

        return Arrays.stream(id_list).map(_user ->
        {
            final String user = _user;

            List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());

            return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count(); // 리턴값이 long임

        }).mapToInt(Long::intValue).toArray();
    }

}
