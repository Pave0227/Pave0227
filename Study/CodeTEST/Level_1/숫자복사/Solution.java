package Level_1.숫자복사;

import java.util.*;

// 0~9까지의 문자로 된 숫자를 입력 받았을 때, 이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만 사용된 것인지 확인하는 함수를 구하시오.

// sample inputs: 0123456789 01234 01234567890 6789012345 012322456789

// sample outputs: true false false true false
public class Solution 
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자열을 입력해주세요");
        
    
        String Temp_String = sc.next();
        boolean Check_Overlap = true;


       
        for(int i=0; i<Temp_String.length(); i++)
        {    
            if(!Check_Overlap)
            break;

            for(int f=0; f<=9; f++)
            {
                if(!Check_Overlap)
                break;

                String Tem_St1 = Temp_String.substring(i, i+1);
                
                String Tem_St2 = Temp_String.substring(i+1,Temp_String.length());

                String indexf = String.valueOf(f);
                // System.out.println(Tem_St1+" "+Tem_St2);
                // System.out.println(Tem_St1.indexOf(String.valueOf(f))+" "+Tem_St2.indexOf(String.valueOf(f)));
                
                 if(Tem_St1.indexOf(indexf) >= 0 && Tem_St2.indexOf(indexf) >= 0)
                 {
                         Check_Overlap = false;
                         break;   
                 }

            }     

        }

        if(Check_Overlap)
        {
            System.out.println("중복이 없습니다 : " +String.valueOf(Check_Overlap));
        }
        if(!Check_Overlap)
        {
            System.out.println("중복이 있습니다 : " +String.valueOf(Check_Overlap));
        }

        System.out.println("문자열의 길이:" +Temp_String.length());

        sc.close();
    }
}
