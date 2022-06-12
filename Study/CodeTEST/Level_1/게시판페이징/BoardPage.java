package Level_1.게시판페이징;

import java.util.Scanner;

public class BoardPage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("총 건수를 입력해주세요.");
        int total = sc.nextInt();

        System.out.println("한 페이지에 보여줄 게시물수를 입력해 주세요.");
        int item = sc.nextInt();

        int page = total / item;

        if(total % item == 0) 
        {
            System.out.println("필요한 페이지의 수는 " + page + "입니다.");
        } 
        else 
        {  
            System.out.println("필요한 페이지의 수는 " + ++page  + "입니다.");
        }

        sc.close();
    }
}