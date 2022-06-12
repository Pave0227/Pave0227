package Level_1.모스부호;

import java.util.HashMap;

public class Sample
{
    public static void main(String[] arg)
    {
        Sample Pavel = new Sample();
        Pavel.Sample1();
    }

    // ! 메소드 ----------------------------------------------------

    private void Sample1()
    {

        HashMap test = Mose();
        String msg = ".... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--";
        String[] msg_arr = msg.split("  ");
        StringBuffer sb = new StringBuffer();

        for (String temp : msg_arr)
        {
            String[] word = temp.split(" ");

            for (String temp2 : word)
            {
                sb.append(test.get(temp2));
            }

            sb.append(" ");
        }

        System.out.print(sb);

    }

    private HashMap<String, String> Mose()
    {
        HashMap<String, String> mosekey = new HashMap<>();

        mosekey.put(".-", "A");
        mosekey.put("-...", "B");
        mosekey.put("-.-.", "C");
        mosekey.put("-..", "D");
        mosekey.put(".", "E");
        mosekey.put("..-.", "F");
        mosekey.put("--.", "G");
        mosekey.put("....", "H");
        mosekey.put("..", "I");
        mosekey.put(".---", "J");
        mosekey.put("-.-", "K");
        mosekey.put(".-..", "L");
        mosekey.put("--", "M");
        mosekey.put("-.", "N");
        mosekey.put("---", "O");
        mosekey.put(".--.", "P");
        mosekey.put("--.-", "Q");
        mosekey.put(".-.", "R");
        mosekey.put("...", "S");
        mosekey.put("-", "T");
        mosekey.put("..-", "U");
        mosekey.put("...-", "V");
        mosekey.put(".--", "W");
        mosekey.put("-..-", "X");
        mosekey.put("-.--", "Y");
        mosekey.put("--..", "Z");

        return mosekey;
    }
}
