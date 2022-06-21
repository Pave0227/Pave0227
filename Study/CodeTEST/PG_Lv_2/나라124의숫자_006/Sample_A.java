package PG_Lv_2.나라124의숫자_006;

// byte         8bits    -2^7 ~ 2^7-1 (-128 ~ 127)
// short       16bits    -2^15 ~ 2^15-1 (-32768 ~ 32767)
// int         32bits    -2^31 ~ 2^31-1 (-2147483648 ~ 2147483647)
// long        64bits    -2^63 ~ 2^63-1 (-9223372036854775808 ~ 9223372036854775807)
// float       32bits    0x0.000002P-126f ~ 0x1.fffffeP+127f
// double      64bits    0x0.0000000000001P-1022 ~ 0x1.fffffffffffffP+1023  
// char        16bits    \u0000 ~ \uffff (0 ~ 2^15-1) * 자바에서 unsgined로 동작하는 자료형
// boolean 1 bit true,false

public class Sample_A
{

    public static void main(String[] arg)
    {
        long start_time = System.currentTimeMillis();
        // todo -----------------------------------------------

        Sample_A Pavel = new Sample_A();
        Pavel.Sample();

        // todo -----------------------------------------------
        long end_time = System.currentTimeMillis();

        System.out.println("-----------------------------------------------");
        System.out.printf("%s%f%s", "수행시간 ", (float) (end_time - start_time) / 1000, "초");

    }

    // 효율성 테스트 불합격 (floor 함수호출떄문에 떨어지는 듯)
    private void Sample()
    {

        // 124

        int n = 9;

        // ! ---------------------------------------------------

        String[] oneTowFour =
        { "4", "1", "2" };

        String answer = ""; // 문자열로 반환

        while (n > 0)
        {
            answer = oneTowFour[n % 3] + answer;
            // 나머지가 0이면 -1 해준다. 124나라에선 0이란 숫자가 없기떄문에.
            n = (n % 3 == 0) ? n / 3 - 1 : (int) Math.floor(n / 3);
        }

        // return answer;

    }
}
