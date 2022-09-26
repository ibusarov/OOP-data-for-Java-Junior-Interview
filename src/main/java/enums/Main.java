package enums;

public class Main {
    public static void main(String[] args) {
        Vegetables apple = Vegetables.APPLE;

        System.out.println(apple.ordinal());
        System.out.println(apple.name());
        System.out.println(Vegetables.APPLE);
        System.out.println(Vegetables.valueOf("BANANA"));

    }
}
