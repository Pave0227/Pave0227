package PG_Lv_2.단체사진_004;

// byte         8bits    -2^7 ~ 2^7-1 (-128 ~ 127)
// short       16bits    -2^15 ~ 2^15-1 (-32768 ~ 32767)
// int         32bits    -2^31 ~ 2^31-1 (-2147483648 ~ 2147483647)
// long        64bits    -2^63 ~ 2^63-1 (-9223372036854775808 ~ 9223372036854775807)
// float       32bits    0x0.000002P-126f ~ 0x1.fffffeP+127f
// double      64bits    0x0.0000000000001P-1022 ~ 0x1.fffffffffffffP+1023  
// char        16bits    \u0000 ~ \uffff (0 ~ 2^15-1) * 자바에서 unsgined로 동작하는 자료형
// boolean 1 bit true,false

public class Sample_B
{

    // 사진찍는 사람들
    private final String[] user_list =
    { "A", "C", "F", "J", "M", "N", "R", "T" };

    // 조건을 충족한 경우의 수
    private int result = 0;

    // 경우의 수
    private int test = 0;

    public static void main(String[] arg)
    {
        long start_time = System.currentTimeMillis();
        // todo -----------------------------------------------

        Sample_B Pavel = new Sample_B();
        Pavel.Sample();

        // todo -----------------------------------------------
        long end_time = System.currentTimeMillis();

        System.out.println("-----------------------------------------------");
        System.out.printf("%s%f%s", "수행시간 ", (float) (end_time - start_time) / 1000, "초");

    }

    private void Sample()
    {
        boolean[] visited = new boolean[user_list.length];

        String[] data =
        { "N~F=0", "R~T>2" };

        String list = "";

        // ! ---------------------------------------------------

        // 경우의수을 담을 list
        // 이미 list에 해당 인원을 담았는지 확인하는 visited
        // 요구조건이 담긴 data
        DFS_Search(list, visited, data);

        System.out.println(test);
        System.out.println(result);
    }

    // DFS 탐색으로 String list에 경우의 수 내에 나란히 서는 순서가 담긴 문자열을 담는다.
    private void DFS_Search(String list, boolean[] visited, String[] data)
    {
        // list에 마지막 사람까지 적으면
        if (list.length() == user_list.length)
        {
            ++test;
            // 요구 조건에 충족하는지 확인한다. 충족하면 result값을 + 해준다.
            if (Check_Condition(list, data))
            {
                ++result;
            }
            // 빠져나가기
            return;
        }

        // DFS 탐색 시작, 재귀로 경우의 수을 전부 탐색한다.
        for (int x = 0; x < user_list.length; x++)
        {
            // 방문하지 않은 경우에만
            if (!visited[x])
            {
                visited[x] = true;
                String list_temp = list + user_list[x];
                DFS_Search(list_temp, visited, data);
                visited[x] = false;
            }
        }
    }

    // 제시된 조건 condition에 경수의 수내에 list가 충족하는지 확인한다.
    private boolean Check_Condition(String list, String[] data)
    {
        // data ForEach
        for (String dat : data)
        {

            // 조건에서 요구하는 두 명의 포지션
            int user1_position = list.indexOf(dat.charAt(0));
            int user2_position = list.indexOf(dat.charAt(2));

            // 거리을 유지하고 싶은 방식 (= , > , <)
            char how_distance = dat.charAt(3);

            // 원하는 거리
            int distance = dat.charAt(4) - '0';

            // distance에 1을 더하는 이유는 문제에서 사람이 옆에 있는 경우을 0으로 취급하기때문에
            if (how_distance == '=' && !(Math.abs(user1_position - user2_position) == distance + 1))
            {
                return false;
            }
            else if (how_distance == '>' && !(Math.abs(user1_position - user2_position) > distance + 1))
            {
                return false;
            }
            else if (how_distance == '<' && !(Math.abs(user1_position - user2_position) < distance + 1))
            {
                return false;
            }
        }

        return true;
    }
}
