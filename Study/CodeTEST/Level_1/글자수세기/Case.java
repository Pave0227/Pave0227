package Level_1.글자수세기;

public class Case 
{
    public static void main(String[] args) 
    {
        String str = "공백을 제외한\r\n" + "글자수만을 세는 코드 테스트";
        System.out.println(str.replaceAll("[^a-zA-Zㄱ-힣]", "").length());
    }
}