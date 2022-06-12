package Level_1.DashInsert;
import java.util.Scanner;
import java.util.ArrayList;

public class Case 
{

    public static void main(String[] arg)
    {

    }
    public void Case1()
    {
        Scanner Sc = new Scanner(System.in);
        ArrayList<String> num = new ArrayList<String>();
  
        System.out.print("숫자를 입력하시오 :");
        String input = Sc.nextLine();
  
        String[] array = input.split("");
  
        for(int l = 0; l<array.length; l++) 
        {
           num.add(l,array[l]);
        }

        for(int k = 0; k<num.size()-1; k++) 
        {
           if(num.get(k).contentEquals("-")||num.get(k).contentEquals("*")) 
           {
               continue;
           }
           else if(Integer.parseInt(num.get(k))%2 == 0 && Integer.parseInt(num.get(k+1))%2 == 0) 
           {
              num.add(k+1,"*");
           }
           else if(Integer.parseInt(num.get(k))%2==1 && Integer.parseInt(num.get(k+1))%2 == 1) 
           {
              num.add(k+1,"-");
           }
        }
        
        for(String j : num) 
        {
           System.out.print(j);
        }
        Sc.close();
    }
}

 
