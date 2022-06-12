package Level_1.평균;

import java.util.Arrays;
public class Solution 
{
    public static void main(String[] arg)
    {
        Solution Pavel = new Solution();
        Pavel.Solution1();
    }   
    
    public void Solution1()
    {
        int[] int_arr = {6,34,1,32,22};
        double average = Arrays.stream(int_arr).average().orElse(0);

        System.out.println(average);
    }
}
