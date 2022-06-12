package Level_1.아스키코드검출;

import java.util.List;

// 철이는 아스키코드에 대해 공부하고있었습니다.
import java.util.stream.Collectors;

// 하지만 기억력이 좋지않아 순서를 잊어먹게되는탓에 프로그램을 하나 만들어두려합니다.

// 문자를 입력받으면 그 문자에 해당하는 아스키코드를 출력하는 코드를 작성해주세요.

// 출력조건

// a는 아스키코드로 97입니다.

// d는 아스키코드로 100입니다.

// A는 아스키코드로 65입니다.
public class Solution {
    public static void main(String[] arg) {
        Solution Pavel = new Solution();
        Pavel.Solution1();
    }

    public void Solution1() {
        String test_msg = "aAdBC";
        String test = "A";
        char test2 = test.charAt(0);

        System.out.println((int) test2);

        List<Integer> ascii_list = test_msg.chars().boxed().collect(Collectors.toList());

        System.out.println(test.hashCode());

        ascii_list.stream().forEach(System.out::println);

    }
}
