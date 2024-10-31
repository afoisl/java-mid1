package lang.math.test;

import java.util.Random;

public class LottoGenerator {
        private final Random random = new Random();
        private int[] numbers;
        private int count;

    public int[] generator() {
        numbers = new int[6];
        count = 0;

        while (count < 6) {
            // 1부터 45 사이의 숫자 생성
            int number = random.nextInt(45) + 1;
            // 중복되지 않는 경우에만 배열에 추가
            if (isUnique(number)) {
                numbers[count] += number;
                count++;
            }
        }
        return numbers;
    }

    // 중복 검열 메서드
    public boolean isUnique(int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return false;
            }
        }
        return true;
    }
}
