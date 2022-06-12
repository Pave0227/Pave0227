package PG_Lv_1.크레인인형뽑기;

import java.util.ArrayList;

public class Sample_A
{

    public static void main(String[] arg)
    {
        Sample_A Pavel = new Sample_A();
        Pavel.Sample();
    }

    private void Sample()
    {
        int[][] board =
        {
                { 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 3 },
                { 0, 2, 5, 0, 1 },
                { 4, 2, 4, 4, 2 },
                { 3, 5, 1, 3, 1 } };

        int[] moves =
        { 1, 5, 3, 5, 1, 2, 1, 4 };

        ArrayList<Integer> gotchar = new ArrayList<>();

        int result = 0;
        // 뽑기 횟수만큼 반복
        for (int i = 0; i < moves.length; i++)
        {
            // 뽑기기계 기계 칸 위부터 확인
            for (int[] boa : board)
            {
                // 값이 0이면 비었음으로 다음 칸을 확인한다
                if (boa[moves[i] - 1] == 0)
                {
                    continue;
                }
                else
                {
                    gotchar.add(boa[moves[i] - 1]); // 뽑은것에 추가하고
                    boa[moves[i] - 1] = 0; // 해당 칸은 0으로
                    break;
                }
            }
        }

        // 2개이상 쌓인거 제거
        loop: while (true)
        {
            for (int i = 1; i < gotchar.size(); i++)
            {
                if (gotchar.get(i - 1) == gotchar.get(i))
                {
                    gotchar.remove(i - 1);
                    gotchar.remove(i - 1);
                    result += 2;
                    continue loop;
                }
            }
            break;
        }

        gotchar.forEach(System.out::println);
        System.out.println("");
        System.out.println(result);

    }

}
