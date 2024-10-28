package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        // spilt
        String[] fruitArr = fruits.split(",");
        for (String fruit : fruitArr) {
            System.out.println(fruit);
        }

        // join
        String join = String.join(" -> ", fruitArr);
        System.out.println(join);

    }
}
