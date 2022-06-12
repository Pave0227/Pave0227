package Level_1.배열컨트롤;

import java.util.*;

public class Solution3 
{
    

 //JAVA

    private static Scanner scan = new Scanner(System.in);
    private static String strSort = new String();
    private static String[] sorts = null;

    public static void main(String[] args) {

        System.out.println("n개의 정수를 가진 배열을 입력하시오: ");

        strSort = scan.nextLine();
        sorts = strSort.split(" ");

        for(String sort : sorts) if( sort.startsWith("-") ) System.out.print(sort + " ");

        for(String sort : sorts) if( !sort.startsWith("-") ) System.out.print(sort + " ");
    }


    
}
