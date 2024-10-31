package time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);
        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println(ofDate);

        // 계산(불변)
        ofDate = ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10d : " + ofDate);
    }
}
