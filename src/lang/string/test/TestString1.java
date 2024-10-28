package lang.string.test;

public class TestString1 {

    public static void main(String[] args) {
        String url1 = "http://www.example.com";

        boolean result = url1.startsWith("http://");
        System.out.println(result);
    }
}
