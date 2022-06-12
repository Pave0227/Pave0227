package PG_Lv_1.두개뽑아서더하기;

import java.util.Arrays;
import java.util.HashSet;

public class Sample_A
{

    /**
     * 순열 : n 개 중에서 r 개를 순서있게 뽑기 시간복잡도: O(n!)
     */
    static HashSet<Integer> result_set = new HashSet<>();

    public static void main(String[] args)
    {
        Sample_A Pavel = new Sample_A();
        Pavel.Sample();
    }

    private void Sample()
    {
        int[] arr =
        { 2, 1, 3, 4, 1 };
        int[] output = new int[2];
        boolean[] visited = new boolean[arr.length];
        Perm(arr, output, visited, 0, 2);
        result_set.forEach(System.out::print);

        // result_set.stream().sorted().mapToInt(Integer::valueOf).toArray();
    }

    // 사전순으로 순열 구하기

    static private void Perm(int[] arr, int[] output, boolean[] visited, int depth, int reach)
    {
        if (depth == reach)
        {
            result_set.add(Arrays.stream(output).sum());
            return;
        }

        for (int i = 0; i < arr.length; i++)
        {
            if (visited[i] != true)
            {
                visited[i] = true; // ? 방문 표시
                output[depth] = arr[i];
                Perm(arr, output, visited, depth + 1, reach); // ! 재귀 !
                visited[i] = false;
            }
        }
    }

}
