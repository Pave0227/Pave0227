package Level_1.NumberSolution;

public class Solution2 
{
    public static void main(String[] arg)
    {
        Solution2 sol = new Solution2();
        sol.Print_Test("oneonetwofourfive");
    }

    //숫자로된 문자열을 Int로 변환해 리턴
    public int solution(String s)
    {
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        //array.length = 배열의 길이
        for(int i=0; i<words.length; i++)
        {
            //String.replace (수정대상문자열,수정문자열)
            //String.replaceall (정규식,수정문자열)
            //String.valueOf() int값을 숫자형의 문자열로 변환합니다
            //ex) 100 -> "100";             
            s = s.replace (words[i],String.valueOf(i));
        }

        //숫자형의 문자열을 매개변수로 받으면 해당 값을 @ 10진수의 int형으로 반환합니다
        return Integer.parseInt(s);
    }

    //출력
    public void Print_Test(String s)
    {
        System.out.println(solution(s));        
    }
}
