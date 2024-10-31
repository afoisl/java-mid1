package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        // 원하는 zoneId 의 정보를 얻을 수 있음
        // systemDefault()
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId = " + zoneId);

        // 타임존을 직접 제공
        ZoneId id = ZoneId.of("Asia/Seoul");
        System.out.println("id = " + id);
    }
}
