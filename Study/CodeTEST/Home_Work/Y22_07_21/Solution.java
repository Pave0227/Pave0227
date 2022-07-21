package Home_Work.Y22_07_21;

public class Solution
{
    class Student
    {
        // 멤버 변수
        int number;
        String name;
        int age;
        int height;
        int weight;

        private Student(int number, String name, int age, int height, int weight)
        {
            this.number = number;
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        private void Print()
        {
            System.out.println(number + "번\t" + name + "\t" + age + "살\t" + height + "CM\t" + weight + "KG");
        }

    }

    public static void main(String[] arg)
    {

        Solution Pavel = new Solution();
        // Pavel.solution();
        Pavel.solution_2();
    }

    private void solution()
    {
        char[] ch_arr =
        { 'a', 'b', 'c' };
        String str = new String(ch_arr);
        char[] temp = str.toCharArray();

        // 객체지향

        // 1. 코드 재사용성이 높다.
        // 새로운 코드를 작성할때 기존의 코드를 이용해서 쉽게 작성할 수 있다.

        // 2. 코드의 관리가 용이하다. 코드간의 관계를 이용해서 적은 노력으로 쉽게 코드를 변경할수 있다.

        // 3. 신뢰성이 높은 프로그래밍을 가능하게 한다. 제어, 메서드등을 데이터
        // 올바른 값을 유지하도록 한다 -> 코드의 중복을 제거하고 코드의 불일치로 인한 오작업

        // 클래스란? : 객체를 정의해 놓은것. 객체의 설계도.,
        // 클래스의 용도 : 객체를 생성하는 용도

        // 객체(Object) : 사전적 의미로는 실제로 존재하는 것

        // 객체와 인스턴스
        // 클래스로부터 객체를 만드는 과정을 클래스의 인스턴스화 라고 한다.
        // 어떤 클래스로부터 만들어진 객체는 그 클래스의 인스턴스다.

        // TV클래스로부터 만들어진 객체를 TV클래스의 인스턴스이다.

        // 객체의 구성
        // 속성 , 기능

        // 선언 클래스명 변수명;

    }

    private void solution_2()
    {
        Student[] student_arr = new Student[10];

        String[] str_arr =
        { "김상우", "이장언", "이상순", "이예림", "고예지", "최상훈", "한예림", "류지석", "유재석", "정형돈" };

        for (int i = 0; i < student_arr.length; i++)
        {
            int age = (int) (Math.random() * 10) + 20;
            int height = (int) (Math.random() * 20) + 160;
            int weight = (int) (Math.random() * 30) + 50;

            student_arr[i] = new Student(i, str_arr[i], age, height, weight);
            student_arr[i].Print();

        }
    }
}
