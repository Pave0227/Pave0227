package Level_1.이진법;

import java.util.*;

public class Case 
{
    public static void main(String[] arg)
    {
        Case Pavel = new Case();
        Pavel.Case1();
    }
    
    public void Case1()
    {   
            int temp = 4;
    
            List<Integer> bin = new ArrayList<Integer>();
    
            while( temp > 1 ) 
            {                  
                bin.add(temp%2);  
                temp = temp/2;
            } 
            bin.add(1);
    
            System.out.print("Decimal : " + temp + " to Binary : " );
    
            for ( int i = bin.size()-1; i >=0; i-- ) 
            {
                System.out.print(bin.get(i));
            }
        
    }

    public void Case2()
    {
        int num = 2;
        StringBuilder sb = new StringBuilder();

        while (num > 0) 
        {
            sb.append(num % 2);
            num /= 2;
        }

        System.out.println(sb.reverse());
    }
}
