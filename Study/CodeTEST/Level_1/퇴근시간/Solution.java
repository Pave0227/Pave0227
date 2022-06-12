package Level_1.퇴근시간;

import java.time.LocalTime;
import java.util.Calendar;

// 현우는 성인이되어 회사에입사했다.

// 하지만 들어간기업이 하필 할일없는 중소기업이라

// 퇴근시간까지 놀다가 퇴근시간에 퇴근하는것이 일상화가되어버렸다..

// 현우는 심심한지라 좀더효율적으로놀기위해

// 현재부터 퇴근시간까지 남은시간을 알려주는 계산기를 만들어

// 계산적으로놀고싶었다 우리가현우를 도와주자!!

// (참고로 현우의퇴근시간은 17시30분이다)

// input: 현재시간

// output: 남은시간 : hh:mm:ss

// or

// 남은시간 : s

// 심화버젼 : 이쁘게꾸며보자!
public class Solution {
    public static void main(String[] arg) {
        Solution Pavel = new Solution();
        Pavel.Solution1();
        Pavel.Solution2();
    }

    private void Solution1() {

        Calendar cal = Calendar.getInstance();
        Calendar n = Calendar.getInstance();
        Calendar fin = Calendar.getInstance();

        cal.set(2022, 0, 0, 17, 30, 00);

        int fin_hour = cal.get(Calendar.HOUR_OF_DAY) - n.get(Calendar.HOUR_OF_DAY);
        int fin_min = cal.get(Calendar.MINUTE) - n.get(Calendar.MINUTE);
        int fin_sec = cal.get(Calendar.SECOND) - n.get(Calendar.SECOND);

        int second = (fin_hour * 3600) + (fin_min * 60) + (fin_sec);

        if (fin_hour < 0) {
            fin_hour = 24 + fin_hour;
        }
        if (fin_min < 0) {
            fin_min = 60 + fin_min;
        }
        if (fin_sec < 0) {
            fin_sec = 60 + fin_sec;
        }

        fin.set(2020, 0, 0, fin_hour, fin_min, fin_sec);

        System.out.println(n);
        System.out.printf("현재시간은 %tT", n);
        System.out.printf("\n퇴근시간은 %tT", cal);
        System.out.printf("\n남은시간은 %tT", fin);
        System.out.printf("\n초로 환산시 %d초", second);

    }

    private void Solution2() {
        LocalTime cur_time = LocalTime.now();
        LocalTime out_time = LocalTime.of(17, 30, 00);

        LocalTime fin_time = out_time.minusHours(cur_time.getHour()).minusMinutes(cur_time.getMinute())
                .minusSeconds(cur_time.getSecond()).minusNanos(cur_time.getNano());

        System.out.printf("\n현재시간은 %tT", cur_time);
        System.out.printf("\n퇴근시간은 %tT", out_time);
        System.out.printf("\n남은시간은 %tT", fin_time);
        System.out.printf("\n초로 환산시 %d초", fin_time.getHour() * 3600 + fin_time.getMinute() * 60 + fin_time.getSecond());

    }
}
