package Level_1.Int배열중복제거;

import java.util.*;  

public class Solution
{  

    //임시배열을 이용한 중복배열값 제거
public static int remove_Duplicate_Elements(int arr[], int n){  
        //중복을 검출하려면 최소 값이 2개이상이 있어야함
        if (n==0 || n==1)
        {  
            return n;  
        }

        //검츨대상 배열과 같은 크기의 임시배열 생성
        int[] tempA = new int[n];  
        //임시배열의 값을 초기화해주기위해 배열의 0번째부터 조정
        int j = 0;  

        //ex)length가 6이면 배열값은 0~5까지 있음
        for (int i=0; i<n-1; i++)
        {  
            //배열 i번째,i+1번째 값이 같지않다면 임시배열에 값을 부여
            if (arr[i] != arr[i+1])
            {  
                tempA[j++] = arr[i];  
            }  
        }
        //검출 작업이후 마지막값을 임시배열에 부여
        tempA[j++] = arr[n-1];      
        
        //임시배열에 중복을 제거한 값을 다시 검출대상 배열에 초기화
        for (int i=0; i<j; i++)
        {  
            arr[i] = tempA[i];  
        }

        //중복을 제거한 배열 크기값을 리턴
        return j;  
    }  
       
    public static void main (String[] args) {  
        
        int arr[] = {11,7,2,2,7,8,8,8,3}; 

        //오름차순 정렬
        Arrays.sort(arr); 
        
        int length = arr.length;  
        length = remove_Duplicate_Elements(arr, length);   
        
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }
}