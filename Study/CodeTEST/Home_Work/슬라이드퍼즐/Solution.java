package Home_Work.슬라이드퍼즐;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution
{
    // ! Deprocated Class
    public class Index
    {
        private int x;
        private int y;

        public Index(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] arg)
    {

        Solution Pavel = new Solution();
        Pavel.solution();
    }

    private void solution()
    {

        Scanner scanner = new Scanner(System.in);

        boolean game_status = false;

        int[][] puzzle = new int[4][4];

        int[] arr = IntStream.rangeClosed(0, 15).toArray();

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Collections.shuffle(list);

        // !
        // ============================================================================

        for (int y = 0; y < puzzle.length; y++)
        {
            for (int x = 0; x < puzzle[0].length; x++)
            {
                puzzle[y][x] = list.get((y * puzzle[x].length) + x);
            }
        }

        game: while (!game_status)
        {
            // 2차원 배열의 인덱스정보을 가지는 2차원 배열 인덱스
            int[][] index = new int[arr.length][2];

            System.out.println("================================");

            // 퍼즐 상태 출력
            for (int[] puz : puzzle)
            {
                System.out.println(Arrays.toString(puz));
            }
            System.out.println("================================");

            System.out.println("바꿀 숫자을 입력하세요");

            int temp = scanner.nextInt();

            // 인덱스 정보 2차원배열에 저장
            for (int x = 0; x < puzzle.length; x++)
            {
                for (int y = 0; y < puzzle[x].length; y++)
                {
                    index[puzzle[x][y]][0] = x;
                    index[puzzle[x][y]][1] = y;
                }
            }

            // x축이 같으면 = 가로축이 같으면
            if (index[temp][0] == index[0][0])
            {
                int x = index[0][0];
                // 0의 y 좌표
                int y_0 = index[0][1];
                // 변경 대상의 y 좌표
                int y_temp = index[temp][1];

                if (y_0 > y_temp)
                {
                    for (int y = y_0; y > y_temp; y--)
                    {
                        puzzle[x][y] = puzzle[x][y - 1];
                    }

                    puzzle[x][y_temp] = 0;
                }
                else if (y_0 < y_temp)
                {
                    for (int y = y_0; y < y_temp; y++)
                    {
                        puzzle[x][y] = puzzle[x][y + 1];
                    }

                    puzzle[x][y_temp] = 0;
                }

            }
            // y축이 같으면 = 세로축이 같으면
            else if (index[temp][1] == index[0][1])
            {

                int y = index[0][1];
                // 0의 x 좌표
                int x_0 = index[0][0];
                // 변경 대상의 x 좌표
                int x_temp = index[temp][0];

                if (x_0 > x_temp)
                {
                    for (int x = x_0; x > x_temp; x--)
                    {
                        puzzle[x][y] = puzzle[x - 1][y];
                    }

                    puzzle[x_temp][y] = 0;
                }
                else if (x_0 < x_temp)
                {
                    for (int x = x_0; x < x_temp; x++)
                    {
                        puzzle[x][y] = puzzle[x + 1][y];
                    }

                    puzzle[x_temp][y] = 0;
                }
            }
            else
            {
                System.out.println("잘못 입력했어요");
                continue game;
            }

            // 게임 완료 체크
            finish: for (int x = 0; x < puzzle.length; x++)
            {
                for (int y = 0; y < puzzle[x].length; y++)
                {
                    // 마지막 배열요소이고 0이면 완료(반복문 체크 다 돈 후에)
                    if (x == 3 && y == 4 && puzzle[x][y] == 0)
                    {
                        break finish;
                    }
                    // 조건에 부합하지 않으면 게임 진행
                    else if ((x * 4) + y + 1 != puzzle[x][y])
                    {
                        continue game;
                    }
                }
            }

            // 반복문 통과시
            game_status = true;

        }

        System.out.println("게임을 깼습니다.");
    }
}
