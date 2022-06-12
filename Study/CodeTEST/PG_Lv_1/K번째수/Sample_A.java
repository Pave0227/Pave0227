package PG_Lv_1.K번째수;

import java.util.Arrays;

// todo 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때,k번째에 있는 수를 구하려 합니다.

// todo 예를 들어 array가[1,5,2,6,3,7,4],i=2,j=5,k=3 이라면

// todo array의 2 번째부터 5 번째까지 자르면[5,2,6,3]입니다.1 에서 나온 배열을 정렬하면[2,3,5,6]입니다.2 에서 나온 배열의 3 번째 숫자는 5 입니다.배열 array,[i,j,k]를 원소로 가진 2 차원 배열 commands가 매개변수로 주어질 때,commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요. 

public class Sample_A
{

    public static void main(String[] arg)
    {
        Sample_A Pavel = new Sample_A();
        Pavel.Sample_A();
    }

    private void Sample_A()
    {
        int[] array =
        { 1, 5, 2, 6, 3, 7, 4 };
        int[][] commands =
        {
                { 2, 5, 3 },
                { 4, 4, 1 },
                { 1, 7, 3 } };

        int[] result = new int[commands.length];

        int count = 0;

        for (int[] com : commands)
        {
            int x = com[0] - 1;
            int y = com[1];
            int z = com[2] - 1;

            int[] temp = Arrays.copyOfRange(array, x, y);
            Arrays.sort(temp);

            // Arrays.stream(temp).forEach(System.out::print);
            // System.out.println("");
            result[count] = temp[z];

            ++count;
        }

        // return result;
        // Arrays.stream(result).forEach(System.out::print);

    }
}