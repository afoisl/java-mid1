package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2022, 9, 22, 3, 10, 9);
        System.out.println("now = " + now);
        System.out.println("ofDt = " + ofDt);

        // 날짜와 시간 분리
        LocalDate date = ofDt.toLocalDate();
        LocalTime time = ofDt.toLocalTime();
        System.out.println("date = " + date);
        System.out.println("time = " + time);

        // 날짜와 시간 합체
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println("dateTime = " + dateTime);

        // 계산(불변)
        LocalDateTime plusDays = ofDt.plusDays(1000);
        System.out.println("plusDays = " + plusDays);
        LocalDateTime plusYears = ofDt.plusYears(1);
        System.out.println("plusYears = " + plusYears);

        // 비교
        System.out.println("현재 날짜시간이 지정 날짜 시간보다 이전인가? " + now.isBefore(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜 시간보다 이후인가? " + now.isAfter(ofDt));

    }
}
