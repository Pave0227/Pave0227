package Level_1.배열컨트롤;

// n개의 정수를 가진 배열이 있다. 이 배열은 양의정수와 음의 정수를 모두 가지고 있다. 이제 당신은 이 배열을 좀 특별한 방법으로 정렬해야 한다.

// 정렬이 되고 난 후, 음의 정수는 앞쪽에 양의정수는 뒷쪽에 있어야 한다. 또한 양의정수와 음의정수의 순서에는 변함이 없어야 한다.

// 예. -1 1 3 -2 2 ans: -1 -2 1 3 2.
public class Solution 
{
    public static void main(String[] arg)
    {
        int[] Int_List = {-1,1,3,-4,2,-3,0,-1,7 };
        int[] Cending_List;
        
        Solution Pavel = new Solution();
        Cending_List = Pavel.Cending_Order(Int_List);
        Pavel.Print_Int_Array(Cending_List);
        //

        Pavel.Bobble_Sort(Int_List, Int_List.length);
        Pavel.Print_Int_Array(Int_List);
    }

    public int[] Cending_Order(int[] int_list)
    {
    
        int[] result = new int[int_list.length];
        int f = 0;
        
        for(int temp : int_list)
        {
            if(temp < 0)
            {
                result[f] = temp;
                f++;
            }
        }
        for(int temp : int_list)
        {
            if(temp >= 0)
            {
                result[f] = temp;
                f++;
            }
        }
        return result;
    }

    public void Bobble_Sort(int[] list,int size)
    {
        //라운드는 배열크기 -1 만큼 진행합니다
        for(int i=1; i<size; i++)
        {
            boolean Swapped = false;
    
            //각 라운드별 비교횟수는 배열크기의 현재라운드를 뺸 만큼 비교
            for(int j=0; j<size-i; j++)
            {
                if(list[j] > 0 && list[j+1] < 0)
                {
                    swap(list , j , j+1);
                    Swapped = true;
                }   
            }

            //swap된적이 없다는 것은 정렬이 완료 되었다는 의미이므로 반복문을 종료한다
            if(Swapped == false)
            {
                break;
            }
        }
    }

    public void swap(int[] a,int i,int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void Print_Int_Array(int[] array)
    {
        for(int i=0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
