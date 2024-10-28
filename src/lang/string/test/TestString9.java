package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] split = email.split("@");
        String part1 = split[0];
        String part2 = split[1];

        System.out.println("ID = " + part1);
        System.out.println("Domain = " + part2);
    }
}
