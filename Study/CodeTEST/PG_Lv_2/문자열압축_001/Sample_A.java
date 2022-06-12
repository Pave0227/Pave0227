package PG_Lv_2.문자열압축_001;

import java.util.ArrayList;
import java.util.Arrays;

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

    private void Sample()
    {
        String s = "zxxxxxxxxxx";

        int result = 0;

        int send = 0;

        // ! ---------------------------------------------------

        if (s.length() == 1)
        {
            send = 1;
        }

        // 자를수 있는 가장 큰수부터 자름
        for (int x = s.length() / 2; x > 0; x--)
        {
            String[] test = new String[s.length() % x != 0 ? s.length() / x + 1 : s.length() / x];

            // 잘라서 배열에 할당
            for (int y = 0; y < test.length; y++)
            {
                // 글자 자르되 마지막 문자열부분 길이가 부족한 경우 문자열 끝까지만 자름
                test[y] = s.substring(y * x, (y + 1) * x > s.length() ? s.length() : (y + 1) * x);
            }

            // 문자열이 연속되는지 판단
            boolean row = false;
            // 해당 분해한 문자열을 압축했을때 문자열의 길이
            result = 0;
            // 문자열이 연속될때 해당 문자가 몇번 반복했는가 ex) 10, 100 자릿수가 변경되면 문자열 길이가 늘어남
            int re = 1;

            // ! result에 숫자을 더하는 것은 z-1내 값을 기본적으로 더한다
            for (int z = 1; z < test.length; z++)
            {
                // 문자열이 ㅇ
                if (test[z - 1].equals(test[z]))
                {
                    // 연속되면 문자열의 길이 차이없음
                    if (row)
                    {
                        ++re;
                        // 자릿수 증가시 문자열 길이 증가
                        if (re == 10)
                        {
                            result += 1;
                        }
                        else if (re == 100)
                        {
                            result += 1;
                        }
                        continue;
                    }
                    else
                    {
                        ++re;
                        result += x + 1;
                        row = true;
                    }
                }
                else
                {
                    re = 1;

                    // 연속되던 중 같지않을 때
                    if (row)
                    {
                        row = false;
                        // 검사하는 배열 z가 마지막 배열이고 z-1과 같지 않으면 z값만 추가
                        if (z == test.length - 1)
                        {
                            result += test[z].length();
                        }
                        continue;
                    }

                    // z-1값 추가
                    result += test[z - 1].length();

                    if (z == test.length - 1)
                    {
                        result += test[z].length();
                    }
                    row = false;
                }
            }

            if (send > result || send == 0)
            {
                send = result;
            }

            System.out.println(Arrays.toString(test));
            System.out.println(result);
        }

        System.out.println(send);

    }
}
