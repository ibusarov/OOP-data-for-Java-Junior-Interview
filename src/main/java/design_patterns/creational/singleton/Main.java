package design_patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {

        SomeSingleton x = SomeSingleton.getInstance();
        SomeSingleton y = SomeSingleton.getInstance();

        System.out.println("x: " + x.hashCode());
        System.out.println("y: " + y.hashCode());
    }
}
