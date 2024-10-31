package enumration.test;

public class AuthGradeMain {

    public static void main(String[] args) {
        AuthGrade[] grades = AuthGrade.values();
        for (AuthGrade grade : grades) {
            printGrade(grade);
        }
    }

    public static void printGrade(AuthGrade grade) {
        System.out.println("grade = " + grade.name() +
                            ", level = " + grade.getLevel() +
                            ", description = " + grade.getDescription());
    }
}
