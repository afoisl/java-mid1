package time;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime time = LocalTime.of(9, 10, 30);

        System.out.println("nowTime = " + nowTime);
        System.out.println("time = " + time);

        // 계산(블변)
        LocalTime ofTimePlus = time.plusSeconds(30);
        System.out.println("ofTimePlus = " + ofTimePlus);
    }
}
