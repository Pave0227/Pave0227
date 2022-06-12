package PG_Lv_1.키패드누르기;

// ? 클래스 --------------------------------------------------------------------------
public class Sample_B
{
    // 0부터 9까지 좌표 {y,x}
    int[][] numpadPos =
    {
            { 3, 1 }, // 0
            { 0, 0 }, // 1
            { 0, 1 }, // 2
            { 0, 2 }, // 3
            { 1, 0 }, // 4
            { 1, 1 }, // 5
            { 1, 2 }, // 6
            { 2, 0 }, // 7
            { 2, 1 }, // 8
            { 2, 2 } // 9
    };
    // 초기 위치
    int[] leftPos =
    { 3, 0 };
    int[] rightPos =
    { 3, 2 };
    String hand;

    // ! 메소드
    // --------------------------------------------------------------------------
    public String solution(int[] numbers, String hand)
    {
        this.hand = (hand.equals("right")) ? "R" : "L";

        String answer = "";

        for (int num : numbers)
        {
            String press = Push_Number(num);
            answer += press;

            if (press.equals("L"))
            {
                leftPos = numpadPos[num];
                continue;
            }
            if (press.equals("R"))
            {
                rightPos = numpadPos[num];
                continue;
            }
        }
        return answer;
    }

    // num버튼을 누를 때 어디 손을 사용하는가
    private String Push_Number(int num)
    {
        if (num == 1 || num == 4 || num == 7)
            return "L";
        if (num == 3 || num == 6 || num == 9)
            return "R";

        // 2,5,8,0 일때 어디 손가락이 가까운가
        if (getDist(leftPos, num) > getDist(rightPos, num))
            return "R";
        if (getDist(leftPos, num) < getDist(rightPos, num))
            return "L";

        // 같으면 손잡이
        return this.hand;
    }

    // 해당 위치와 번호 위치의 거리
    private int getDist(int[] pos, int num)
    {
        return Math.abs(pos[0] - numpadPos[num][0]) + Math.abs(pos[1] - numpadPos[num][1]);
    }
}
