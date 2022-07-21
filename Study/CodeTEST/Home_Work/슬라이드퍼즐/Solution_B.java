package Home_Work.슬라이드퍼즐;

import java.util.Scanner;

public class Solution_B
{
    public static void main(String[] arg)
    {

        Solution_B Pavel = new Solution_B();
        Pavel.solution();
    }

    private void solution()
    {
        int[] number = new int[25];

        int dest, sour, temp;

        int key = 0;
        int save = 24; // 0의 위치
        int move; // 움직이기 변수

        Scanner scanner = new Scanner(System.in);

        for (int i = 24; i >= 0; i--)
        {
            number[save - i] = i;
        }

        for (int i = 0; i < 100; i++)
        {
            dest = (int) (Math.random() * 24);
            sour = (int) (Math.random() * 24);

            temp = number[dest];

            number[dest] = number[sour];
            number[sour] = temp;
        }

        while (true)
        {

            for (int i = 0; i < number.length; i++)
            {
                System.out.print(number[i] + "\t");

                if ((i + 1) % 5 == 0)
                {
                    System.out.printf("%n%n%n");
                }
            }

            String input_str = scanner.nextLine();
            key = Integer.parseInt(input_str);

            switch (key)
            {
            case 4:
                if (save % 5 == 0)
                {
                    break;
                }

                move = number[save];
                number[save] = number[save - 1];
                number[save - 1] = move;
                break;

            case 6:
                if ((save + 1) % 5 == 0)
                {
                    break;
                }

                move = number[save];
                number[save] = number[save + 1];
                number[save + 1] = move;
                save++;
                break;

            case 8:
                if (save < 5)
                {
                    break;
                }

                move = number[save];
                number[save] = number[save - 5];
                number[save - 5] = move;
                save -= 5;
                break;
            case 2:
                if (save >= 20)
                {
                    break;
                }

                move = number[save];
                number[save] = number[save + 5];
                number[save + 5] = move;
                save += 5;
                break;
            default:
                break;
            }

        }
    }
}
