package PG_Lv_1.문자열내마음대로;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Stream;

// byte         8bits    -2^7 ~ 2^7-1 (-128 ~ 127)
// short       16bits    -2^15 ~ 2^15-1 (-32768 ~ 32767)
// int         32bits    -2^31 ~ 2^31-1 (-2147483648 ~ 2147483647)
// long        64bits    -2^63 ~ 2^63-1 (-9223372036854775808 ~ 9223372036854775807)
// float       32bits    0x0.000002P-126f ~ 0x1.fffffeP+127f
// double      64bits    0x0.0000000000001P-1022 ~ 0x1.fffffffffffffP+1023  
// char        16bits    \u0000 ~ \uffff (0 ~ 2^15-1) * 자바에서 unsgined로 동작하는 자료형
// boolean 1 bit true,false

public class Sample_B
{

    public static void main(String[] arg)
    {
        long start_time = System.currentTimeMillis();
        // todo -----------------------------------------------

        Sample_B Pavel = new Sample_B();
        Pavel.Sample();

        // todo -----------------------------------------------
        long end_time = System.currentTimeMillis();

        System.out.println("------------------------------------------------");
        System.out.printf("%s%f%s", "수행시간 ", (float) (end_time - start_time) / 1000, "초");
    }
 
    // ! 밸브간 정렬이 제대로 안됨 
    private void Sample()
    {
        String[] strings =
        { "abce", "abcd", "cdx" };

        final int n = 2;

        Arrays.sort(strings);

        System.out.println(Arrays.toString(strings));

        HashMap<String, String> map_str = new HashMap<>();

        // ! ---------------------------------------------------

        for (String str : strings)
        {
            System.out.println(str.charAt(n));
            map_str.put(str, Character.toString(str.charAt(n)));
        }

        List<Entry<String, String>> list = new ArrayList<>(map_str.entrySet());

        list.sort(Entry.comparingByValue());

        String[] result = new String[list.size()];

        for (int x = 0; x < list.size(); x++)
        {
            result[x] = list.get(x).getKey();
        }
        // ? Test ----------------------------------------------

        System.out.println(Arrays.toString(result));

        System.out.println("================================================");
    }

}
