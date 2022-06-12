package Level_1.NumberSolution;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution
{

    public int solution(String s)
    {
        String pattern = "(zero)|(one)|(two)|(three)|(four)|(five)|(six)|(seven)|(eight)|(nine)";

        String[] numberStr =
        { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        HashMap<String, String> numberMap = new HashMap<>();

        int answer = 0;
        boolean upperFlag = true;
        Pattern p = Pattern.compile(pattern);

        // 숫자(String) : 영어(String)를 매핑해서 HashMap에 담음
        for (int i = 0; i < 10; i++)
        {
            numberMap.put(numberStr[i], String.valueOf(i));
        }

        while (upperFlag)
        {
            Matcher m = p.matcher(s);
            boolean flag = m.find();
            if (flag)
            {
                String engStr = s.substring(m.start(), m.end());
                for (String eng : numberMap.keySet())
                {
                    if (eng.equals(engStr))
                    {
                        String number = numberMap.get(eng);
                        s = s.replace(engStr, number);
                    }
                }
            }
            upperFlag = m.find();
        }

        answer = Integer.parseInt(s);

        return answer;
    }
}