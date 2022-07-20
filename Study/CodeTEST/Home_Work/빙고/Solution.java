package Home_Work.빙고;

import java.util.Scanner;

public class Solution
{
    public static void main(String[] arg)
    {

        Solution Pavel = new Solution();
        Pavel.solution();
    }

    private void solution()
    {
        int[] number = new int[25];

        int dest, sour, temp;

        int bingo_count = 0;
        int input_num = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < number.length; i++)
        {
            number[i] = i + 1;
        }

        for (int i = 0; i < number.length; i++)
        {
            dest = (int) (Math.random() * 25);
            sour = (int) (Math.random() * 25);

            temp = number[dest];
            number[dest] = number[sour];
            number[sour] = temp;
        }

        while (true)
        {
            System.out.println("빙고 카운트 :" + bingo_count);

            for (int i = 0; i < number.length; i++)
            {
                if (number[i] == 35)
                {
                    System.out.print((char) number[i] + "\t");
                }
                else
                {
                    System.out.print(number[i] + "\t");
                }

                if ((i + 1) % 5 == 0)
                {
                    System.out.printf("%n%n");
                }
            }

            System.out.print("원하는 숫자를 입력 : ");
            String input_str = scanner.nextLine();
            input_num = Integer.parseInt(input_str);

            for (int i = 0; i < number.length; i++)
            {
                if (number[i] == input_num)
                {
                    number[i] = 35;
                }
            }

            for (int i = 0; i < 5; i++)
            {
                if (number[i * 5] == 35 && number[i * 5 + 1] == 35 && number[i * 5 + 2] == 35 && number[i * 5 + 3] == 35
                        && number[i * 5 + 4] == 35)
                {
                    bingo_count++;
                }

                if (number[i] == 35 && number[i + 5 * 1] == 35 && number[i + 5 * 2] == 35 && number[i + 5 * 3] == 35
                        && number[i + 5 * 4] == 35)
                {
                    bingo_count++;
                }
            }

            if (number[0] == 35 && number[6] == 35 && number[12] == 35 && number[18] == 35 && number[24] == 35)
            {
                bingo_count++;
            }

            if (number[4] == 35 && number[8] == 35 && number[12] == 35 && number[16] == 35 && number[20] == 35)
            {
                bingo_count++;
            }
        }
    }
}
