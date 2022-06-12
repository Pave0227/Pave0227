package JAVA_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Sample_List {
    public static void main(String[] args) {

        // Sample Pavel = new Sample();
    }

    public void Method() {
        Sample_List Pavel = new Sample_List();
        Pavel.String_join();
        Pavel.Map_Remove();
        Pavel.Set();
        Pavel.Enum();
        Pavel.Foreach();
    }

    private void String_join() {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        System.out.println(myList); // [Life, is, too, short] 출력
        String msg = String.join(" ", myList);

        System.out.println(msg);
    }

    private void Map_Remove() {
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);

        System.out.println(grade.remove("B"));
    }

    private void Set() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(numbers); // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출력
        HashSet<Integer> Number_Set = new HashSet<>(numbers);
        System.out.println(Number_Set);
    }

    private void Enum() {
        enum CoffeeType {
            AMERICANO(3000, 100),
            ICE_AMERICANO(4000, 100),
            CAFE_LATTE(5000, 100);

            private final int price;

            CoffeeType(int price, int num) {
                this.price = price;

            }

        }
        CoffeeType temp = CoffeeType.AMERICANO;
        System.out.println(String.format("가격은 %d원 입니다.", CoffeeType.AMERICANO.price));

        System.out.println(String.format("가격은 %d원 입니다.", temp.price));

    }

    private void Foreach() {
        int[] marks = { 70, 60, 55, 75, 95, 90, 80, 80, 85, 100 };
        int number = 0;

        for (int i : marks) {
            number += i;
        }

        System.out.println(number / marks.length);
    }
}