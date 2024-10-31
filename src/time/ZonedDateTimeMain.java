package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {

    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("nowZdt = " + nowZdt);

        LocalDateTime idt = LocalDateTime.of(2030, 1, 1, 13, 30, 17);
        ZonedDateTime zdt = ZonedDateTime.of(idt, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt = " + zdt);

        // 다른 나라 시간
        ZonedDateTime utc = zdt.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utc = " + utc);
    }
}
