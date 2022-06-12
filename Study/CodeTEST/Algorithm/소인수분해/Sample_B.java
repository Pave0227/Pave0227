package Algorithm.소인수분해;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample_B
{

    public static void main(String[] arg)
    {
        Sample_B Pavel = new Sample_B();
        Pavel.Sample();
    }

    private void Sample()
    {
        int x = 2;
        int number = 12;

        factors(number).forEach(System.out::print);
    }

    IntStream factors(int i)
    {
        // 1. 범위 지정 2 ~ i까지
        // 2. 범위내 숫자중 i가 나눠지는 숫자만 필터링
        // 3. mapToObj Stream<IntStream> 객체화(첫번째 내부 엘리먼트 선택 findFirst()로
        // Optional<IntStream>리턴 받은 후
        // OrElse로 IntStream으로 재반환) concat 내 재귀함수로 인수분해하고 해당 IntStream을 받아와 concat 하여
        // 스트림을 합친 후에 리턴합니다. (2,factors(12/2) -> (2,factors(6/2) -> 2번 조건 충족안되어 orElse에서
        // 지정한 Other 값 3이 리턴됨 -> (2,3) -> (2,2,3) 재귀완료후 완성된 인트스트림 값 리턴
        return IntStream.range(2, i).filter(x -> i % x == 0)
                .mapToObj(x -> IntStream.concat(IntStream.of(x), factors(i / x))).findFirst().orElse(IntStream.of(i));
    }
}
