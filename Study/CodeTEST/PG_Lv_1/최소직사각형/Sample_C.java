package PG_Lv_1.최소직사각형;

public class Sample_C
{

    public static void main(String[] arg)
    {
        Sample_C Pavel = new Sample_C();
        Pavel.Sample();
    }

    private void Sample()
    {
        int[][] sizes =
        {
                { 14, 4 },
                { 19, 6 },
                { 6, 16 },
                { 18, 7 },
                { 7, 11 } };

        int length = 0, height = 0;
        for (int[] card : sizes)
        {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;

        System.out.print(answer);
    }
}
