package PG_Lv_2.컬러링북_003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// byte         8bits    -2^7 ~ 2^7-1 (-128 ~ 127)
// short       16bits    -2^15 ~ 2^15-1 (-32768 ~ 32767)
// int         32bits    -2^31 ~ 2^31-1 (-2147483648 ~ 2147483647)
// long        64bits    -2^63 ~ 2^63-1 (-9223372036854775808 ~ 9223372036854775807)
// float       32bits    0x0.000002P-126f ~ 0x1.fffffeP+127f
// double      64bits    0x0.0000000000001P-1022 ~ 0x1.fffffffffffffP+1023  
// char        16bits    \u0000 ~ \uffff (0 ~ 2^15-1) * 자바에서 unsgined로 동작하는 자료형
// boolean 1 bit true,false

public class Sample_A
{
    static int[] dx =
    { -1, 1, 0, 0 };
    static int[] dy =
    { 0, 0, -1, 1 };

    // 한 영역의 넓이을 일시적으로 저장하는 전역변수
    static int temp_cnt = 0;

    public static void main(String[] arg)
    {
        long start_time = System.currentTimeMillis();
        // todo -----------------------------------------------

        Sample_A Pavel = new Sample_A();
        Pavel.Sample();

        // todo -----------------------------------------------
        long end_time = System.currentTimeMillis();

        System.out.println("-----------------------------------------------");
        System.out.printf("%s%f%s", "수행시간 ", (float) (end_time - start_time) / 1000, "초");

    }

    private void Sample()
    {
        int m = 6;
        int n = 4;

        int[][] picture =
        {
                { 1, 2, 3, 0 },
                { 1, 2, 2, 0 },
                { 1, 0, 0, 1 },
                { 0, 0, 0, 1 },
                { 0, 0, 0, 3 },
                { 0, 0, 0, 3 } };

        // 영역의 갯수,최대 넓이
        int area_num = 0;
        int max_area = 0;

        boolean[][] check = new boolean[m][n];

        // ! ---------------------------------------------------

        for (int x = 0; x < m; x++)
        {
            for (int y = 0; y < n; y++)
            {
                // 해당 그림영역이 비어 있지 않고, 확인한 영역이 아니면
                if (picture[x][y] != 0 && !check[x][y])
                {
                    area_num++; // 영역의 수 증가
                    DFS(x, y, picture, check);
                }

                // 영역 탐색 종료 후, 최대 넓이가 갱신 가능하면
                if (temp_cnt > max_area)
                {
                    max_area = temp_cnt;
                }
                temp_cnt = 0;
            }
        }

        // 영역 전체 탐색 종료 후

        int[] answer = new int[2];

        answer[0] = area_num;
        answer[1] = max_area;

        System.out.println(Arrays.toString(answer));
    }

    public static void DFS(int x, int y, int[][] picture, boolean[][] check)
    {
        check[x][y] = true;

        temp_cnt++;

        for (int i = 0; i <= 3; i++)
        {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 만약 탐색하려는 영역이 그림의 전체 영역을 벗어나면 다음 영역을 확인합니다.
            if (nx < 0 || nx >= picture.length || ny < 0 || ny >= picture[0].length)
            {
                continue;
            }
            // 현재 영역과 탐색영역의 색이 같고, 체크한적 없는 영역이면
            else if (picture[x][y] == picture[nx][ny] && !check[nx][ny])
            {
                // 탐색 영역 주변을 재귀하여 다시 체크합니다.
                DFS(nx, ny, picture, check);
            }

        }

    }
}
