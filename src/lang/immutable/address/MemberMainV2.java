package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 a = new MemberV2("회원A", address);
        MemberV2 b = new MemberV2("회원B", address);

        // 회원A, 회원B 의 처음 주소는 모두 서울
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 회원B 의 주소를 부산으로 변경해야 함
//        b.getAddress().setValue(); // 컴파일 오류
        b.setAddress(new ImmutableAddress("대구"));
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b );

    }
}
