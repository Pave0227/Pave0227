package PG_Lv_1.소수만들기;

import java.util.ArrayList;
import java.util.Arrays;

// todo 주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

// ? 배열 값 3개의 합 중 가장 큰값을 구해, 해당 값 이하의 존재가능한 소수값을 리스트에 넣고, 3개의 배열값의 합의 경우의 수 중에 소수값리스트 와 같은 값이 있으면 경우의 수에 추가함
public class Sample_A
{

    public static void main(String[] arg)
    {
        Sample_A Pavel = new Sample_A();
        Pavel.Sample_A();
    }

    private void Sample_A()
    {
        int[] nums =
        { 1, 2, 3, 4 };

        Arrays.sort(nums);

        ArrayList<Integer> decimal = new ArrayList<>();

        // 배열에서 가장 큰값 3개을 합한 값의 소수 값들을 리스트 decimal에 저장
        int max = nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];

        // 소수면 리스트에 저장함
        for (int i = 3; i <= max; i++)
        {
            for (int y = 2; y <= i; y++)
            {
                if (i % y == 0)
                {
                    break;
                }
                if (y == i - 1)
                {
                    decimal.add(i);
                }
            }
        }

        int answer = 0;

        for (int i = 0; i < nums.length; i++)
        {
            for (int y = i + 1; y < nums.length; y++)
            {
                for (int z = y + 1; z < nums.length; z++)
                {
                    // 해당 값이 소수값이면 경우의 수에 추가함
                    if (decimal.indexOf(nums[i] + nums[y] + nums[z]) > 0)
                    {
                        ++answer;
                    }
                }
            }
        }

        System.out.print(answer);
    }

}
