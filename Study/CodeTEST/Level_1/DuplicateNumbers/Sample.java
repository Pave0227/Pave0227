package Level_1.DuplicateNumbers;

import java.util.Scanner;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] arg) {
        Sample Pavel = new Sample();
        Pavel.Sample1();
    }

    private void Sample1() {
        Scanner sc = new Scanner(System.in);
        boolean test = false;

        loop: while (true) {
            int[] n_arr = Stream.of(String.valueOf(sc.nextLine()).split("")).mapToInt(Integer::parseInt).toArray();
            int Overlap = 0;

            for (int i = 0; i <= 9; i++) {

                // 숫자을 비교
                for (int temp : n_arr) {
                    if (temp == i) {
                        ++Overlap;
                    }
                }

                // 같은게 아예 없거나 2번이상 있으면 false
                if (Overlap == 0 || Overlap > 1) {
                    break loop;
                }
                Overlap = 0;

            }
            test = true;
            break;
        }

        System.out.println(test);

    }
}
