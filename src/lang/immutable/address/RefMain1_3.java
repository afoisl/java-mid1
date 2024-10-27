package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울"); // x001
        Address b = a; // x001

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("대구");
        System.out.println("대구 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
