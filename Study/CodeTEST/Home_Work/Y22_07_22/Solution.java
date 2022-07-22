package Home_Work.Y22_07_22;

class Data
{
    int data;
    int n;
}

class Test
{
    int n;
}

public class Solution
{
    public static void main(String[] arg)
    {
        Solution Pavel = new Solution();
        Pavel.solution();
    }

    private void solution()
    {
        Data d = new Data();
        Test t = new Test();
        t.n = 100;

        d.data = 100;
        d.n = 100;
        System.out.println("메인에서의 data : " + d.data);
        // Call_By_Value(d.n);
        System.out.println("메인에서의 data : " + d.data);
        Call_By_Reference(t);

    }

    static void Call_By_Value(int n)
    {
        n = 2000;

        System.out.println("함수에서의 데이터 : " + n);
    }

    static void Call_By_Reference(Test t) // 매개변수로 클래스 주소을 넘겨준다.
    {
        t.n = 2000;
        System.out.println("함수에서의 데이터 : " + t.n);
    }

}
