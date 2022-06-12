package Level_1.숫자문자열구별;

import java.util.ArrayList;

// 문자와 숫자가섞인 문자열을 입력받을때 구별하여출력해라

// input:

// "c910m6ia 1ho"

// output:

// str : cma ho

// int : 91061
public class Solution 
{

    public static void main(String[] arg)
    {
        Solution Pavel = new Solution();
        Pavel.Solution1();
    }

    private void Solution1()
    {
        String msg = "c910223 1dogo";
        ArrayList<Integer> int_list = new ArrayList<>();
        ArrayList<String> str_list = new ArrayList<>();
        

        for(int x=0; x<msg.length(); x++)
        {
            // 아스키코드 48 , 57 사이 검출 (숫자 검출시 리스트에 추가)
            if(48 <= msg.substring(x, x+1).hashCode() && msg.substring(x, x+1).hashCode() <= 57)
            {
                int_list.add(Integer.parseInt(msg.substring(x, x+1)));
            }
            //그외 문자열 추가
            else
            str_list.add(msg.substring(x, x+1));
        }

        int_list.forEach(System.out::print);
        System.out.println("");
        str_list.forEach(System.out::print);
        
    }
}
