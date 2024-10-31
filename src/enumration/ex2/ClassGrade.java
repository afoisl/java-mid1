package enumration.ex2;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // 기본 생성자를 private 으로 막아놓으면 main 에서 생성자를 호출하는 오류를 방지할 수 있음
    private ClassGrade() {}
}
