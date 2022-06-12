package Level_1.특수문자검출;

public class Solution {

    public static void main(String[] args) {

        System.out.println("[Program Start]");
        System.out.println("");

        // 초기 변수 선언 실시
        String data = "admin123 *** ";
        System.out.println("원본 문자 : " + data);
        System.out.println("원본 길이 : " + data.length());
        System.out.println("");

        // 특수문자 제거 결과 확인
        String removeData = replaceSpecialString(data);
        System.out.println("특수문자 제거 결과 : " + removeData);
        System.out.println("특수문자 제거 길이 : " + removeData.length());
        System.out.println("");

    }// 메인 종료

    public static String replaceSpecialString(String value) {
        // 결과를 반환할 변수 선언 실시
        String result = "";

        /*
         * [설 명]
         * 1. matches 를 사용하면 정규식 만들 수 있습니다
         * 2. [^a-zA-Z0-9] - 공백도 특수 문자로 인식합니다
         * 3. [^a-zA-Z0-9\\s] - 공백은 특수 문자로 인식하지 않습니다
         * 4. 로직 - 특수문자 여부를 확인 합니다
         * 특수문자가 아닌 경우 숫자 및 문자 여부를 확인합니다
         */

        // for 반복문을 선언해서 문자 한글자씩 확인 실시
        for (int i = 0; i < value.length(); i++) {
            if (String.valueOf(value.charAt(i)).matches("[^a-zA-Z0-9]")) { // 특수문자 인 경우
                continue;
            } else { // 특수문자가 아닌 경우
                if (Character.isDigit(value.charAt(i))) { // 숫자인 경우
                    result += value.charAt(i); // 문자열 추가
                } else { // 문자인 경우
                    result += value.charAt(i); // 문자열 추가
                }
            }
        }

        // 결과 반환 실시
        return result;
    }

}// 클래스 종료
