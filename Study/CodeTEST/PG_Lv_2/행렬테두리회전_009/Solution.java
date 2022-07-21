package PG_Lv_2.행렬테두리회전_009;

import java.util.Arrays;

public class Solution
{
    public static void main(String[] arg)
    {

        Solution Pavel = new Solution();

        int[][] queries =
        {
                { 2, 2, 5, 4 },
                { 3, 3, 6, 6 },
                { 5, 1, 6, 3 } };

        Pavel.solution(6, 6, queries);

    }

    public int[] solution(int rows, int columns, int[][] queries)
    {
        int[][] int_table = new int[rows][columns];

        for (int x = 0; x < int_table.length; x++)
        {
            for (int y = 0; y < int_table[x].length; y++)
            {
                int_table[x][y] = (x * rows) + y + 1;
            }
        }

        for (int x = 0; x < 2; x++)
        {
            int start_x = queries[x][0] - 1;
            int start_y = queries[x][1] - 1;
            int end_x = queries[x][2] - 1;
            int end_y = queries[x][3] - 1;

            int upper = int_table[start_x][end_y];

            int down_left = int_table[end_x][start_y];
            int down_right = int_table[end_x][end_y];

            for (int i = end_y; i > start_y; i--)
            {
                int_table[start_x][i] = int_table[start_x][i - 1];
            }

            for (int i = end_x; i > start_x; i--)
            {
                if (i == start_x + 1)
                {
                    int_table[i][end_y] = upper;
                    continue;
                }
                int_table[i][end_y] = int_table[i - 1][end_y];
            }

            for (int i = start_y; i < end_y; i++)
            {
                if (i == end_y - 1)
                {
                    int_table[end_x][i] = down_right;
                    continue;
                }

                int_table[end_x][i] = int_table[end_x][i + 1];
            }

            for (int i = start_x; i < end_x; i++)
            {
                if (i == end_x - 1)
                {
                    int_table[i][start_y] = down_left;
                    continue;
                }
                int_table[i][start_y] = int_table[i + 1][start_y];
            }

        }

        for (int[] tab : int_table)
        {
            System.out.println(Arrays.toString(tab));
        }

        int[] answer =
        {};
        return answer;
    }
}
