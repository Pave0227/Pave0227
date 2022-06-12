package JAVA_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class HeavyWork implements Runnable {
    String name;

    HeavyWork(String name) {
        this.name = name;
    }

    public void work() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100); // 0.1 초 대기한다.
            } catch (Exception e) {
            }
        }
        System.out.printf("%s done.\n", this.name);
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        work();
    }
}

public class Sample {
    public static void main(String[] args) throws InterruptedException {
        int[] numbers = { 1, 2, 3, 4, 5 };
        ArrayList<Integer> temp = (ArrayList<Integer>) Arrays.stream(numbers).filter((a) -> a % 2 != 0)
                .map((a) -> a * 2).boxed().collect(Collectors.toList());

        temp.forEach(System.out::println);

        int[] numbers1 = { 1, -2, 3, -5, 8, -3 };
        int[] result = Arrays.stream(numbers1).filter((a) -> a >= 0).toArray();

        Arrays.stream(result).forEach(System.out::println);
        long start = System.currentTimeMillis();
        ArrayList<Thread> arr = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            Thread w = new Thread(new HeavyWork("w" + i));
            arr.add(w);
            w.start();
        }
        for (Thread t : arr) {
            t.join();
        }
        long end = System.currentTimeMillis();
        System.out.printf("elapsed time:%s ms\n", end - start);
    }
}