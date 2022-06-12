package PG_Lv_1.숫자문자열과영단어;

public class Sample
{
    public static void main(String[] arg)
    {
        Sample Pavel = new Sample();
        Pavel.Sample1();
    }

    private void Sample1()
    {
        String s = "one4seveneight";
        String[] words =
        { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        for (int i = 0; i < words.length; i++)
        {
            s = s.replaceAll(words[i], String.valueOf(i));
        }

        System.out.print(s);
    }

}
