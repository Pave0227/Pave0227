package Level_1.DashInsert;

import java.util.Scanner;
import java.util.*;
// DashInsert 함수는 숫자로 구성된 문자열을 입력받은 뒤, 문자열 내에서 홀수가 연속되면 두 수 사이에 - 를 추가하고, 짝수가 연속되면 * 를 추가하는 기능을 갖고 있다. (예, 454 => 454, 4546793 => 454*67-9-3) DashInsert 함수를 완성하자. 출처

// 입력 - 화면에서 숫자로 된 문자열을 입력받는다.
// "4546793"
// 출력 - *, -가 적절히 추가된 문자열을 화면에 출력한다.
// "454*67-9-3"

public class Solution {
    public static void main(String[] arg) {
        Solution Pavel = new Solution();
        Pavel.Solution1();
    }

    public void Solution1() {
        String msg = "4129834128";
        StringBuffer sb = new StringBuffer(msg);

        String[] test = msg.split("");

        System.out.println(test[1]);
        ArrayList<Integer> intlist = new ArrayList<>();

        for (int y = 0; y < msg.length(); y++) {
            intlist.add(Character.getNumericValue(msg.charAt(y)));
        }

        for (int i = 0; i < msg.length() - 1; i++) {

            if (intlist.get(i) % 2 == 0 && intlist.get(i + 1) % 2 == 0) {
                sb.insert(i + 1, "*");
            }

            if (intlist.get(i) % 2 != 0 && intlist.get(i + 1) % 2 != 0) {
                sb.insert(i + 1, "-");
            }
        }

        System.out.print(sb);
    }

}
