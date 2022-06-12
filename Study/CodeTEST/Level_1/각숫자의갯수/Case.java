package Level_1.각숫자의갯수;

public class Case 
{
    public static void main(String[] args)
    {   
        Case Pavel = new Case();

        Pavel.Case2();
    }

    public void Case2()
    {
        int total = 0;

        for(int i=10; i<=1000; i++){

            Integer num     = i; 
            int cnt         = 1;
            // 정수을 String화
            String value    = num.toString();
            //문자열을 char 배열화
            char[] chArray  = value.toCharArray();

            for( char ch : chArray)
            {
                //지정된 유니코드 문자가 나타내는 int 값을 반환합니다
                cnt *= Character.getNumericValue(ch);
            }

            total += cnt; 
        }

        System.out.println(total);
    }
}
