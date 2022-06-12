package Level_1.Palindrome;

public class Case 
{

    public static void main(String[] arg)
    {
        //생성자
        Case Pavel = new Case();
        //메소드 호출
        Pavel.Case1();
    }

    public void Case1()
    {
        StringBuffer s = new StringBuffer();
        StringBuffer rs = new StringBuffer();
        boolean end = false;

        for(int i=900 ; i>=100 ; i--)
        {
            for(int j=999 ; j>=100 ; j--)
            {
                s.append(i*j);
                rs.append(s).reverse();

                if( s.toString().equals(rs.toString()) )
                {
                    System.out.println(i*j + "(= "+i+" x "+j+")");
                    end = true;
                }
                else
                {
                    s.setLength(0);
                    rs.setLength(0);
                }
                if(end) break;
            }
            if(end) break;
        }
    }
}

