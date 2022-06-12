package PG_Lv_1.크레인인형뽑기;

import java.util.Stack;

public class Sample_B
{

    public static void main(String[] arg)
    {
        Sample_B Pavel = new Sample_B();
        Pavel.Sample();
    }

    private int Sample()
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

        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        // 뽑기 시행
        for (int move : moves)
        {
            // 뽑기기계 위칸부터 확인
            for (int j = 0; j < board.length; j++)
            {

                if (board[j][move - 1] != 0)
                {

                    if (stack.isEmpty())
                    {
                        stack.push(board[j][move - 1]);
                        board[j][move - 1] = 0;
                        break;
                    }
                    // 현재 뽑는 숫자가 스택 맨위 칸과 동일하면 해당 값 삭제 추가하진 않음
                    else if (board[j][move - 1] == stack.peek())
                    {
                        stack.pop();
                        answer += 2;
                    }
                    else
                        stack.push(board[j][move - 1]);
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
