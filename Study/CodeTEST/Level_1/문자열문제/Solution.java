package Level_1.문자열문제;

import java.util.*;

// 주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하세요.

// 이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌

// 김씨와 이씨는 각각 몇 명 인가요?
// "이재영"이란 이름이 몇 번 반복되나요?
// 중복을 제거한 이름을 출력하세요.
// 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
public class Solution 
{
    public static void main(String[] arg)
    {
        String[] Employee_List = {"이유덕","이재영","권종표","이재영","박민호","강상희","이재영","김지완","최승혁","이성연","박영서","박민호","전경헌","송정환","김재성","이유덕","전경헌"};
        String[] OverLap_List; //중복 제거한 리스트

        Solution Pavel = new Solution();

        Pavel.Name_Check(Employee_List);
        Pavel.Printnn();
        OverLap_List = Pavel.Name_Overlap_Eliminate(Employee_List);
        Pavel.StringArray_Print(OverLap_List);
        Pavel.Printnn();
        Pavel.Name_OverLap_Check(Employee_List);
        
    }

    //method
    public void Name_Check(String[] Check_List)
    {
        int Kim_Name = 0;
        int Lee_Name = 0;

        //인덱스오브 "김"이라는 문자열의 인덱스값이 0, 즉 첫번째 문자열이면 성이 김씨인 이름을 확인할 수 있다
        for(String Listed : Check_List)
        {
            if(Listed.indexOf("김") == 0)
            {
                ++Kim_Name;
            }
            if(Listed.indexOf("이") == 0)
            {
                ++Lee_Name;
            }
        }

        System.out.println("김씨는 " +Kim_Name+ " 명입니다");
        System.out.println("이씨는 " +Lee_Name+ " 명입니다");
    }

    public void Name_OverLap_Check(String[] Overlap_List)
    {
        Arrays.sort(Overlap_List);
        
        int Overlap_Count = 0;
        
        int leng = Overlap_List.length;

        for(int i=0; i<leng; i++)
        {
            if(Overlap_List[i] == "중복됨")
            continue;

            for(int f=0; f<leng; f++)
            {
                if(Overlap_List[i] == Overlap_List[f])
                {
                    if(i==f)
                    {
                     continue;   
                    }
                    Overlap_List[f] = "중복됨";
                    ++Overlap_Count;
                }
                
                
            }

            if(Overlap_Count == 0 && Overlap_List[i] != null)
            {
                System.out.println(Overlap_List[i]+ "는 중복이 없습니다");
            }

            if(Overlap_Count > 0 && Overlap_List != null)
            {
            System.out.println(Overlap_List[i]+ "는 " +(Overlap_Count+1)+ "번 중복되었습니다");
            Overlap_Count = 0;
            }
        }
    }

    //중복검출 및 오름차순 정렬
    public String[] Name_Overlap_Eliminate(String[] Overlap_List)
    {
        //오름차순 정렬
        Arrays.sort(Overlap_List);


        int leng = Overlap_List.length;
        String[] Temp_List = new String[leng];

        int j=0;

        if(leng == 0 || leng == 1)
        {
            System.out.println("중복을 검출하기 위한 최소 조건인 2개이상의 값이 존재하지 않습니다");
            return Overlap_List; 
        }

        for(int i=0; i<leng-1;i++)
        {
            //배열의 i번쨰,i+1번째 값이 같지않으면, 임시배열에 값을 부여한다
            if(Overlap_List[i] != Overlap_List[i+1])
            {
                Temp_List[j++] = Overlap_List[i];
            }
        }

        //마지막 값을 부여, 앞 반복문에서 마지막 중복검출이 끝난 후
        Temp_List[j] = Overlap_List[leng-1];
        

        return Temp_List;
    }

    public void Name_Ascending(String[] Ascending_List)
    {
        Arrays.sort(Ascending_List);

        for(String templist : Ascending_List)
        {
            System.out.println(templist);
        }
    }

    public void Printnn()
    {
        System.out.println("-----------------------------------");
    }

    public void StringArray_Print(String[] Array)
    {
        for(String temp : Array)
        {
            if(temp != null)
            System.out.println(temp);
        }
    }



}
