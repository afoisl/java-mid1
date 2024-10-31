package lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
//        Random random = new Random();
        Random random = new Random(1); // seed 가 같으면 Random 의 결과가 같다.

        int i = random.nextInt();
        System.out.println("i = " + i);

        double v = random.nextDouble();
        System.out.println("v = " + v);

        boolean b = random.nextBoolean();
        System.out.println("b = " + b);

        // 범위 조회
        int randomRange = random.nextInt(10);
        System.out.println("0 ~ 9 = " + randomRange);

        int randomRange2 = random.nextInt(10) + 1;
        System.out.println("1 ~ 10 = " + randomRange2);
    }
}
