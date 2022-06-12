package Level_1.정수소수구별;


import java.util.Scanner;

public class Solution 
{
    public static void main(String[] arg)
    {
        Solution Pavel = new Solution();
        Pavel.Solution1();
    }   

    private void Solution1()
    {
        Scanner sc = new Scanner(System.in);
        String[] msg = sc.nextLine().split("");
        sc.close();
        
        for(String i:msg)
        {
            try
            {
                System.out.println(Integer.parseInt(i)+ " 정수입니다");
            }
            catch(NumberFormatException e)
            {
                System.out.println(i+ " 문자입니다");
            }
            
        }
        
    }
}
