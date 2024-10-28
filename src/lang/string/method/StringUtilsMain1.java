package lang.string.method;

public class StringUtilsMain1 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // valueOf 메서드
        String numStr = String.valueOf(num);
        System.out.println("숫자를 문자열로 변환 : " + numStr);
        String boolStr = String.valueOf(bool);
        System.out.println("boolean 값을 문자열로 변환 : " + boolStr);
        String objStr = String.valueOf(obj);
        System.out.println("객체를 문자열로 변환 : " + objStr);

        // 문자 + ? = 문
        String numStr2 = "" + num;
        System.out.println("빈 문자열 + 숫자 : " + numStr2);

        // toCharArray 메서드
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환 : " + strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}
