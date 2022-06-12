package Level_1.예외던지기;

import java.util.Random;

class OddException extends Exception {
}

public class Solution {

    static void execute(int n) {
        System.out.printf("입력 숫자: %d\n", n);
        try {
            if (n % 2 == 1) {
                throw new OddException();
            }
            System.out.println("짝수입니다.");

        } catch (OddException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws OddException {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            execute(r.nextInt(10));
        }

    }
}