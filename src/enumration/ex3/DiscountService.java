package enumration.ex3;

import enumration.ex2.ClassGrade;

import static enumration.ex3.Grade.*;

public class DiscountService {

    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        // enum 은 static import 를 사용해서 가독성 높은 코드를 만들 수 있다.
        if (grade == BASIC) {
            discountPercent = 10;
        } else if (grade == GOLD) {
            discountPercent = 20;
        } else if (grade == DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println(grade + "등급은 할인 대상이 아닙니다.");
        }
        return price * discountPercent / 100;
    }
}
