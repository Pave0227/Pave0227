package Home_Work.Y22_07_20;

import java.util.Arrays;

public class Solution
{
    public static void main(String[] arg)
    {

        Solution Pavel = new Solution();
        Pavel.solution();
    }

    private void solution()
    {
        String[] name =
        { "영우", "지영", "진영", "혜미", "진수" };
        int[][] score = new int[5][3];

        for (int[] sco : score)
        {
            for (int i = 0; i < sco.length; i++)
            {
                sco[i] = (int) (Math.random() * 50) + 50;

            }
        }

        for (int i = 0; i < score.length; i++)
        {
            System.out.println("=========================================");
            System.out.println(name[i] + "의 점수는 " + Arrays.toString(score[i]));
            System.out.println(name[i] + "의 총점은 " + Arrays.stream(score[i]).sum());
            System.out.println(name[i] + "의 평균은 " + Arrays.stream(score[i]).sum() / score[i].length);
            System.out.println(name[i] + "의 평균은 " + Arrays.stream(score[i]).average().orElse(1));

            ;

        }

    }
}
