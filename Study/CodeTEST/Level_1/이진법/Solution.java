package Level_1.이진법;

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
        int n_int = 74;
        
        String msg = Integer.toBinaryString(n_int);
        System.out.println(msg);
    } 

    public void Solution_2()
    {
        int n_int = 4;
        int i = 1;
        boolean check = false;
        ArrayList<Integer> Pavel = new ArrayList<Integer>();

        while(!check)
        {
            if(n_int == 0)
            {
                check = true;
            }
            if(n_int == 1)
            {
                Pavel.add(1);
                check = true;
            }
            if((i+1)*(i+1) > n_int)
            {
                n_int -= (i*i);
                Pavel.add((i*i));
                i = 1;
            }
            ++i;
        }

    
        }
    }

