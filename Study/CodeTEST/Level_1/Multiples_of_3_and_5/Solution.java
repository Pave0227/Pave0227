package Level_1.Multiples_of_3_and_5;



// 100미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
//1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
public class Solution 
{
    int Select_Number = 0;

    public static void main(String[] arg)
    {
        Solution Pavel = new Solution();
        Pavel.Int_Print_Test(Multiple(1000));
    }

    public static int Multiple(int Select_Number)
    {
        //배수의 합
        int Sub = 0;
        

        //3의 배수을 합산한다. 5의 배수와 중복되는 수는 배제
        for(int i=0; i<Select_Number; i+=3)
        {
            if(i%5 != 0)
            {
                Sub += i;
            }
        }

        //5의 배수 합산
        for(int i=0; i<Select_Number; i+=5)
        {
            Sub += i;
        }

        return Sub;
    }

    public void Int_Print_Test(int i)
    {
        System.out.println(i);
    }
}
