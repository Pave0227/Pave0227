package PG_Lv_1.신규아이디추천;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sample
{

    public static void main(String[] arg)
    {
        Sample Pavel = new Sample();
        Pavel.Sample1();

    }

    private void Sample1()
    {
        String new_id = ".......!@BaT#*..y.abcdefghijklm";

        // 소문자변환 , ._-을 제외한 특수문자 제거, .문자가 2개이상 이어지면 1개로 수정, 문자열의 시작과 끝에 .문자가 있으면 제거
        String answer = new_id.toLowerCase().replaceAll("[^0-9a-z._-]", "").replaceAll("[.]{2,}", ".")
                .replaceAll("^[.]|[.]$", "");

        // 문자열이 비어있으면 a을 추가
        if (answer.isEmpty())
            answer = "a";

        // 문자열이 15글자가 넘으면 15글자로 수정하고, 끝이 .문자이면 제거한다
        if (answer.length() > 15)
            answer = answer.substring(0, 15).replaceAll("[.]$", "");

        // 문자열의 길이 2글자이하이면, 마지막글자을 3글자이상 될때까지 추가한다
        while (answer.length() <= 2)
            answer += answer.charAt(answer.length() - 1);

        System.out.print(answer);
    }
}
