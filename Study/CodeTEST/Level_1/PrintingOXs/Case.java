package Level_1.PrintingOXs;

import java.util.*;

public class Case 
{ 
    public static void main(String[] args) 
    {
      Case Pavel = new Case();
      Pavel.Case1();
    }  

    public void Case1()
    {
        Scanner sc = new Scanner(System.in);
        int input = Integer.valueOf(sc.nextLine());
        sc.close();

        

        for (int i = 0; i < input; i++)
        {
            //String.format 서식 설정 input 크기만큼 글자수설정 10진수 integer 형식
            // 설정된 2진수 숫자이외에 남는 부분은 0으로 채우고, 마지막으로 0,1로 구성된 String을 O,X로 변환해 출력
            System.out.println(
                    String.format("%0" + input + "d", Integer.valueOf(Integer.toBinaryString((int) (Math.pow(2, i + 1)-1)))).replaceAll("0", "O").replaceAll("1", "X"));
                    }

    }

    
}
