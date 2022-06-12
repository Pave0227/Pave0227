package Level_1.시저암호;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 시저 암호는, 고대 로마의 황제 줄리어스 시저가 만들어 낸 암호인데, 예를 들어 알파벳 A를 입력했을 때, 그 알파벳의 n개 뒤에 오는(여기서는 예를 들 때 3으로 지정하였다)알파벳이 출력되는 것이다. 예를 들어 바꾸려는 단어가 'CAT"고, n을 5로 지정하였을 때 "HFY"가 되는 것이다.
// 어떠한 암호를 만들 문장과 n을 입력했을 때 암호를 만들어 출력하는 프로그램을 작성해라.
public class Solution {
    public static void main(String[] arg) {
        Solution Pavel = new Solution();
        Pavel.Solution_1();
    }

    public void Solution_1() throws IndexOutOfBoundsException {

        // 설정한 숫자 이후로 암호설정 3이면 A입력시 (BC) D 출력
        int radius = 5;

        String Alpabat = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        ArrayList<String> Alp_List = new ArrayList<>(Arrays.asList(Alpabat.split("")));

        String Input = "WXY";
        ArrayList<String> user_list = new ArrayList<>(Arrays.asList(Input.split("")));

        int y = 0;

        for (int i = 0; i < Alp_List.size(); i++) {

            try {
                if (user_list.get(y).equals(Alp_List.get(i))) {

                    // 알파벳 z이후 범주 넘을시 다시 A부터 시작
                    if (i + radius > Alp_List.size()) {
                        user_list.set(y, Alp_List.get((i + radius) - Alp_List.size()));
                        ++y; // 다음글자로
                        i = 0; // 알파벳 처음부터 다시 확인
                        continue;
                    }

                    user_list.set(y, Alp_List.get(i + radius));
                    ++y;
                    i = 0;
                }
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }

        user_list.stream().forEach(System.out::print);
    }

}
