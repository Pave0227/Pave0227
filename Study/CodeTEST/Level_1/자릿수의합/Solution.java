package Level_1.자릿수의합;

// 초보자 프로그래머 홍길동은 사용자가 입력한 양의정수(범위는 int)각 자리수를 더해 출력하는 프로그램을 만들고 싶어한다. ex) 5923의 결과는 5+9+2+3인 19이다 ex) 200의 결과는 2+0+0인 2이다 ex) 6719283의 결과는 6+7+1+9+2+8+3인 36이다.
public class Solution {
    public static void main(String[] arg) {
        Solution Pavel = new Solution();
        Pavel.Solution1();
    }

    private void Solution1() {
        int n = 212312;

        String[] n_arr = Integer.toString(n).split("");

        int nt = 0;

        for (int x = 0; x < n_arr.length; x++) {
            nt += Integer.parseInt(n_arr[x]);
        }

        System.out.println(nt);
    }

}
