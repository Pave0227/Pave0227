package Level_1.파일시스템;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter(new FileWriter("c:/abc.txt"));

        pw.println("AAA");
        pw.println("BBB");
        pw.println("CCC");
        pw.println("DDD");
        pw.println("EEE");

        pw.close();

        BufferedReader br = new BufferedReader(new FileReader("c:/abc.txt"));

        ArrayList<String> data = new ArrayList<>();

        while (true) {
            String line = br.readLine();
            if (line == null)
                break;
            data.add(line);
        }
        // 리스트 뒤집기
        // Collections.reverse(data);

        // String[] temp = data.toArray(new String[0]);

        // Arrays.sort(temp, Collections.reverseOrder());

        data.sort(Collections.reverseOrder());

        data.forEach(System.out::println);

        PrintWriter pw2 = new PrintWriter(new FileWriter("c:/abc.txt"));

        data.forEach(pw2::println);

        pw2.close();

    }
}