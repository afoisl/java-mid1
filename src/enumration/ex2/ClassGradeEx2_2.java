package enumration.ex2;

public class ClassGradeEx2_2 {

    public static void main(String[] args) {
        int price = 10000;

        // 매개변수 타입을 보고 main 개발자가 ClassGrade 를 새로 생성할 가능 성이 있음
        // 해결방법 -> ClassGrade 의 기본생성자에 접근하지 못하도록 private 으로 설정

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(ClassGrade.BASIC, price);
        int gold = discountService.discount(ClassGrade.GOLD, price);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);

    }
}
