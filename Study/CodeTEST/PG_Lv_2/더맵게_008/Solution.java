package PG_Lv_2.더맵게_008;

import java.util.PriorityQueue;

class Solution
{
    public int solution(int[] scoville, int K)
    {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue();

        // 자료구조에 맵기 추가
        for (int aScoville : scoville)
        {
            heap.offer(aScoville);
        }

        // 첫번째 값이 K보다 낮으면
        while (heap.peek() <= K)
        {
            if (heap.size() == 1)
            {
                return -1;
            }
            // 첫번째 값 반환후 제거
            int a = heap.poll();
            int b = heap.poll();

            // 결과값
            int result = a + (b * 2);

            // 결과값 추가
            heap.offer(result);
            answer++;
        }
        return answer;
    }
}