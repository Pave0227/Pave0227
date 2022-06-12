package Level_1.메모리공간을동적으로;

import java.util.*;

public class Solution 
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("입력할 정수의 갯수을 설정 해주세요");
        int Total_List = sc.nextInt();
        int Total = 0;
        // int Average = 0;

        for(int i=1; i<Total_List+1; i++)
        {
            System.out.println("전체" +Total_List+ "번쨰 중에서" +i+"번째 정수을 입력해주세요" );
            int Temp = sc.nextInt();
            Total += Temp;
        }

        System.out.println("정수의 총합은: " + Total);
        System.out.println("정수의 평균은: " +Total/Total_List);

        sc.close();
    }
}
