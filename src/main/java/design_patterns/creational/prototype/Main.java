package design_patterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        ConcretePrototype p = new ConcretePrototype("10");
        ConcretePrototype p1 = (ConcretePrototype) p.clone();


        System.out.println(p1);
    }
}
