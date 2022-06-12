package Level_1.피타고라스;

import java.util.ArrayList;

public class Solution 
{
    public static void main(String[] arg)
    {
        Solution Pavel = new Solution();
        Pavel.Solution_1();
    }   
    
    public void Solution_1()
    {
        ArrayList<Integer> Pavel = new ArrayList<>();

        //A+B+C = 1000 , a+b > c , c < 500 , a<b<c<500 
        for(int i=1; i<500; i++)
        {
            //a, b 를 c 로 정리를 하면 c - b = a^2 / (1000-a), c - a = b^2 / (1000-b) 
            // i의 2승 / 1000-i가 자연수 일때 통과 
            if((Math.pow(i, 2) / (1000-i)) % 1 ==0)
            {
                Pavel.add(i);
            }
        }

        
        Pavel.add(1000 - Pavel.stream().mapToInt(Integer::intValue).sum());
        Pavel.stream().forEach(System.out::println);

        System.out.println(Pavel.get(0) * Pavel.get(1) * Pavel.get(2));
        
      
        
    
    } 
}
