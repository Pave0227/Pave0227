package Level_1.글자수세기;

public class Solution 
{
    public static void main(String[] arg)
    {
        Solution Pavel = new Solution();
        Pavel.Solution1();
    }    

    public void Solution1()
    {

        String msg = "Pavel is\n Smart";
        String[] msg_arr = msg.split("");

        int letter = msg_arr.length;

        for(int i=0; i<msg_arr.length; i++)
        {
            if(msg_arr[i].isBlank())
            {
                --letter;
            }
        }

        System.out.println(letter);
    }
}
