package lang.wrapper;

public class MyIntegerMethodMain1 {

    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);

        int i = myInteger.compareTo(5);
        int i1 = myInteger.compareTo(10);
        int i2 = myInteger.compareTo(20);

        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);


    }
}