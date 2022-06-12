package Level_1.시간을합하면;

// 디지털 시계에 하루동안(00:00~23:59) 3이 표시되는 시간을 초로 환산하면 총 몇 초(second) 일까요?

// 디지털 시계는 하루동안 다음과 같이 시:분(00:00~23:59)으로 표시됩니다.

// 00:00 (60초간 표시됨)
// 00:01 
// 00:02 
// ...
// 23:59
public class Solution 
{
    public static void main(String[] arg)
    {

        Solution Pavel = new Solution();
        Pavel.Time_Check_Sec(3);
    }

    public void Time_Check_Sec(int number)
    {

        int sec = 0;

        String String_Number = String.valueOf(number);

        for(int h = 0; h<24; h++)
        {
            String test = String.valueOf(h);

            if(test.indexOf(String_Number) >= 0)
            {
                sec += 3600;
            }

            if(test.indexOf(String_Number) < 0)
            {
                
                for(int m=0; m<=60; m++)
                {
                    String mintest = String.valueOf(m);

                    if(m>10 && mintest.substring(0,1).equals(String_Number))
                    {
                        sec += 60;
                    }
                    else if(mintest.endsWith(String_Number))
                    {
                        sec += 60;
                    }
                }
            }


        }

        System.out.println(sec);

    }
}
