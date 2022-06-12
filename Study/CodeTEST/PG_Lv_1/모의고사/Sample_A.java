package PG_Lv_1.모의고사;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Collector;

// todo 수포자는 수학을 포기한 사람의 준말입니다.수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.수포자는 1 번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

// todo 1 번 수포자가 찍는 방식:1,2,3,4,5,1,2,3,4,5,...2 번 수포자가 찍는 방식:2,1,2,3,2,4,2,5,2,1,2,3,2,4,2,5,...3 번 수포자가 찍는 방식:3,3,1,1,2,2,4,4,5,5,3,3,1,1,2,2,4,4,5,5,...

// todo 1 번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

public class Sample_A
{

    public static void main(String[] arg)
    {
        Sample_A Pavel = new Sample_A();
        Pavel.Sample_A();
    }

    private void Sample_A()
    {
        int[] answers =
        { 1, 2, 3, 4, 5, 6 };

        int[][] person =
        {
                { 1, 2, 3, 4, 5 },
                { 2, 1, 2, 3, 2, 4, 2, 5 },
                { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };

        int[] count = new int[person.length];

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < answers.length; i++)
        {
            if (answers[i] == person[0][i % person[0].length])
            {
                ++count[0];
            }
            if (answers[i] == person[1][i % person[1].length])
            {
                ++count[1];
            }
            if (answers[i] == person[2][i % person[2].length])
            {
                ++count[2];
            }
        }

        int max = Math.max(Math.max(count[0], count[1]), count[2]);

        for (int x = 0; x < count.length; x++)
        {
            if (count[x] == max)
            {
                list.add(x + 1);
            }
        }

        // return list.stream().mapToInt(i -> i.intValue()).toArray();

        list.stream().forEach(System.out::print);
    }

}
