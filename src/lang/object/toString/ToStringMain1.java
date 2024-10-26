package lang.object.toString;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object o = new Object();
        String str = o.toString();

        // toString() 출력
        System.out.println(str);

        // object 직접 출력
        System.out.println(o);
    }
}
