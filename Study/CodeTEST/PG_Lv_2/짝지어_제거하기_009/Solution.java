package PG_Lv_2.짝지어_제거하기_009;

import java.util.Stack;

class Solution
{

    public static void main(String[] arg)
    {
        Solution Pavel = new Solution();
        Pavel.solution("ABBABB");
    }

    public int solution(String s)
    {
        if (s.length() % 2 != 0)
        {
            return 0;
        }
        int answer = -1;
        Stack<Character> stack = new Stack<>();

        // 문자제거하기
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == c)
            {
                stack.pop();
            }
            else
            {
                stack.push(c);
            }

        }
        answer = (stack.size() == 0) ? 1 : 0;
        return answer;
    }
}
