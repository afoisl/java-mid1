package lang.object.poly;

public class ObjectPolyExample2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object o = new Object(); // Object 인스턴스도 만들 수 있다.

        Object[] objects = {dog, car, o};

        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객채의 수 : " + objects.length);
    }
}
