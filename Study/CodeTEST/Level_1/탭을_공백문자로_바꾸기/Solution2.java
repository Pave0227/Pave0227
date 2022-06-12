package Level_1.탭을_공백문자로_바꾸기;

import java.io.*;

public class Solution2 
{
    public static void main(String[] arg)
    {
    try{
        //파일로부터 입력받음
        File input_file = new File("input.txt");
        FileReader fileReader = new FileReader(input_file);
        BufferedReader reader = new BufferedReader(fileReader);     
        //출력 대상 파일 설정
        FileWriter fileWriter = new FileWriter("output.txt");
        BufferedWriter writer = new BufferedWriter(fileWriter);

        int input_ascii;

        while( ( input_ascii = reader.read() ) != -1 ){
            //문자하나하나는 아스키로 받아와서 char형으로 변환하여 사용
            char input_char = (char)input_ascii;

            if( input_char == 9 ){
                //tab의 아스키코드는 9, 공백의 아스키코드는 32
                input_char = 32;
                //탭만나면 공백 4번
                for( int i=1; i<=4; i++){
                    writer.write( input_char );
                    //System.out.print(input_char);
                }
            }
            else{   //탭 아닌 다른 문자들은 그냥 그대로 출력
                writer.write( input_char );
                //System.out.print(input_char);
            }

        }
        writer.close(); //안닫아주면 안됨
        reader.close();

    }
    catch(Exception ex){

    }
}
}
