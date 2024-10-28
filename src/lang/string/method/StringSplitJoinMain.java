package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        // split()
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        String joinStr = "";
        for (String s : splitStr) {
            joinStr += s + "-";
        }

            System.out.println("joinStr : " + joinStr);

        // join()
        String join = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 : " + join);

        // 문자열 배열 연결
        String join1 = String.join("-", splitStr);
        System.out.println("연결된 배열 : " + join1);
    }
}
