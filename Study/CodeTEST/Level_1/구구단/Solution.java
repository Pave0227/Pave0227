package Level_1.구구단;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] arg) {

        Solution Pavel = new Solution();
        Pavel.Solution1();
    }

    private void Solution1() {
        int n = 9;
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            temp.add(n * i);
        }

        temp.forEach(System.out::println);
    }
}
