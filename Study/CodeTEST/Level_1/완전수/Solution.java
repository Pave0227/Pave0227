package Level_1.완전수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Solution 
{
 
    public static void main(String[] arg)
    {
        Solution Pavel = new Solution();
        Pavel.Solution_1();
    }

    public void Solution_1()
    {
        System.out.println("최대치을 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> perfect = new ArrayList<>();
        sc.close();

        for(int i=2; i<=num; i++)
        {
               if(isPerfectNumber(i))
               {
                   perfect.add(i);
                   
               }
        }

        perfect.stream().forEach(System.out::println);
        
    }

    public boolean isPerfectNumber(int n)
    {
        List<Integer> num_test = new ArrayList<>();
        num_test.add(1);

        for(int i=2; i<= Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {        
                num_test.add(i);
                num_test.add(n/i);
            }
        }

        int sum = num_test.stream().mapToInt(Integer::intValue).sum();

        return  sum == n;
    }
}
