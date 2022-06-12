package Level_1.탭을_공백문자로_바꾸기;

// A씨는 개발된 소스코드를 특정업체에 납품하려고 한다. 개발된 소스코드들은 탭으로 들여쓰기가 된것, 공백으로 들여쓰기가 된 것들이 섞여 있다고 한다. A씨는 탭으로 들여쓰기가 된 모든 소스를 공백 4개로 수정한 후 납품할 예정이다.

// A씨를 도와줄 수 있도록 소스코드내에 사용된 탭(Tab) 문자를 공백 4개(4 space)로 바꾸어 주는 프로그램을 작성하시오.
public class Solution 
{
    
    public static void main(String[] arg)
    {
        String Text = "Today is\tMy Favorite\tPanda";
       

        System.out.println(Tap_To_Space(Text));
        System.out.print(Tap_To_Space("Te\tst"));

    }

    public static String Tap_To_Space(String text)
    {
        
        // \\w는 Whitespace을 의미하는 정규 표현식
        // \t 
        text = text.replaceAll("\t", "    ");

        return text;
    }
}
