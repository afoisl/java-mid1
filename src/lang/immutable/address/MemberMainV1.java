package lang.immutable.address;

public class MemberMainV1 {

    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 a = new MemberV1("회원A", address);
        MemberV1 b = new MemberV1("회원B", address);

        // 회원A, 회원B 의 처음 주소는 모두 서울
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 회원B 의 주소를 부산으로 변경해야
        a.getAddress().setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
