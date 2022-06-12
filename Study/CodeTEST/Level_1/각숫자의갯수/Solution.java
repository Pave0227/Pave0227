package Level_1.각숫자의갯수;

import java.util.*;
import java.util.stream.Stream;

public class Solution 
{
    
    public static void main(String[] arg)
    {
        Solution Pavel = new Solution();
        // Pavel.Counting(100,150);
        Pavel.Count_Multiply(10, 15);

   
}

    public void Counting(int a,int n)
    {
        int[] Count_Numbers = new int[10];
        
        for( int i =a; i<=n; i++)
        {
            int[] digits = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).toArray();

            for(int y=0; y<digits.length; y++)
            {
                switch(digits[y])
                {
                    case 0:
                    Count_Numbers[0]++;
                    break;

                    case 1:
                    Count_Numbers[1]++;
                    break;

                    case 2:
                    Count_Numbers[2]++;
                    break;

                    case 3:
                    Count_Numbers[3]++;
                    break;

                    case 4:
                    Count_Numbers[4]++;
                    break;

                    case 5:
                    Count_Numbers[5]++;
                    break;

                    case 6:
                    Count_Numbers[6]++;
                    break;

                    case 7:
                    Count_Numbers[7]++;
                    break;

                    case 8:
                    Count_Numbers[8]++;
                    break;

                    case 9:
                    Count_Numbers[9]++;
                    
                }
            }
        }

        for(int z=0; z<Count_Numbers.length; z++)
        {
            System.out.println(z+ "은 :" +Count_Numbers[z]+ "번 나왔어요");
        }
    }

    public void Counting2(int a,int b)
    {
        
        int box[] = new int[10];//각 숫자를 저장할 공간
        for (int i = a; i <= b ; i++) 
       {
         box[i%10]++;//일의 자리
         if (i>=10)  box[i/10%10]++;//십의 자리
         if (i>=100) box[i/100%10]++;//백의 자리
         if (i==1000) box[i/1000%10]++;//천의 자리
       }
          System.out.println(Arrays.toString(box));
    }

    public void Count_Multiply(int a,int b)
    {
        int temp = 1;
        int temp_sum = 0;

        for( int i=a; i<=b; i++)
        {
            int[] digits = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).toArray();

            for(int y=0; y<digits.length; y++)
            { 
                temp *= digits[y];
            }
            temp_sum += temp;
            temp = 1;

       }

       System.out.println(a+"부터 "+b+ "까지 분해한 숫자들의 곱의 합은 :" +temp_sum);
    }
}
