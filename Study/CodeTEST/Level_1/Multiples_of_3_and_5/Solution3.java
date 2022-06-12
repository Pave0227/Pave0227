package Level_1.Multiples_of_3_and_5;

import java.util.stream.IntStream;


// 100미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
//1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
public class Solution3 
{
    int Select_Number = 0;

    public static void main(String[] arg)
    {
        System.out.println(String.format("정답은: %d", foo(1000)));
    }

    private static int foo(int end)
    {
        return IntStream.range(1,end).filter(j -> j%3 == 0 || j%5 == 0).sum();
    }

  

}
