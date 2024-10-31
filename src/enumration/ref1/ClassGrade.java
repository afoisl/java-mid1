package enumration.ref1;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade(10); // x001
    public static final ClassGrade GOLD = new ClassGrade(20); // x002
    public static final ClassGrade DIAMOND = new ClassGrade(39); // x003

    private final int discountPercent;

    // 생성자를 private 으로 막아놓으면 main 에서 생성자를 호출하는 오류를 방지할 수 있음
    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
