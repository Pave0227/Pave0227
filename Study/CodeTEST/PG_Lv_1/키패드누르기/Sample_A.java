package PG_Lv_1.키패드누르기;

import java.util.Arrays;
import java.util.HashMap;

public class Sample_A
{
    public static void main(String[] arg)
    {
        Sample_A Pavel = new Sample_A();
        Pavel.Sample();
    }

    private void Sample()
    {
        int[] numbers =
        { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };

        String hand = "right";

        int left_index = 10;
        int right_index = 12;

        StringBuffer answer = new StringBuffer();

        for (int n : numbers)
        {
            // 왼손 숫자들이면 왼손으로 기록
            if (n == 1 || n == 4 || n == 7)
            {
                answer.append("L");
                left_index = n;
            }

            // 오른손 숫자들이면 오른손으로 기록
            if (n == 3 || n == 6 || n == 9)
            {
                answer.append("R");
                right_index = n;
            }

            // 가운데 숫자들이면 판별
            if (n == 2 || n == 5 || n == 8 || n == 0)
            {
                // 각 손가락의 누를 숫자의 거리차이을 받는다
                int left_dif = getLength(left_index, n);
                int right_dif = getLength(right_index, n);

                // 두 손가락 거리가 같으면, 주로 사용하는 손 기준으로 누름
                if (left_dif == right_dif)
                {
                    if (hand.equals("left"))
                    {
                        answer.append("L");
                        left_index = n;
                    }
                    else if (hand.equals("right"))
                    {
                        answer.append("R");
                        right_index = n;
                    }
                }
                // 아니면 어느쪽 손가락이 가까운지 따라서 결정
                else
                {
                    if (left_dif > right_dif)
                    {
                        answer.append("R");
                        right_index = n;
                    }
                    else if (left_dif < right_dif)
                    {
                        answer.append("L");
                        left_index = n;
                    }
                }
            }
        }
        System.out.print(answer);

    }

    public static int getLength(int index, int number)
    {
        // 숫자 0의 경우 11로 치환
        index = (index == 0) ? 11 : index;
        number = (number == 0) ? 11 : number;

        // 손가락의 위치좌표
        int x = (index - 1) / 3;
        int y = (index - 1) % 3;

        // 누를 숫자의 위치 좌표
        int numberX = number / 3;
        int numberY = 1;

        // 좌표값의 격차을 리턴
        return Math.abs(x - numberX) + Math.abs(y - numberY);
    }

}
