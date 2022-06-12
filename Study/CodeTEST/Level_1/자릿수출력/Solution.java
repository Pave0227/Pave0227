package Level_1.자릿수출력;

// 양의 정수만 입력으로 받고 그 수의 자릿수를 출력해보자. ex1) 3 > 1자리수, ex2) 649 > 3자리수 ....

public class Solution 
{
    public static void main(String[] arg)
    {
        Solution Pavel = new Solution();
        //Pavel.Solution1();
        //Pavel.Case1();
        Pavel.Test_Area();
    }   
    
    public void Solution1()
    {
        int n = 3234124;

        String[] n_array = Integer.toString(n).split("");

        System.out.println(n_array.length);
    }

    //Math.log10 input을 넣으면 해당수의 10의 승수을 출력한다 
    public void Case1()
    {
        int input = 507000;

        int result = (int)Math.pow(10, (int)(Math.log10(input)));

        System.out.println(result + "자리수");
    }

    public void Test_Area()
    {
        int input = 10000;
        double result = Math.log10(input);
        System.out.println(result);
    }
}
