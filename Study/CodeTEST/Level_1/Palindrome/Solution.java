package Level_1.Palindrome;

// 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다. 두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다. 세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?
public class Solution 
{
    public static void main(String[] arg)
    {
        Solution Pavel = new Solution();
        Pavel.Solution1();
    } 

    public void Solution1()
    {
        boolean end = false;
        int mul = 0;
        int max = 0;
        String msg;
        for(int i = 999; i>=100; i--)
        {
            if(end)
            {
                break;
            }
            for(int y = 999; y>=100; y--)
            {
                
                mul = i*y;
                //문자열 비교을 위해 String화한다.
                msg = Integer.toString(mul);
                
                //비교 분석을 위한 임시 문자열 temp
                String temp = "";

                for(int k = msg.length()-1; k>=0; k-- )
                {
                    //인덱스 마지막 열부터 거꾸로 삽입
                    temp += msg.charAt(k);
                }

                //거꾸로 삽입된 문자열 숫자가 기존 숫자와 같으면 Int값을 삽입해주고 출력 한다
                if(msg.equals(temp))
                {
                    mul = Integer.parseInt(temp);

                    if(max < mul)
                    max = mul;
                    
                    
                }
                
            
            
            }

        }
        System.out.println(max);
        
    }
}
