package Level_1.버전비교;

import java.util.*;

// A씨는 두 개의 버전을 비교하는 프로그램을 작성해야 한다.

// 버전은 다음처럼 "." 으로 구분된 문자열이다.

// 버전 예) 1.0.0, 1.0.23, 1.1

// 두 개의 버전을 비교하는 프로그램을 작성하시오.

// 다음은 버전 비교의 예이다.

// 0.0.2 > 0.0.1
// 1.0.10 > 1.0.3
// 1.2.0 > 1.1.99
// 1.1 > 1.0.1

public class Solution {

    public static void main(String[] arg) {
        Solution Pavel = new Solution();
        String ver[][] = Version_Create();

        Pavel.Version_Check(ver);
    }

    public static String[][] Version_Create() {
        Scanner sc = new Scanner(System.in);
        String Version;

        String[][] Version_Array = new String[2][3];

        for (int i = 0; i < Version_Array.length; i++) {
            System.out.println("버전 정보을 입력해주십시오");
            Version = sc.nextLine();
            Version_Array[i] = Version.split("[.]");
        }

        sc.close();
        return Version_Array;

    }

    // 버전 두개만 비교가능한 기능 버전
    public void Version_Check(String[][] ver) {
        // 1은 왼쪽이 큼 0은 같음 -1은 오른쪽이 큼
        int version_case = 0;

        int i = 0;
        int y = 0;
        while (i < ver.length) {
            if (Integer.parseInt(ver[i][y]) > Integer.parseInt(ver[i + 1][y])) {
                version_case = 1;
                break;
            }
            if (Integer.parseInt(ver[i][y]) < Integer.parseInt(ver[i + 1][y])) {
                version_case = -1;
                break;
            } else
                y++;
        }

        switch (version_case) {
            case -1:
                System.out.println("오른쪽 버전이 더 높은 버전입니다.");
                break;

            case 0:
                System.out.println("버전이 같습니다.");
                break;

            case 1:
                System.out.println("왼쪽 버전이 더 높은 버전입니다.");
                break;
        }

    }

}
