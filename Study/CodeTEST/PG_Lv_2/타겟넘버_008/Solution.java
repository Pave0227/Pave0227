package PG_Lv_2.타겟넘버_008;

public class Solution
{
    int answer = 0;

    public static void main(String[] arg)
    {
        Solution solution = new Solution();

        int[] arr =
        { 4, 1, 2, 1 };
        int test = 4;
        System.out.println(solution.solution(arr, test));

    }

    public int solution(int[] numbers, int target)
    {

        DFS_Search(numbers, target, 0, 0);
        return answer;
    }

    private void DFS_Search(int[] numbers, int target, int sum, int try_time)
    {
        if (sum == target && try_time == numbers.length)
        {
            ++answer;
            return;
        }
        else if (try_time == numbers.length)
        {
            return;
        }

        DFS_Search(numbers, target, sum + numbers[try_time], try_time + 1);
        DFS_Search(numbers, target, sum - numbers[try_time], try_time + 1);
    }

}
