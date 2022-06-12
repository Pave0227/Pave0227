package JAVA_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// ? 클래스 --------------------------------------------------------
class Math {

    Integer value;

    // ! 생성자
    Math() {
        this.value = 0;
    }

    Math(int i) {
        this.value = i;
    }

    // ? 메소드
    void add(int val) {
        this.value += val;
    }

    Integer getValue() {
        return this.value;
    }

    boolean isOdd() {
        if (this.value % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    int avg(int[] i) {

        this.value = Arrays.stream(i).sum() / i.length;
        // this.value = IntStream.of(i).sum();
        return getValue();

    }

    int avg(ArrayList<Integer> i) {
        this.value = i.stream().mapToInt(Integer::intValue).sum() / i.size();

        // this.value = i.stream().mapToInt(e -> e).sum() / i.size();

        return getValue();
    }

}

// ? 클래스 상속 --------------------------------------------------------
class UpgradeMath extends Math {

    void minus(int val) {
        this.value -= val;
    }

}

class MaxLimitMath extends UpgradeMath {

    @Override
    void add(int val) {

        this.value += val;

        if (this.value > 100) {
            this.value = 100;
        }

    }

}

// todo 메인 --------------------------------------------------------
public class Calculator {
    public static void main(String[] arg) {
        int[] data = { 1, 3, 5, 7, 9 };
        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));

        MaxLimitMath cal = new MaxLimitMath();
        cal.add(50);
        cal.add(60);
        System.out.println(cal.getValue());
        System.out.println(cal.isOdd());

        System.out.println(cal.avg(data));
        System.out.println(cal.avg(data2));

    }
}
