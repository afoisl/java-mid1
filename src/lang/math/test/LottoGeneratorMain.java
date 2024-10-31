package lang.math.test;

import java.util.Random;

public class LottoGeneratorMain {

    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();

        int[] generator = lottoGenerator.generator();

        System.out.print("로또 번호 : ");
        for (int i : generator) {
            System.out.print(i + " "    );
        }
    }
}
