package record;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Pesho", 12);

        System.out.println(cat.name());
        System.out.println(cat);

        cat.something();
    }
}
