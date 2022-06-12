package Level_1.자신을제외한곱셈;

import java.util.ArrayList;

// 배열 [a, b, c, d]를 입력하면 배열[bcd, acd, abd, abc]를 출력하는 코드를 작성하시오.

// (단, 나눗셈 사용 금지)

// 입출력되는 배열은 어떤 형식이든 상관없습니다.
public class Solution 
{
    public static void main (String[] arg)
    {
        Solution Pavel = new Solution();
        Pavel.Solution1();
    }

    private void Solution1() 
    {
        int[] num_arr = {42,23,12,30};
        
        ArrayList<Integer> fin_list = new ArrayList<>(num_arr.length);
        

        

        for(int i=0; i<num_arr.length; i++)
        {
            int temp = 1;
            for(int y=0; y<num_arr.length; y++)
            {
                if(i == y)
                {
                    continue;
                }
                temp *= num_arr[y];
            }
            fin_list.add(temp);
        }

        fin_list.stream().forEach(System.out::println);;
    }
}
