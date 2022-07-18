package Algorithm.힙정렬;

import java.util.Arrays;

public class Heap
{

    public static void main(String[] arg)
    {
        Heap new_heap = new Heap(10);

        new_heap.add(3);
        new_heap.add(4);
        new_heap.add(2);
        new_heap.add(1);
        new_heap.add(6);
        new_heap.add(7);
        new_heap.add(5);
        new_heap.upheap();
        System.out.println(Arrays.toString(new_heap.element));
    }

    private int[] element; // element[0] contains length
    private static final int ROOTLOC = 1;
    private static final int DEFAULT = 10;

    // 생성자 Heap
    public Heap(int size)
    {
        if (size > DEFAULT)
        {
            element = new int[size + 1];
            element[0] = 0;
        }
        else
        {
            element = new int[DEFAULT + 1];
            element[0] = 0;
        }
    }

    public void add(int newnum)
    {

        // 배열의 길이와 2가 크거나 같으면
        if (element.length <= element[0] + 1)
        {
            // 일시적 배열 =
            int[] elementTemp = new int[element[0] * 2];

            for (int x = 0; x < element[0]; x++)
            {
                elementTemp[x] = element[x];
            }
            element = elementTemp;
        }
        element[++element[0]] = newnum;
        upheap();
    }

    public int extractRoot()
    {
        int extracted = element[1];
        element[1] = element[element[0]--];
        downheap();
        return extracted;
    }

    public void upheap()
    {
        int locmark = element[0];
        while (locmark >= 1 && element[locmark / 2] > element[locmark])
        {
            swap(locmark / 2, locmark);
            locmark /= 2;
        }
    }

    public void downheap()
    {
        int locmark = 1;
        while (locmark * 2 <= element[0])
        {
            if (locmark * 2 + 1 <= element[0])
            {
                int small = smaller(locmark * 2, locmark * 2 + 1);
                swap(locmark, small);
                locmark = small;
            }
            else
            {
                swap(locmark, locmark * 2);
                locmark *= 2;
            }
        }
    }

    public void swap(int a, int b)
    {
        int temp = element[a];
        element[a] = element[b];
        element[b] = temp;
    }

    public int smaller(int a, int b)
    {
        return element[a] < element[b] ? a : b;
    }
}